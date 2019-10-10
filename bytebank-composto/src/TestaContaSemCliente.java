public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaJulia = new Conta();
        System.out.println(contaJulia.getSaldo());

        contaJulia.titular = new Cliente();
        //irá aponter para o endereço da memória
        System.out.println(contaJulia.titular);

        contaJulia.titular.nome = "Júlia";
        System.out.println(contaJulia.titular.nome);

    }

}
