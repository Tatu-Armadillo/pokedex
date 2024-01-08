package br.com.pokedex.entity.pokemon;

import java.util.List;

import br.com.pokedex.entity.attack.Attacks;
import br.com.pokedex.entity.type.Types;

public class Pokemon {
    private Long idPokemon;
    private String name;
    private Long hp;
    private Long level;
    private List<Types> types;
    private List<Attacks> attacks;

    public Pokemon(Long idPokemon, String name, Long hp, Long level) {
        this.idPokemon = idPokemon;
        this.name = name;
        this.hp = hp;
        this.level = level;
    }

    @Override
    public String toString() {
        return this.name;
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

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public List<Attacks> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attacks> attacks) {
        this.attacks = attacks;
    }
    // #endregion

}
