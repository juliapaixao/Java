public class CriaConta {
    public static void main(String[] args) {
        //cria uma conta do tipo Conta(classe) e insere saldo
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("O saldo da conta 1 é: " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("O saldo da conta 1 é: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 10000;
        System.out.println("O saldo da conta 2 é: " + segundaConta.saldo);


    }
}
