package br.com.pokedex.configurations.connection.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.pokedex.configurations.connection.ConnectionFactory;
import br.com.pokedex.entity.attack.Attacks;
import br.com.pokedex.entity.pokemon.Pokemon;
import br.com.pokedex.entity.type.Types;

// TODO refatorar classe para tornar-la mais generica
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

    //#region SELECT
    public List<Types> selectTypes() {
        try {
            String sql = "select id_type, type from type order by type;";
            Statement stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            List<Types> types = new ArrayList<>();

            while(resultado.next()) {
                Long idType = resultado.getLong("id_type");
                String type = resultado.getString("type");
                types.add(new Types(idType, type));
            }
            return types;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Attacks> selectAttacks() {
        try {
            String sql = "select id_attack, attack, base_demage, required_level, type from attack";
            Statement stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            List<Attacks> attacks = new ArrayList<>();
            
            while(resultado.next()) {
                Long idAttack = resultado.getLong("id_attack");
                String attack = resultado.getString("attack");
                Long baseDemage = resultado.getLong("base_demage");
                Long requiredLevel = resultado.getLong("required_level");
                Long type = resultado.getLong("type");
                attacks.add(new Attacks(idAttack, attack, baseDemage, requiredLevel, type));
            }
            return attacks;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pokemon> selectPokemons() {
        try {
            String sql = "select id_pokemon, name, hp, level from pokemon order by id_pokemon;";
            Statement stmt = getConnection().createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            List<Pokemon> pokemons = new ArrayList<>();

            while(resultado.next()) {
                Long idPokemon = resultado.getLong("id_pokemon");
                String name = resultado.getString("name");
                Long hp = resultado.getLong("hp");
                Long level = resultado.getLong("level");
                pokemons.add(new Pokemon(idPokemon, name, hp, level));
            }
            return pokemons;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //#endregion

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
