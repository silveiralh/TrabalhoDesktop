package Model;

import Controller.Movie;

public class cadastrarMovie {
    Movie movie = new Movie();
    
    public void cadastrar(Movie M) throws Exception{
        movie.getListaF().add(M);
    }
}
