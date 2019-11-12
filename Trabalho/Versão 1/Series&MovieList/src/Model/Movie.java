package Model;

import DAO.MovieDAO;
import java.util.ArrayList;

public class Movie extends MovieDAO{
   
     
    private String tituloFilme;
    private String genero;
    private Boolean foiAssistido;

    // <editor-fold defaultstate="collapsed" desc=" CONSTRUTORES ">
    public Movie(String tituloFilme, String genero, Boolean foiAssistido) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.foiAssistido = foiAssistido;
    }
    
    public Movie() { }
    // </editor-fold>
   
    // <editor-fold defaultstate="collapsed" desc=" GETTERS/SETTERS ">
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
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc=" CONEXÃO COM BANCO ">
    public boolean insert() {
        return MovieDAO.insert(this);
    }

    public boolean update() {
        return MovieDAO.update(this);
    }

    public boolean delete() {
        return Movie.delete(this.getTituloFilme());
    }

    public static ArrayList<Movie> selectAll() {
        return MovieDAO.selectAll();
    }
    // </editor-fold>
   

}
