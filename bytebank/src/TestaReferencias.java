public class TestaReferencias {
    public static void main(String[] args) {
            Conta primeiraConta = new Conta();
            primeiraConta.saldo = 300;

            System.out.println("saldo da primeira: " + primeiraConta.saldo);

            //a linha abaixo fará com que a primeira e sugunda conta apontem para o mesmo local, sendo assim, serão a mesma conta
            Conta segundaConta = primeiraConta;

            System.out.println("saldo da segunda conta: " + segundaConta.saldo);

            segundaConta.saldo += 100;
            System.out.println("saldo da segunda conta " + segundaConta.saldo);

            //como agora as duas contas são as mesmas, o valor que estiver em uma, automaticamente estará na outra
            System.out.println("saldo da primeira: " + primeiraConta.saldo);

            //compara se as duas contas são as mesmas
            if(primeiraConta == segundaConta) {
                System.out.println("é a mesma conta");
            }
        System.out.println("Endereço da primeira conta: " + primeiraConta);
        System.out.println("Endereço da segunda conta: " + segundaConta);
    }
}

