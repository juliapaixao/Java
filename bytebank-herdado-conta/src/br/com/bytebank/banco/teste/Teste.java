package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("hello world");
        System.out.println(123);
        System.out.println(true);
        System.out.println(1+2);

        ContaCorrente cc = new ContaCorrente(12,23);
        ContaPoupanca cp = new ContaPoupanca(45, 56);
        Cliente cliente = new Cliente();

        System.out.println(cc.toString());
        System.out.println(cp);

        println();
        //println(cliente);
    }

    static void println(){
    }

    static void println(int a){
    }

    static void println(boolean valor){
    }

    //a classe Object pertence ao pacote java.lang - todas as classses herdam dela!
    //É a classe mais genérica
    //Polimorfismo
    static void println(Object referencia){
    }


}
