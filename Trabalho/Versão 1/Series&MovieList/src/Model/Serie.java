package Model;

import java.io.Serializable;

public class Serie implements Serializable{
    private static final String arquivo = "C:\\Users\\Massallys\\Desktop\\series.obj";
    
    private String tituloSerie;
    private Integer temporada;
    private Boolean foiAssitida;
    private Boolean sendoAssistida;
    
    public Serie(String tituloSerie, int temporada, Boolean sendoAssistida) {
        this.tituloSerie = tituloSerie;
        this.temporada = temporada;
        this.sendoAssistida = sendoAssistida;
    }
    
    public Serie(){
        
    }

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
    
}
