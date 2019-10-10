public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(123, 456);

        conta.setAgencia(-89);
        conta.setNumero(-90);
        Conta conta1 = new Conta(45678, 1235);
        Conta conta2 = new Conta(3434, 4343);
        System.out.println("Total de contas: " + Conta.getTotal());

    }
}
