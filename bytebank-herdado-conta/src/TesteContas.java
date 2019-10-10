public class TesteContas {

    public static void main(String[] args) {

        int a = 3;
        int b = a/0;

        ContaCorrente cc = new ContaCorrente(6148, 8976465);
        cc.deposita(1500);
        System.out.println("Saldo CC: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(7854,5678265);
        cp.deposita(4890);
        System.out.println("Saldo CP: " + cp.getSaldo());

        cc.saca(100);
        System.out.println("Saldo CC após saque: " + cc.getSaldo());

        cp.saca(800);
        System.out.println("Saldo CP após saque: " + cp.getSaldo());

        cp.transfere(1000,cc);
        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

    }
}
