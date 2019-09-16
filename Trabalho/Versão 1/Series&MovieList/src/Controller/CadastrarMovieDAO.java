package Controller;

import Model.Movie;
import java.util.ArrayList;

public class CadastrarMovieDAO {
    ArrayList<Movie> listaF = new ArrayList(); 
    
    public void cadastrarFilme(Movie M) throws Exception{
        listaF.add(M);
    }
    
    public void atualizarFilme(Movie M) throws Exception{
        //movie.getListaF().add(M);
    }
    
    public void excluirFilme(Movie M) throws Exception{
        //movie.getListaF().add(M);
    }

}
