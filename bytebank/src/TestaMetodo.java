public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 1000;

        //testando método deposita
        conta.deposita(500);
        System.out.println(conta.saldo);

        //testando método saca
        boolean conseguiuRetirar = conta.saca(200);
        System.out.println(conta.saldo);
        System.out.println("Conseguiu retirar?  "  + conseguiuRetirar);


        //cria uma nova conta para realizar transferencia
        Conta contaJulia = new Conta();
        contaJulia.saldo= 50000;
        System.out.println("Saldo da conta da Júlia: " + contaJulia.saldo);

        //testando método transferência
        contaJulia.transfere(1000,conta);
        System.out.println("Saldo atual da conta da Júlia: " + contaJulia.saldo);

        System.out.println(conta.saldo);
    }
}
