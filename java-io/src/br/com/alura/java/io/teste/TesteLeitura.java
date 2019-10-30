package br.com.alura.java.io.teste;

import java.io.*;


public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo (em binário)
        FileInputStream fis = new FileInputStream("vasco.txt");
        //Transforma bits e bytes em caracter
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        //Lê as linhas inteiras do arquivo de texto
        BufferedReader br = new BufferedReader(isr);


        //realiza leitura de linha por linha
        String linha = br.readLine();
        System.out.println(linha);


        //lê cada linha do arquivo
        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }


        //Fecha a leitura do bufferedReader
        br.close();

    }
}
