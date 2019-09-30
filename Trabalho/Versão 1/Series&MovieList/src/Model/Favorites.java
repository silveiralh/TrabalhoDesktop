package Model;

import java.io.Serializable;

public class Favorites implements Serializable {
    private static final String arquivo = "C:\\Users\\Massallys\\Desktop\\favorites.obj";
    
    private Movie[] listaFilmes;
    private Serie[] listaSeries;

    public Movie[] getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(Movie[] listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public Serie[] getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(Serie[] listaSeries) {
        this.listaSeries = listaSeries;
    }
}
