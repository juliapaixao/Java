//classe conta
// dá para definir os valores dos atributos, entretanto, os objetos criados receberão esses valores que foram definidos
public class Conta {
    //atributos da classe Conta
    //normalmente os atributos são privados! raramente são public
    private double saldo;
    int agencia;
    int numero;
    //criando referencia para um objeto do tipo Cliente
    Cliente titular;

    //métodos da classe Conta
    //o método pode ter nenhum, um ou mais parâmetros
    public void deposita(double valor){
        //o atributo saldo receberá o valor do depósito
        //usamos o this pois  o saldo é referente a determinada conta
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

    //"genérico" do get
    //public double pegaSaldo(){
       // return this.saldo;
    //}

    //como o saldo é privado, criamos o método GET para que outras classes possam acessá-lo mas sem modificá-lo - quem faz a modificação é o SET
    public double getSaldo(){
        return this.saldo;
    }

}
