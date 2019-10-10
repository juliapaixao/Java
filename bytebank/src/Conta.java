//classe conta
// dá para definir os valores dos atribuitos, entretanto, os objetos criados receberão esses valores que foram definidos
public class Conta {
    //atributos da classe Conta
    double saldo;
    int agencia;
    int numero;
    String titular;

    //métodos da classe Conta
    //o método pode ter nenhum, um ou mais parâmetros
    public void deposita(double valor){
        //o atributo saldo receberá o valor do depósito
        //usamos o this pois  o saldo é referente a determinada conta - e é um atributo da classe
        this.saldo += valor;
    }

    //retorna um boolean - se conseguiu sacar é true, se não, false
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }

    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo>= valor){
            this.saldo -= valor;
            destino.saldo += valor; //ou destino.deposita(valor);
            return true;
        }
        else{
            return false;
        }
    }

}
