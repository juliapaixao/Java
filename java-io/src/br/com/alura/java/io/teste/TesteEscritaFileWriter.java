package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída
//       OutputStream fos = new FileOutputStream("vasco1.txt"); //cria um novo arquivo
//       Writer osw = new OutputStreamWriter(fos);
//       BufferedWriter bw = new BufferedWriter(osw);


        BufferedWriter bw = new BufferedWriter(new FileWriter("vasco3.txt"));
        bw.write("Vou torcer pro Vasco ser campeao,");
        //fw.write("\r\n"); //cria uma nova linha. r - indica o return e n- indica uma nova linha
        bw.write(System.lineSeparator()); //cria uma nova linha
        bw.write("Sao Januario, meu caldeirao");

        bw.close();

    }
}
