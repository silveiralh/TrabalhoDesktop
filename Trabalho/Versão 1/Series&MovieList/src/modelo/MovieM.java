/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Rique
 */
public class MovieM {
    private String tituloFilme;
    private String genero;
    private Boolean foiAssistido;

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getFoiAssistido() {
        return foiAssistido;
    }

    public void setFoiAssistido(Boolean foiAssistido) {
        this.foiAssistido = foiAssistido;
    }
    
}
