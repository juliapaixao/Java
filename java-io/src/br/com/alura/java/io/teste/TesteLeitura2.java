package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        //Scanneia o arquivo com extensão .csv
        Scanner scanner = new Scanner(new File("contas.csv"));

        //Verifica se existe uma próxima linha no arquivo
//        boolean proxLinha = scanner.hasNextLine();
//        System.out.println("Existe próxima linha: " + proxLinha);

        while(scanner.hasNextLine()){
            //Faz leitura das linhas do arquivo
            String linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();
    }
}
