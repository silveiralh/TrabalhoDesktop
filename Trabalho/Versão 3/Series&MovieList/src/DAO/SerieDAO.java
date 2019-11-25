package DAO;

import Controller.BDController;
import Model.Serie;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class SerieDAO {
    protected static boolean insert(Serie serie) {
        boolean retorno = false;
        PreparedStatement pstdados = null;
        
        BDController bd = new BDController();
        Connection connection = null;
        
        String sqldml = "Insert into Serie (SERIE_TITULOSERIE, SERIE_TEMPORADA, "
                + "SERIE_FOIASSISTIDA)"
                + "SERIE_SENDOASSISTIDA)"
                + "values (?,?,?,?)";

        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);

            pstdados.setString(1, serie.getTituloSerie());
            pstdados.setInt(2, serie.getTemporada());
            pstdados.setBoolean(3, serie.getFoiAssitida());
            pstdados.setBoolean(4, serie.getSendoAssistida());
           
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
    
    protected static boolean update(Serie serie) {
        boolean retorno = false;
        PreparedStatement pstdados = null;
        
        BDController bd = new BDController();
        Connection connection = null;
        
        String sqldml = "update Serie set SERIE_TITULOSERIE= ? ,"
                + "SERIE_TEMPORADA = ? ,"
                + "SERIE_FOIASSISTIDO = ? ,"
                + "SERIE_SENDOASSISTIDA = ? ,"
                ;

        try {
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);

            pstdados.setString(1, serie.getTituloSerie());
            pstdados.setInt(2, serie.getTemporada());
            pstdados.setBoolean(3, serie.getFoiAssitida());
            pstdados.setBoolean(4, serie.getSendoAssistida());
          

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
    
    protected static boolean delete(String TituloSerie) {
        boolean retorno = false;
        PreparedStatement pstdados = null;
        BDController bd = new BDController();
        Connection connection = null;

        try {
            String sqldml = "delete from Movie where SERIE_TITULOSERIE = ?";

            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_UPDATABLE;
            
            connection = bd.conectaBD();
            pstdados = connection.prepareStatement(sqldml, tipo, concorrencia);
            
            pstdados.setString(1, TituloSerie);
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
    
    protected static ArrayList<Serie> selectAll() {
        CallableStatement cstdados = null;
        ResultSet rs = null;
        
        ArrayList<Serie> retornoLista = null;
        
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

            retornoLista = new ArrayList<Serie>();
            ResultSetMetaData rsmd = rs.getMetaData();

            do {
                ArrayList registros = bd.proximoRegistro(rs, rsmd);

                Iterator iterator = registros.iterator();

                while (iterator.hasNext()) {

                    Serie serie = new Serie(
                            (String) iterator.next().toString(),
                            (int) iterator.next(),
                            (boolean) iterator.next(),
                            (boolean) iterator.next()
                    );
                    retornoLista.add(serie);
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
