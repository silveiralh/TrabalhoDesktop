package Model;

import DAO.SerieDAO;
import java.util.ArrayList;

public class Serie extends SerieDAO{
    
    private String tituloSerie;
    private Integer temporada;
    private Boolean foiAssitida;
    private Boolean sendoAssistida;
    
    // <editor-fold defaultstate="collapsed" desc=" CONSTRUTORES ">
    public Serie(String tituloSerie, int temporada, Boolean foiAssistida, Boolean sendoAssistida) {
        this.tituloSerie = tituloSerie;
        this.temporada = temporada;
        this.sendoAssistida = sendoAssistida;
    }
    
    public Serie(){ }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" GETTERS/SETTERS ">
    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public Boolean getFoiAssitida() {
        return foiAssitida;
    }

    public void setFoiAssitida(Boolean foiAssitida) {
        this.foiAssitida = foiAssitida;
    }

    public Boolean getSendoAssistida() {
        return sendoAssistida;
    }

    public void setSendoAssistida(Boolean sendoAssistida) {
        this.sendoAssistida = sendoAssistida;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" CONEXÃO COM BANCO ">
    public boolean insert() {
        return SerieDAO.insert(this);
    }

    public boolean update() {
        return Serie.update(this);
    }

    public boolean delete() {
        return Serie.delete(this.getTituloSerie());
    }

    public static ArrayList<Serie> selectAll() {
        return SerieDAO.selectAll();
    }
    // </editor-fold>
}
