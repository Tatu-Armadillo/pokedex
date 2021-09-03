package pokemons;

import type.Fire;

public class Charmander extends Fire {

    public Charmander(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos, Long potencia) {
        super(id, nome, peso, altura, hp, tipos, potencia);
    }

    public Charmander(Long id, String nome, Double peso, Double altura, Long hp, String tipo, Long potencia) {
        super(id, nome, peso, altura, hp, tipo, potencia);
    }

}
