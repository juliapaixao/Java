package br.com.alura.java.io.teste;

import java.io.*;


public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída
//       OutputStream fos = new FileOutputStream("vasco1.txt"); //cria um novo arquivo
//       Writer osw = new OutputStreamWriter(fos);
//       BufferedWriter bw = new BufferedWriter(osw);

        //Saída com FileWriter
        FileWriter fw = new FileWriter("vasco3.txt"); //cria um novo arquivo
        fw.write("Vou torcer pro Vasco ser campeao,");
        //fw.write("\r\n"); //cria uma nova linha. r - indica o return e n- indica uma nova linha
        fw.write(System.lineSeparator()); //cria uma nova linha
        fw.write("Sao Januario, meu caldeirao");

        fw.close();

    }
}
