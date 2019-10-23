package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {

        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);
        Conta cc1 = new ContaCorrente(44,33);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(66,55);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(88,77);
        lista.add(cc3);

        System.out.println("Lista: " + lista);
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Elemento da posição 1: " + lista.get(1));

        lista.remove(0);

        System.out.println("Tamanho da lista: " + lista.size());

        //cria variável para conseguir acessar a conta
        Conta ref = (Conta) lista.get(0);
        System.out.println("Número da conta que está na posição 0: " + ref.getNumero());


        //pega todos os elementos da lista e printa um abaixo do outro
        for(int i = 0; i < lista.size(); i++){
            Object objRef = lista.get(i);
            System.out.println(lista.get(i));
        }

        System.out.println("----------------------------");

        //outra forma de fazer o for acima
        //pra cada objeto da lista faça
        for(Object objRef : lista){
            System.out.println(objRef);
        }

    }

}
