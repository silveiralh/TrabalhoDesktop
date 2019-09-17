package Controller;

import Model.Movie;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarMovieDAO {
    ArrayList<Movie> listaF;
    
    public CadastrarMovieDAO() {
       this.listaF = new ArrayList<>();
    }
    
    public void cadastrarFilme(Movie movie){
        this.listaF.add(movie);
    }
    
    public void atualizarFilme(Movie movie, int index){
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Selecione um filme na tabela para ser alterado");
            return;
        }
        this.listaF.set(index, movie);
    }
    
    public void excluirFilme(int index){
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Selecione um filme na tabela para ser excluido");
            return;
        }
        this.listaF.remove(index);
    }
    
    public ArrayList<Movie> getFilmesCadastrados(){
        return this.listaF;
    }
    
}
