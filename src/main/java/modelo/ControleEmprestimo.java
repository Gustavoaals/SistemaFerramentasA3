package modelo;

public class ControleEmprestimo {
    
    // Suponha que tenha alguns atributos
    private int id;
    private String nome;

    // Construtor
    public ControleEmprestimo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Métodos
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

   
}
 