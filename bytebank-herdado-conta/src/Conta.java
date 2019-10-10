public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;


    public Conta(int agencia, int numero){
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }


    public abstract void deposita(double valor);


    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }

    }

    //exemplo de polimorfismo - o parâmetro é do tipo Conta(tipo genérico) e serve para a conta corrente, conta poupança..
    public boolean transfere(double valor, Conta destino){
        if(this.saldo>= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
        else{
            return false;
        }
    }


    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }


    public void setNumero(int numero){
        if (numero < 0){
            System.out.println("Não pode ser um número abaixo de 0.");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if (agencia < 0){
            System.out.println("Não pode ser um número abaixo de 0.");
            return;
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
