package Controller;

import Model.Movie;
import Model.Serie;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControleBinario {
    //filme
    private FileInputStream inf;
    private ObjectInputStream oisf;
   
    private FileOutputStream outf;
    private ObjectOutputStream oosf;
    
    //serie
    private FileInputStream ins;
    private ObjectInputStream oiss;
   
    private FileOutputStream outs;
    private ObjectOutputStream ooss;
    
    
    public ControleBinario(){
        //filme
        try {
            this.inf = new FileInputStream(System.getProperty("user.dir")+"/src/arq/movies.obj");
            this.oisf = new ObjectInputStream(inf);
            
            this.outf = new FileOutputStream(System.getProperty("user.dir")+"/src/arq/movies.obj");
            this.oosf = new ObjectOutputStream(outf);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControleBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //serie
        try {
            this.ins = new FileInputStream(System.getProperty("user.dir")+"/src/arq/series.obj");
            this.oiss = new ObjectInputStream(ins);
            
            this.outs = new FileOutputStream(System.getProperty("user.dir")+"/src/arq/series.obj");
            this.ooss = new ObjectOutputStream(outs);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControleBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void escreverMovie(Movie movie) {
        try {
            oosf.writeObject(movie);
            oosf.flush();
            oosf.close();
            outf.flush();
            outf.close();
        } catch (IOException ex) {
            System.out.println("Erro de escrita de filme. "+ex.getMessage());
        }
    }

    public void escreverSerie(Serie serie) {
        try {
            ooss.writeObject(serie);
            ooss.flush();
            ooss.close();
            outs.flush();
            outs.close();
        } catch (IOException ex) {
            System.out.println("Erro de escrita da serie."+ex.getMessage());
        }
    }

    public ArrayList <Movie> leitorMovie() throws ClassNotFoundException {
        ArrayList<Movie> filmes = new ArrayList<>();
        
        try {
            Movie obj = (Movie)oisf.readObject();
            while (obj != null){
                filmes.add(obj);
                obj = (Movie)oisf.readObject();
            }
            oisf.close();
            inf.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            System.out.println("Erro de leitura de filme.");
        } catch (NullPointerException ex){
        }
        return filmes;
    }
    
    public ArrayList<Serie> leitorSerie() throws ClassNotFoundException {
        ArrayList<Serie> series = new ArrayList<>();
        
        try {
            Serie obj = (Serie)oiss.readObject();
            while (obj != null){
                series.add(obj);
                obj = (Serie)oiss.readObject();
            }
            oiss.close();
            ins.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            System.out.println("Erro de leitura da serie.");
        } catch (NullPointerException ex){
        }
        return series;
    }

}