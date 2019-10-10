public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(158,789);
        //conta.numero = 3027; -----não podemos atribuir o valor dessa forma, pois o número é private, para isso, usamos o setNumero
        conta.setNumero(3027);
        System.out.println(conta.getNumero());

        Cliente julia = new Cliente();
        //conta.titular = julia;
        julia.setNome("julia");
        conta.setTitular(julia);
        //mostra o nome do titular da conta
        System.out.println(conta.getTitular().getNome());

        //altera a profissão do titular da conta
       conta.getTitular().setProfissao("engenheira");
       //mostra a profissão já alterada
        System.out.println(conta.getTitular().getProfissao());

    }
}
