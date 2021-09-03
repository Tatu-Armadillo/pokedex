package type;

import pokemons.Pokemon;

public class Water extends Pokemon {
    private Long potencia;

    public Water(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos, Long potencia) {
        super(id, nome, peso, altura, hp, tipos);
        this.potencia = potencia;
    }
    public Water(Long id, String nome, Double peso, Double altura, Long hp, String tipo, Long potencia) {
        super(id, nome, peso, altura, hp, tipo);
        this.potencia = potencia;
    }

    public void gospeFogo(Long potencia) {
        System.out.println("Gospe Agua");
    }

    public void resisteAgua(Long potencia) {
        System.out.println("Gospe Agua");
    }

    public Long getPotencia() {
        return potencia;
    }

    public void setPotencia(Long potencia) {
        this.potencia = potencia;
    }

}
