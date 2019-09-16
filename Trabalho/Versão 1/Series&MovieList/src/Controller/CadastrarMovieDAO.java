package Controller;

import Model.Movie;
import View.MoviesV;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastrarMovieDAO {
    ArrayList<Movie> listaF = new ArrayList(); 

    public void CadastrarMovieDAO(ArrayList<Movie> listaF) {
        
    }
    
    public void CadastrarMovieDAO() {
        
    }
    
    public void cadastrarFilme(Movie M) throws Exception{
        this.listaF = listaF;
        
        try {
            int i = 0;
            
            for(Movie m : listaF){
               m.getTituloFilme();
               m.getGenero();
               m.getFoiAssistido();
               
               listaF.add(m);

               System.out.println(listaF);
            }
        } catch (Exception ex) {
            Logger.getLogger("Erro ao cadastrar o filme.");
        }
    }
    
    public void atualizarFilme(Movie M) throws Exception{
        //movie.getListaF().add(M);
    }
    
    public void excluirFilme(Movie M) throws Exception{
        //movie.getListaF().add(M);
    }

}
