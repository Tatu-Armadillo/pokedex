package pokemons;

import java.util.List;

import type.Types;

public class Pokemon {
    private Long idPokemon;
    private String name;
    private Long hp;
    private List<Types> types;

    public Pokemon(Long idPokemon, String name, Long hp, List<Types> types) {
        this.idPokemon = idPokemon;
        this.name = name;
        this.hp = hp;
        this.types = types;
    }

    @Override
    public String toString() {
            return "Pokemon: " + this.name + "| Tipo " + this.types.get(0) + ", " + this.types.get(1) + "| Numero do Pokedex: " + this.idPokemon;
    }

    // #region Getters and Setters
    public Long getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Long idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHp() {
        return hp;
    }

    public void setHp(Long hp) {
        this.hp = hp;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }
    // #endregion

}
