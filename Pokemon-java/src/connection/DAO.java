package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection connection;

    public Long include(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            add(stmt, atributos);
            if (stmt.executeUpdate() > 0) {
                ResultSet resultado = stmt.getGeneratedKeys();
                if (resultado.next()) {
                    return resultado.getLong(1);
                }
            }
            return -1L;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            connection = null;
        }
    }

    private void add(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if (atributo instanceof Long) {
                stmt.setInt(indice, (Integer) atributo);
            }
            indice++;
        }
    }

    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        connection = ConnectionFactory.getConnection();
        return connection;

    }

}
