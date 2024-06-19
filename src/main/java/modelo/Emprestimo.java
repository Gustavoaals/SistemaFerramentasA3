package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;


public class Emprestimo {
    private int id;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private Date dataInicio;
    private Date dataFim;

    public Emprestimo(int id, Amigo amigo, Ferramenta ferramenta, Date dataInicio, Date dataFim) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
