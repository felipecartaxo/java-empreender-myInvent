package entidades;

public class Equipamento {
    private int id;
    private String nome;
    private String descricao;
    private String marca;

    // Construtor com 3 parâmetros
    public Equipamento(int id, String nome, String marca) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
    }

    // Construtor com 4 parâmetros
    public Equipamento(int id, String nome, String descricao, String marca) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // toString
    @Override
    public String toString() {
        return "ID: " +
                id +
                " | Nome = " +
                nome +
                " | Marca = " +
                marca +
                " | Descricao = " +
                descricao;
    }
}