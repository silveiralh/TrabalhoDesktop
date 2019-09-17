package Controller;

import Model.Movie;
import java.io.*;
import java.util.ArrayList;

public class ControleArquivo {
    private File arquivo = null;
    CadastrarMovieDAO movieDAO = new CadastrarMovieDAO();
    
    public ControleArquivo(){

    }
    
    public ControleArquivo(File arq){
        arquivo = arq;
    }

    public void CriaArquivoFilme() throws IOException{
        File diretorio = new File("C:/Users/Massallys/Desktop");
        diretorio.mkdir();
        
        File arquivoFilme = new File(diretorio, "listaFilmesAdicionados.txt");

        if (arquivo.exists()) {
            arquivo.delete();
        } else {
            arquivo.createNewFile();
        }
    }
    
    public String LerArquivoFilme() {
        StringBuilder aux = new StringBuilder();
        try {
            BufferedReader leitorbuffer = new BufferedReader(new FileReader(arquivo));
            while (leitorbuffer.ready()) {
                aux.append(leitorbuffer.readLine()).append("\n");
            }
            leitorbuffer.close();
        } catch (IOException erro) {
            System.err.println("Erro de leitura do arquivo." + erro);
        } finally {
            return (aux.toString());
        }
    }

    public void EscreverArquivoFilme(ArrayList<Movie> listaF, boolean append) {
        try {
            BufferedWriter escritorbuffer = new BufferedWriter(
                    new FileWriter(arquivo, append));
            escritorbuffer.write(listaF.toString());
            escritorbuffer.close();
        } catch (IOException erro) {
            System.err.println("Erro ao escrever no arquivo. " + erro);
        }
    }
    
    public String LerArquivoSerie() {
        StringBuilder aux = new StringBuilder();
        try {
            BufferedReader leitorbuffer = new BufferedReader(new FileReader(arquivo));
            while (leitorbuffer.ready()) {
                aux.append(leitorbuffer.readLine()).append("\n");
            }
            leitorbuffer.close();
        } catch (IOException erro) {
            System.err.println("Erro de leitura do arquivo." + erro);
        } finally {
            return (aux.toString());
        }
    }

    public void EscreverArquivoSerie(String aux, boolean append) {
        try {
            BufferedWriter escritorbuffer = new BufferedWriter(
                    new FileWriter(arquivo, append));
            escritorbuffer.write(aux);
            escritorbuffer.close();
        } catch (IOException erro) {
            System.err.println("Erro ao escrever no arquivo. " + erro);
        }
    }

}
