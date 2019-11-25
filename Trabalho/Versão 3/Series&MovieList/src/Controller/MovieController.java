package Controller;

import Model.ConnectionFactory;
import Model.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.postgresql.util.PSQLException;

public class MovieController {
   
    // <editor-fold defaultstate="collapsed" desc=" Operações no banco de dados ">
    public static final ResultSet getAllMovies(){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from movie"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final ArrayList<Movie> getAllMoviesArray() {
        ResultSet movies = getAllMovies();
        
        ArrayList<Movie> moviesArray = new ArrayList<>();
        try {
            while(movies.next()){
                Movie movie = new Movie();
                movie.setTitle(movies.getString("movie_title"));
                movie.setGenre(movies.getString("movie_genre"));
                movie.setSeen(movies.getBoolean("movie_seen"));
                moviesArray.add(movie);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return moviesArray;
    }
    
    public static final ResultSet getMovieByTitle(String title){
        try{
            ConnectionFactory.acessaBD();
            
            int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
            int concorrencia = ResultSet.CONCUR_READ_ONLY;
            
            ConnectionFactory.setStdados(ConnectionFactory.getConnection().createStatement(tipo, concorrencia));
            ConnectionFactory.setRsdados(ConnectionFactory.getStdados().executeQuery("select * from movie where movie_title = '"+title+"'"));
            ConnectionFactory.getConnection().close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        return ConnectionFactory.getRsdados();
    }
    
    public static final boolean newMovie(Movie movie){
        boolean valido = validarDados(movie.getTitle(), movie.getGenre(), movie.getSeen());
        
        if(!valido)
            return false;
        
        try{
            ConnectionFactory.acessaBD();
            String querydados = "insert into movie" + "(movie_title, movie_genre, movie_seen)" + "values (?, ?, ?);";
            
            PreparedStatement st = ConnectionFactory.getConnection().prepareStatement(querydados);
            
            st.setString(1, movie.getTitle());
            st.setString(2, movie.getGenre());
            st.setBoolean(3, movie.getSeen());
            
            int resposta = st.executeUpdate();
            if(resposta == 1){
                ConnectionFactory.getConnection().commit();
                return true;
            }else{
                return false;
            }
            
        }catch(PSQLException erro){
            JOptionPane.showMessageDialog(null, "Este filme já existe.", "Filme duplicado", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de SQL:" +erro, "Erro de SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static final boolean deleteMovie(String title){
        try{
            ConnectionFactory.acessaBD();
            
            String query = "delete from movie where movie_title = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
        
            stmt.setString(1, title);
            
            int i = stmt.executeUpdate();

            ConnectionFactory.getConnection().commit();
            ConnectionFactory.getConnection().close();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar delete: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       
    }
    
    public static final boolean updateMovie(String title, String genre, Boolean seen, String oldTitle){
        
        boolean valido = validarDados(title, genre, seen);
        
        if(!valido)
            return false;
        
        try{
            ConnectionFactory.acessaBD();
            
            String query = "update movie set movie_title = ?, movie_genre = ?, movie_seen = ? where movie_title = ?";
            
            PreparedStatement stmt = ConnectionFactory.getConnection().prepareStatement(query);
            
            stmt.setString(1, title);
            stmt.setString(2, genre);
            stmt.setBoolean(3, seen);
            stmt.setString(4, oldTitle);
            
            int i = stmt.executeUpdate();

            ConnectionFactory.getConnection().commit();
            ConnectionFactory.getConnection().close();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao executar update: " +e, "Erro de consulta SQL", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
       
    }
     // </editor-fold>
    
    public static boolean validarDados(String title, String genre, Boolean seen) {
        String message = "Erros: \n\n";
        boolean valido = true;
        
        if(title.isEmpty() || title == null){
            message += "Titulo nao pode estar vazio!\n";
            valido = false;
        }
        if(genre.isEmpty() || genre == null){
            message += "Genero inválido!\n";
            valido = false;
        }
        if(seen == null){
            message += "Marcador inválido!\n";
            valido = false;
        }
        
        if(!valido){
            JOptionPane.showMessageDialog(null, message);
        }
        
        return valido;
    }
}