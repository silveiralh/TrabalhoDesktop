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
public class FavoritesM {
    private MovieM[] listaFilmes;
    private SerieM[] listaSeries;

    public MovieM[] getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(MovieM[] listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public SerieM[] getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(SerieM[] listaSeries) {
        this.listaSeries = listaSeries;
    }
}
