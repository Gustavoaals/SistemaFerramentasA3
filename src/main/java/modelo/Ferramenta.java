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