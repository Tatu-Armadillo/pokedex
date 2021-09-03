package type;

import pokemons.Pokemon;

public class Fire extends Pokemon {
    private Long potencia;

    public Fire(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos, Long potencia) {
        super(id, nome, peso, altura, hp, tipos);
        this.potencia = potencia;
    }
    
    public Fire(Long id, String nome, Double peso, Double altura, Long hp, String tipo, Long potencia) {
        super(id, nome, peso, altura, hp, tipo);
        this.potencia = potencia;
    }

    public void gospeFogo(Long potencia) {
        System.out.println("Gospe Fogo");
    }

    public void resisteFogo(Long potencia) {
        System.out.println("Gospe Fogo");
    }

    public Long getPotencia() {
        return potencia;
    }

    public void setPotencia(Long potencia) {
        this.potencia = potencia;
    }

}
