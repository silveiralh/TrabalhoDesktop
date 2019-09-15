package Model;

import java.io.*;

/**
 * @author fabricio
 */
public class ControleTexto {

    private File arquivo = null;

    public ControleTexto(File arq){
        arquivo = arq;
    }
    
    
    
    public String LerArquivo() {
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

    public void EscreverArquivo(String aux, boolean append) {
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
