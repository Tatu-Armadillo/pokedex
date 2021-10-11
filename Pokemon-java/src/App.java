import java.util.ArrayList;
import java.util.List;

import attack.Attacks;
import pokemons.Pokemon;
import type.Types;

public class App {
    public static void main(String[] args) throws Exception {

        Types fire = new Types(1L, "Fire");
        List<Types> types = new ArrayList<>();
        types.add(fire);

        Attacks investida = new Attacks(5L, "investida", 8L, 1L, fire);
        List<Attacks> attackCharmander = new ArrayList<>();
        attackCharmander.add(investida);

        Pokemon charmander = new Pokemon(4L, "Charmander", 10L, 1L, types, attackCharmander);

        System.out.println("Fim do programa");
    }
}
