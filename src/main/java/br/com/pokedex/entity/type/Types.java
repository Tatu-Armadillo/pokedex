package br.com.pokedex.entity.type;

public class Types {

    private Long idType;
    private String type;

    public Types() { }

    public Types(Long idType, String type) {
        this.idType = idType;
        this.type = type;
    }

    @Override
    public String toString() {
        return "" + getType();
    }

    // #region Getters and Setters
    public Long getIdType() {
        return idType;
    }
    
    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    // #endregion

}
