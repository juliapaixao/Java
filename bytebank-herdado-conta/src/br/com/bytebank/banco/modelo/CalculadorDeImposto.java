package br.com.bytebank.banco.modelo;

//ao adicionar o pacote, a classe passa a se chamar modelo.CalculadorDeImposto => Full Qualified Name (FQN), que é é nome completo da classe, composto pelo nome do pacote e o nome da classe.
//
//FQN = NomePacote.NomeSimplesdaClasse
public class CalculadorDeImposto {

    private double totalImposto;

    public void  registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
