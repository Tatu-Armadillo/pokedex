package pokemons;

public class Pokemon {
    private Long id;
    private String nome;
    private Double peso;
    private Double altura;
    private Long hp;
    private String tipo;
    private String[] tipos;

    public Pokemon(Long id, String nome, Double peso, Double altura, Long hp, String[] tipos) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
        this.tipos = tipos;
    }

    public Pokemon(Long id, String nome, Double peso, Double altura, Long hp, String tipo) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
        this.tipo = tipo;
    }

    public void atacar() {
        System.out.println("atacar!!!");
    }

    @Override
    public String toString() {
        if (this.tipo != null) {
            return "Pokemon: " + this.nome + "| Tipo " + this.tipo + "| Numero do Pokedex: " + this.id;
        } else {
            return "Pokemon: " + this.nome + "| Tipo " + this.tipos[0] + ", " + this.tipos[1] + "| Numero do Pokedex: "
                    + this.id;
        }
    }

    // #region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Long getHp() {
        return hp;
    }

    public void setHp(Long hp) {
        this.hp = hp;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }
    // #endregion

}
