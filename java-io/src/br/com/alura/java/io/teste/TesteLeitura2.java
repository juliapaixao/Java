package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        //Scanneia o arquivo com extensão .csv
        Scanner scanner = new Scanner(new File("contas.csv"));

        //Verifica se existe uma próxima linha no arquivo
//        boolean proxLinha = scanner.hasNextLine();
//        System.out.println("Existe próxima linha: " + proxLinha);

        while(scanner.hasNextLine()){
            //Faz leitura de cada linha do arquivo
            String linha = scanner.nextLine();
            System.out.println(linha);


            //lê linha e pega cada "termo" que está separado por vírgula
            Scanner linhaScanner = new Scanner(linha);
            //linhaScanner.useLocale(Locale.US); usa as regras do padrão americano
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            String saldo = linhaScanner.next();
            System.out.println(tipoConta);
            System.out.println( agencia);
            System.out.println(numero);
            System.out.println(titular);
            System.out.println(saldo);


            //Formata saída no console
            String valorFormatado = String.format("%s - %d - %d - %s - %s", tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);


            //Separa partes da linha
            String[] valores = linha.split(",");
          //  System.out.println(Arrays.toString(valores));   - mostra todos os valores do array
            System.out.println(valores[3]);

        }

        scanner.close();
    }
}
