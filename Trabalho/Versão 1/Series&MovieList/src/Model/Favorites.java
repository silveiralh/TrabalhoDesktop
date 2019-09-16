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
public class Favorites {
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
