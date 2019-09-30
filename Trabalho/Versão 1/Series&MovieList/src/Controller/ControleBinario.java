package Controller;

import Model.Movie;
import Model.Serie;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ControleBinario {
    /*
    public static void main(String[] args) throws FileNotFoundException,
            IOException, ClassNotFoundException {
//        Movie employee = new Movie("Peter", "asdf", true);
//        Serie s = new Serie("Peter", 1, true);
//        ControleBinario control = new ControleBinario();
//        control.escreverMovie(employee);
//        control.escreverSerie(s);
//        leitor(employee.getArquivo());
    }*/

    public void escreverMovie(CadastrarMovieDAO movieD) throws FileNotFoundException,IOException {
        FileOutputStream fileFilmes = null;
        ObjectOutputStream escritaObj = null;
        
        try {
            fileFilmes = new FileOutputStream(movieD.getFilmesCadastrados().toString());
            escritaObj = new ObjectOutputStream(fileFilmes);

            escritaObj.writeObject(movieD);
            System.out.println("Gravação realizada com sucesso.\n");
            
            escritaObj.close();
        } catch (IOException e) {
            System.out.println("Não foi possivel Gravar.\n" + e.getMessage());
        }
    }

    public void escreverSerie(CadastrarSerieDAO serieD) throws FileNotFoundException, IOException {
        FileOutputStream fileSeries = null;
        ObjectOutputStream escritaObj = null;
        
        try {
            fileSeries = new FileOutputStream(serieD.getSeriesCadastradas().toString());
            escritaObj = new ObjectOutputStream(fileSeries);
            
            escritaObj.writeObject(serieD);
            System.out.println("Gravação realizada com sucesso.\n");
            
            escritaObj.close();
        } catch (IOException e) {
            System.out.println("Não foi possivel Gravar.\n" + e.getMessage());
        }
    }

    public final Object leitorMovie(String arquivo) throws ClassNotFoundException, IOException {
        Object dados = null;
        
        try {
            FileInputStream leitura = new FileInputStream(arquivo); 
            ObjectInputStream leituraobj = new ObjectInputStream(leitura);
            
            leituraobj.readObject();
            dados = leituraobj.readObject();
            
            System.out.println(" " + dados.toString());
        }
        catch (IOException e) {
                System.out.println("Não foi possível fazer a leitura.\n "+e.getMessage());
        }
        
        return dados;
    }
    
    public final Object leitorSerie(String arquivo) throws ClassNotFoundException, IOException {
        Object dados = null;
        
        try {
            FileInputStream leitura = new FileInputStream(arquivo); 
            ObjectInputStream leituraobj = new ObjectInputStream(leitura);
            
            leituraobj.readObject();
            dados = leituraobj.readObject();
            
            System.out.println(" " + dados.toString());
        }
        catch (IOException e) {
                System.out.println("Não foi possível fazer a leitura.\n "+e.getMessage());
        }
        
        return dados;
    }

}