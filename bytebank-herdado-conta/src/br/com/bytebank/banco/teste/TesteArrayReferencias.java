package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc = new ContaCorrente(123,456);
        contas[0] = cc;
        System.out.println(contas[0]);

        ContaCorrente cc1 = new ContaCorrente(222,111);
        contas[1] = cc1;
        System.out.println(contas[1]);
        System.out.println("Agência: " + contas[1].getAgencia());
        System.out.println("Conta: " + contas[1].getNumero());

        ContaCorrente ref = contas[1];
        System.out.println(cc1.getNumero());
        System.out.println(ref.getNumero());

    }

}
