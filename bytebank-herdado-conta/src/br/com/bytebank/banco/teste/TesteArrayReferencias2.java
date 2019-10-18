package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TesteArrayReferencias2 {

    public static void main(String[] args) {

        //utilizando o tipo mais genérico
        Conta[] contas = new Conta[5];

        ContaCorrente cc = new ContaCorrente(123,456);
        contas[0] = cc;
        System.out.println(contas[0]);

        ContaPoupanca cc1 = new ContaPoupanca(222,111);
        contas[1] = cc1;
        System.out.println(contas[1]);
        System.out.println("Agência: " + contas[1].getAgencia());
        System.out.println("Conta: " + contas[1].getNumero());


        ContaPoupanca ref = (ContaPoupanca) contas[1]; //cast - forçando um tipo genérico a usar um tipo mais específico
        System.out.println(cc1.getNumero());
        System.out.println(ref.getNumero());

    }
}
