package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];


        //idade -> variável que guarda valor primitivo, isto é, não é uma referência
        int idade = 22;
        List numeros = new ArrayList();
        numeros.add(idade);



        //As listas só armazenam referências, com isso, a linha de código acima, não deveria funcionar, porém o java faz o processo representado nas linhas a seguir
        //de modo que seja possível usar métodos, realiza algo "por baixo dos panos"
        int idade1 = 22; //Integer
        Integer idadeRef = new Integer(22);
        List<Integer> numeros1 = new ArrayList<Integer>();
        numeros1.add(22); //Autoboxing


    }

}
