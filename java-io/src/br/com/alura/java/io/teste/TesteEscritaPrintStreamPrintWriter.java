package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;


public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída
//       OutputStream fos = new FileOutputStream("vasco1.txt"); //cria um novo arquivo
//       Writer osw = new OutputStreamWriter(fos);
//       BufferedWriter bw = new BufferedWriter(osw);

        // BufferedWriter bw = new BufferedWriter(new FileWriter("vasco3.txt"));

        PrintStream ps = new PrintStream("vasco4.txt");

        ps.println("Vou torcer pro Vasco ser campeao,");
        ps.println("Sao Januario, meu caldeirao");

        ps.close();

        System.out.println();

    }
}
