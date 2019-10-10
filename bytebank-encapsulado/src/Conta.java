//classe conta
// dá para definir os valores dos atribuitos, entretanto, os objetos criados receberão esses valores que foram definidos
public class Conta {
    //atributos da classe Conta
    //normalmente os atributos são privados! raramente são public
    private double saldo;
    private int agencia;
    private int numero;
    //criando referencia para um objeto do tipo Cliente
    private Cliente titular;
    private static int total; //static indica que total é um atributo da classe e não do objeto

    //construtor é utilizado para inicialização dos atributos
    //construtor, não é um método - ele faz com que uma conta SÓ seja criada se os parâmetros que estão nele, forem preenchidos
    //o java já cria automaticamente
    public Conta(int agencia, int numero){
        total++; //contador para saber quantas contas existem, ou seja, foram instanciadas
        //System.out.println("O total de contas: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Número da conta: " + numero);
        //System.out.println("Agência : " + agencia);
    }


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

    public int getNumero(){
        return this.numero;
    }

    //o método set, permite fazer alterações no atributo
    public void setNumero(int numero){
        if (numero < 0){
            System.out.println("Não pode ser um número abaixo de 0.");
            return; //ao usar só o return, ele para
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if (agencia < 0){
            System.out.println("Não pode ser um número abaixo de 0.");
            return; //ao usar só o return, ele para
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
