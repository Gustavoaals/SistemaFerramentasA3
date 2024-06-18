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