import connection.dao.DAO;


public class App {
    public static void main(String[] args) throws Exception {

        DAO dao = new DAO();
        
        // System.out.println( "Podekex: " +  dao.selectPokemons());
        // System.out.println( "Attack: " +  dao.selectPokemons());
        System.out.println( "Type: " +  dao.selectTypes());

        dao.close();
        System.out.println("Fim do programa");
    }
}
