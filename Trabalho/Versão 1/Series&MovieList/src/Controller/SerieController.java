
package Controller;

import Model.Serie;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rique
 */
public class SerieController {
        ArrayList<Serie> listaS = new ArrayList(); 
    
    public SerieController() {
       this.listaS = new ArrayList<>();
    }
    
    public void cadastrarSerie(Serie serie){
        this.listaS.add(serie);
    }
    
    public void atualizarSerie(Serie serie, int index){
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Selecione um filme na tabela para ser alterado");
            return;
        }
        this.listaS.set(index, serie);
    }
    
    public void excluirSerie(int index){
        if(index < 0){
            JOptionPane.showMessageDialog(null, "Selecione um filme na tabela para ser excluido");
            return;
        }
        this.listaS.remove(index);
    }
    
    public ArrayList<Serie> getSeriesCadastradas(){
        return this.listaS;
    }
    
}