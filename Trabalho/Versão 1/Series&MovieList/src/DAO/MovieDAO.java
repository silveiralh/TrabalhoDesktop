package DAO;

import Controller.BDController;
import Model.Movie;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MovieDAO {
    protected static boolean insert(Movie movie) {
        boolean retorno = false;
        PreparedStatement pstdados = null;
        
        BDController bd = new BDController();
        Connection connection = null;
        
        String sqldml = "Insert into Movie (MOVIE_TITULOFILME, MOVIE_GENERO, "
                + "MOVIE_FOIASSISTIDO)"
                + "values (?,?,?)";

        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);

            pstdados.setString(1, movie.getTituloFilme());
            pstdados.setString(2, movie.getGenero());
            pstdados.setBoolean(3, movie.getFoiAssistido());
           
            pstdados.executeUpdate();
            //Chama o Commit
            connection = bd.commit(connection);
            //Ocorreu tudo bem e o objeto está salvo
            retorno = true;
        } catch (SQLException error) {
            String msgErro = "Erro com o banco de dados: " + error;
            JOptionPane.showMessageDialog(null, msgErro);
            //Dá Roolback
            connection = bd.rollback(connection);
        } finally {
            //Termina connecção
            connection = bd.close(connection, pstdados);
        }
        return retorno;
    }
    
    protected static boolean update(Movie movie) {
        boolean retorno = false;
        PreparedStatement pstdados = null;
        
        BDController bd = new BDController();
        Connection connection = null;
        
        String sqldml = "update Movie set MOVIE_TITULOFILME= ? ,"
                + "MOVIE_GENERO = ? ,"
                + "MOVIE_FOIASSISTIDO = ? ,"
                ;

        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);

            pstdados.setString(1, movie.getTituloFilme());
            pstdados.setString(2, movie.getGenero());
            pstdados.setBoolean(3, movie.getFoiAssistido());
          

            pstdados.executeUpdate();
            //Chama o Commit
            connection = bd.commit(connection);
            //Ocorreu tudo bem e o objeto está salvo
            retorno = true;
        } catch (SQLException error) {
            String msgErro = "Erro com o banco de dados: " + error;
            JOptionPane.showMessageDialog(null, msgErro);
            //Dá Roolback
            connection = bd.rollback(connection);
        } finally {
            //Termina connecção
            connection = bd.close(connection, pstdados);
        }
        return retorno;
    }
    
    protected static boolean delete(String TituloFilme) {
        boolean retorno = false;
        PreparedStatement pstdados = null;
        BDController bd = new BDController();
        Connection connection = null;

        try {
            String sqldml = "delete from Movie where MOVIE_TITULOFILME = ?";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setString(1, TituloFilme);
            pstdados.executeUpdate();
            //Chama o Commit
            connection = bd.commit(connection);
            //Ocorreu tudo bem e o objeto está salvo
            retorno = true;
        } catch (SQLException error) {
            String msgErro = "Erro com o banco de dados: " + error;
            JOptionPane.showMessageDialog(null, msgErro);
            //Dá Roolback
            connection = bd.rollback(connection);
        } finally {
            //Termina connecção
            connection = bd.close(connection, pstdados);
        }
        return retorno;
    }
    
    protected static ArrayList<Movie> selectAll() {
        CallableStatement cstdados = null;
        ResultSet rs = null;
        
        ArrayList<Movie> retornoLista = null;
        
        BDController bd = new BDController();
        Connection connection = null;
        
        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            cstdados = connection.prepareCall("{call listaFilmes()}", tipo, concorrencia);
            rs = cstdados.executeQuery();
            
            if (!rs.first()) {
                return null;
            }

            retornoLista = new ArrayList<Movie>();
            ResultSetMetaData rsmd = rs.getMetaData();

            do {
                ArrayList registros = bd.proximoRegistro(rs, rsmd);

                Iterator iterator = registros.iterator();

                while (iterator.hasNext()) {

                    Movie movie = new Movie(
                            (String) iterator.next().toString(),
                            (String) iterator.next().toString(),
                            (boolean) iterator.next()
                    );
                    retornoLista.add(movie);
                }
            } while (rs.next());
        } catch (SQLException error) {
            String msgErro = "Erro com o banco de dados: " + error;
            JOptionPane.showMessageDialog(null, msgErro);
            //Dá Roolback
            connection = bd.rollback(connection);
        } finally {
            //Termina connecção
            connection = bd.close(connection, cstdados, rs);
        }
        return retornoLista;
    }
}
