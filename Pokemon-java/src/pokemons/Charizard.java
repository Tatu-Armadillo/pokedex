package pokemons;

import type.Air;

public class Charizard extends Air {

    public Charizard(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos, Long potencia) {
        super(id, nome, peso, altura, hp, tipos, potencia);
    }

    public Charizard(Long id, String nome, Double peso, Double altura, Long hp, String tipo, Long potencia) {
        super(id, nome, peso, altura, hp, tipo, potencia);
    }

}
