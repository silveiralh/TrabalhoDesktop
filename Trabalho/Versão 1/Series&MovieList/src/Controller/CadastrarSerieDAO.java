
package Controller;

import Model.Serie;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Rique
 */
public class CadastrarSerieDAO {
        ArrayList<Serie> listaS = new ArrayList(); 

    public void CadastrarSerieDAO(ArrayList<Serie> listaF) {
        
    }
    
    public void CadastrarSerieDAO() {
        
    }
    
    public void cadastrarSerie(Serie S) throws Exception{
        this.listaS = listaS;
        
        try {
            int i = 0;
            
            for(Serie s : listaS){
               s.getTituloSerie();
               s.getFoiAssitida();
               s.getSendoAssistida();
               s.getTemporada();
               
               listaS.add(s);

               System.out.println(listaS);
            }
        } catch (Exception ex) {
            Logger.getLogger("Erro ao cadastrar a série.");
        }
    }
    
    public void atualizarFilme(Serie S) throws Exception{
        //movie.getListaS().add(S);
    }
    
    public void excluirFilme(Serie S) throws Exception{
        //movie.getListaS().add(S);
    }

}