package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;
import java.util.logging.SocketHandler;


public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        //Comunicação via rede
        //Socket s = new Socket();

        //Entrada de um arquivo
        InputStream fis = new FileInputStream("vasco.txt"); //System.in; - insere através do teclado    //s.getOutputStream(); - via rede
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //Copia o arquivo de entrada, gerando um novo arquivo de saída
        OutputStream fos = new FileOutputStream("vasco2.txt"); //System.out; - printa no console  //s.getInputStream(); - via rede
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {
            bw.write(linha); //copia cada linha do arquivo de entrada
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
