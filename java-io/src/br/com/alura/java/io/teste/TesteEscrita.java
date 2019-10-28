package br.com.alura.java.io.teste;

import java.io.*;


public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída
       OutputStream fos = new FileOutputStream("vasco1.txt"); //cria um novo arquivo
       Writer osw = new OutputStreamWriter(fos);
       BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Vou torcer pro Vasco ser campeao,");
        bw.newLine();
        bw.write("Sao Januario, meu caldeirao");

        bw.close();

    }
}
