package type;

import pokemons.Pokemon;

public class Air extends Pokemon {
    private Long potencia;

    public Air(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos, Long potencia) {
        super(id, nome, peso, altura, hp, tipos);
        this.potencia = potencia;
    }
    public Air(Long id, String nome, Double peso, Double altura, Long hp, String tipo, Long potencia) {
        super(id, nome, peso, altura, hp, tipo);
        this.potencia = potencia;
    }

    public void gospeAr(Long potencia) {
        System.out.println("Gospe Ar");
    }

    public void resisteAr(Long potencia) {
        System.out.println("Gospe Ar");
    }

    public Long getPotencia() {
        return potencia;
    }

    public void setPotencia(Long potencia) {
        this.potencia = potencia;
    }
}
