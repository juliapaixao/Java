package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(6148, 121212);
        cc.deposita(200.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculador = new CalculadorDeImposto();
        calculador.registra(cc);
        calculador.registra(seguro);

        System.out.println(calculador.getTotalImposto());

    }
}
