package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaolivre;

    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicaolivre = 0;
    }

    public void adiciona(Conta ref) {
        this.referencias[0] = ref;
        this.posicaolivre++;
    }

    public int getQtdElementos() {
        return this.posicaolivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
