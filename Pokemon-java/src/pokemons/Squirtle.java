package pokemons;

import type.Water;

public class Squirtle extends Water {

    public Squirtle(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos, Long potencia) {
        super(id, nome, peso, altura, hp, tipos, potencia);
    }

    public Squirtle(Long id, String nome, Double peso, Double altura, Long hp, String tipo, Long potencia) {
        super(id, nome, peso, altura, hp, tipo, potencia);
    }

}
