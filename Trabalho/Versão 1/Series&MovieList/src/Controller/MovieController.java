package Controller;

import Model.Movie;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MovieController {
    
    // <editor-fold defaultstate="collapsed" desc=" CRUD ">
    public boolean criarMovie(ArrayList listaCriar) {
        boolean retorno = false;
        
        if (this.validarDados(listaCriar, false)) {
            Iterator iterator = listaCriar.iterator();

            Movie novoMovie = new Movie(
                    (String) iterator.next().toString(),
                    (String) iterator.next().toString(),
                    (boolean) iterator.next()
            );
            retorno = novoMovie.insert();
        }
        return retorno;
    }

    public boolean editarMovie(ArrayList listaEditar) {
        boolean retorno = false;

        if (this.validarDados(listaEditar, true)) {
            Iterator iterator = listaEditar.iterator();
            Movie editarMovie = new Movie(
                    (String) iterator.next(),
                    (String) iterator.next(),
                    (boolean) iterator.next()
            );
            retorno = editarMovie.update();
        }
        return retorno;
    }

    /*
    public boolean excluirMovie(String TituloFilme) {
        if (TituloFilme != "") {
            JOptionPane.showMessageDialog(null, "Erro na exclusão.\n");
            return false;
        }
        /*Movie excluiMovie = new Movie(TituloFilme);
        
        return excluiMovie.delete();*/
    //}
    

    public ArrayList listarMovie() {
        ArrayList<Movie> listagem = Movie.selectAll();
        if (listagem == null) {
            return null;
        }
        Iterator iterator = listagem.iterator();
        ArrayList retorno = new ArrayList();

        if (listagem.isEmpty()) {
            return null;
        }

        while (iterator.hasNext()) {
            Movie listaMovie = (Movie) iterator.next();
            retorno.add(listaMovie.getTituloFilme());
            retorno.add(listaMovie.getGenero());
            retorno.add(listaMovie.getFoiAssistido());
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
