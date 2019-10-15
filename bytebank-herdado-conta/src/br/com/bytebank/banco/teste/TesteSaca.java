package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.Conta;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321); //tem que colocar o nome do pacote ao qual pertence a Conta


        conta.deposita(200.0);
        try {
            conta.saca(210.0);
        }
        catch (SaldoInsuficienteException ex){
            System.out.println("Exception: " + ex.getMessage());
        }

       System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
