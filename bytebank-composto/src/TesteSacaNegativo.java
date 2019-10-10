public class TesteSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);

        //proibido
        //da forma abaixo, estaremos acessando diretamente a classe, o correto é acessar os seus métodos
        //fazendo uma analogia: para acelerar com o carro, você simplesmente usa o acelerador, não precisa mexer nos mecanismos internos para forçar isso
        //se vc trocar de carro, saberá utilizar da mesma forma
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);

        //chamando método para conferir saldo
        System.out.println(conta.getSaldo());
    }
}
