/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rique
 */
public class Serie {
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
