import java.util.ArrayList;
import java.util.List;

import pokemons.Charmander;
import pokemons.Pokemon;
import pokemons.Squirtle;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pokemon> pokedex = new ArrayList<>();
        // String[] types = { "Fire", "Air" };

        Charmander charmander = new Charmander(4L, "Charmander", 8.5, 0.6, 25L, "Fire", 25L);
        Squirtle squirtle = new Squirtle(6L, "Squirtle", 9.0, 0.5, 25L, "Water", 23L);

        pokedex.add(charmander);
        pokedex.add(squirtle);
        System.out.println(pokedex);

        System.out.println("Fim do programa");
    }
}
