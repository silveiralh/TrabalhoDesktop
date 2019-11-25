
package Controller;

import Model.Movie;
import Model.Serie;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class SerieController {
    
   // <editor-fold defaultstate="collapsed" desc=" CRUD ">
    public boolean criarSerie(ArrayList listaCriar) {
        boolean retorno = false;
        
        if (this.validarDados(listaCriar, false)) {
            Iterator iterator = listaCriar.iterator();

            Serie novaSerie = new Serie(
                    (String) iterator.next().toString(),
                    (int) iterator.next(),
                    (boolean) iterator.next(),
                    (boolean) iterator.next()
            );
            retorno = novaSerie.insert();
        }
        return retorno;
    }

    public boolean editarSerie(ArrayList listaEditar) {
        boolean retorno = false;

        if (this.validarDados(listaEditar, true)) {
            Iterator iterator = listaEditar.iterator();
            Serie editarSerie = new Serie(
                    (String) iterator.next(),
                    (int) iterator.next(),
                    (boolean) iterator.next(),
                    (boolean) iterator.next()
            );
            retorno = editarSerie.update();
        }
        return retorno;
    }

    /*
    public boolean excluirSerie(String TituloSerie) {
        if (TituloSerie != "") {
            JOptionPane.showMessageDialog(null, "Erro na exclusão.\n");
            return false;
        }
        /*Serie excluiSerie = new Serie(TituloFilme);
        
        return excluiSerie.delete();*/
    //}
    

    public ArrayList listarSerie() {
        ArrayList<Serie> listagem = Serie.selectAll();
        if (listagem == null) {
            return null;
        }
        Iterator iterator = listagem.iterator();
        ArrayList retorno = new ArrayList();

        if (listagem.isEmpty()) {
            return null;
        }

        while (iterator.hasNext()) {
            Serie listaSerie = (Serie) iterator.next();
            retorno.add(listaSerie.getTituloSerie());
            retorno.add(listaSerie.getTemporada());
            retorno.add(listaSerie.getFoiAssitida());
            retorno.add(listaSerie.getSendoAssistida());
        }

        return retorno;
    }
    // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" VALIDAÇÕES ">
    private boolean validarDados(ArrayList<String> lista, boolean editar) {
        Iterator iterator = lista.iterator();
        String message = "Erros: \n\n";
        boolean valido = true;
        
        try {
            if(editar) {
                iterator.next();//Passa verificação de id
            }
            String nome = (String) iterator.next();
            if (nome.isEmpty()) {
                message += "O campo nome é obrigatório.\n";
                valido = false;
            }
            String sigla = (String) iterator.next();
            
            boolean ativo = (boolean) iterator.next();
            
            if (ativo != true && ativo != false) {
                message += "Preencha o campo ativo corretamente.\n";
                valido = false;
            }
        } catch (Exception errror) {
            message += "\nConfira todos os campos!\n";
            valido = false;
        }
        if (!valido) {
            JOptionPane.showMessageDialog(null, message);
        }
        return valido;
    }
    // </editor-fold>
}