package Model;

import DAO.MovieDAO;
import java.util.ArrayList;

public class Movie implements java.io.Serializable{
   private static final long serialVersionUID = 1L;
    
    private String title;
    private String genre;
    private Boolean seen;

    // <editor-fold defaultstate="collapsed" desc=" CONSTRUTORES ">
    public Movie(String tituloFilme, String genero, Boolean foiAssistido) {
        this.title = tituloFilme;
        this.genre = genero;
        this.seen = foiAssistido;
    }
    
    public Movie() { }
    // </editor-fold>
   
    // <editor-fold defaultstate="collapsed" desc=" GETTERS/SETTERS ">
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }
}
