package modelo;

import dao.FerramentaDao;
import java.util.ArrayList;

public class Ferramenta {
    private int id_ferramenta;
    private String nome;
    private String marca;
    private float custo;

    public Ferramenta(int id_ferramenta, String nome, String marca, float custo) {
        this.id_ferramenta = id_ferramenta;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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
        return "Ferramenta [id=" + id_ferramenta + ", nome=" + nome + ", marca=" + marca + ", custo=" + custo + "]";
    }

    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDao.getMinhaLista();
    }

    public boolean insertFerramentaBD(String nome, String marca, float custo) {
        int id_ferramenta = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
        FerramentaDao.getMinhaLista().add(objeto);
        return true;
    }

    public boolean deleteFerramentaBD(int id_ferramenta) {
        int indice = this.procuraIndice(id_ferramenta);
        if (indice != -1) {
            FerramentaDao.getMinhaLista().remove(indice);
            return true;
        }
        return false;
    }

    public boolean updateFerramentaBD(int id_ferramenta, String nome, String marca, float custo) {
        Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
        int indice = this.procuraIndice(id_ferramenta);
        if (indice != -1) {
            FerramentaDao.getMinhaLista().set(indice, objeto);
            return true;
        }
        return false;
    }

    private int procuraIndice(int id_ferramenta) {
        ArrayList<Ferramenta> lista = FerramentaDao.getMinhaLista();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId_ferramenta() == id_ferramenta) {
                return i;
            }
        }
        return -1;
    }

    public Ferramenta carregaFerramenta(int id_ferramenta) {
        int indice = this.procuraIndice(id_ferramenta);
        if (indice != -1) {
            return FerramentaDao.getMinhaLista().get(indice);
        }
        return null;
    }

    public int maiorID() {
        return FerramentaDao.maiorID();
    }
}
