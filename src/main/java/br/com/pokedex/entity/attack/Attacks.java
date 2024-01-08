package br.com.pokedex.entity.attack;

public class Attacks {

    private Long idAttack;
    private String attack;
    private Long baseDemage;
    private Long requiredLevel;
    private Long type;

    public Attacks(Long idAttack, String attack, Long baseDemage, Long requiredLevel, Long type) {
        this.idAttack = idAttack;
        this.attack = attack;
        this.baseDemage = baseDemage;
        this.requiredLevel = requiredLevel;
        this.type = type;
    }

    @Override
    public String toString() {
        return "" + getAttack();
    }

    // #region Getters and setters
    public Long getIdAttack() {
        return idAttack;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(Long requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Long getBaseDemage() {
        return baseDemage;
    }

    public void setBaseDemage(Long baseDemage) {
        this.baseDemage = baseDemage;
    }
    // #endregion

}
