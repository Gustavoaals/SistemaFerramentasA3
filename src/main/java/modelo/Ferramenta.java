package modelo;

import dao.FerramentaDao;
import java.util.ArrayList;

public class Ferramenta{
    private int id_ferramenta;
    private String nome;
    private String marca;
    private float custo;
}
 public Ferramenta(int id_ferramenta, String nome, String marca, float custo) {
        this.id_ferramenta = id_ferramenta;
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
}
public int getId_ferramenta() {
        return id_ferramenta;
    }
    public void setId_ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }
 public String getNome() {
    return nome;
}
    public void setNome(String nome) {
    this.nome = nome;
}
public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
 public float getCusto() {
        return custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }
 @Override
    public String toString() {
        return "Ferramenta [id=" + id_ferramenta + ", nome=" + nome + ", marca="+ marca + ", custo=" + custo + "]";
    }
   
    // Método para obter a lista de ferramentas do DAO
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDao.getMinhaLista();
    }
