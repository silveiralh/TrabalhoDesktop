package Model;

import java.util.ArrayList;

public class Movie {
    private String tituloFilme;
    private String genero;
    private Boolean foiAssistido;

    public Movie(String tituloFilme, String genero, Boolean foiAssistido) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.foiAssistido = foiAssistido;
    }
    
    public Movie(){
    }
    
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
