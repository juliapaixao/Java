package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    //construtor
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    //para criar o override: ctrl + o
    //Override - serve para sobrescrever o método
    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        //saca o valor que o cliente quer mais 20 centavos de taxa de cobrança
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
