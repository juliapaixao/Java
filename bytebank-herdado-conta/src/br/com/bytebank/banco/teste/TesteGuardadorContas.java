package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc1 = new ContaCorrente(44,33);
        guardador.adiciona(cc1);

        Conta cc2 = new ContaCorrente(66,55);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQtdElementos();
        System.out.println("Quantidade de elementos: " + tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println("Conta presente nesta posição é a de número: " + ref.getNumero());
    }

}
