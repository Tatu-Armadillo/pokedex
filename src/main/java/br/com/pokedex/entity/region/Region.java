package br.com.pokedex.entity.region;

public class Region {

    private Long idRegion;
    private String nomeRegion;

    public Region() { }

    public Region(Long idRegion, String nomeRegion) {
        this.idRegion = idRegion;
        this.nomeRegion = nomeRegion;
    }

    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public String getNomeRegion() {
        return nomeRegion;
    }

    public void setNomeRegion(String nomeRegion) {
        this.nomeRegion = nomeRegion;
    }
}
