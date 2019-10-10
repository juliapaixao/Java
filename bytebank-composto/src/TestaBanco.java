public class TestaBanco {
    public static void main(String[] args) {
        //criando um cliente
        Cliente joao = new Cliente();
        joao.nome = "João Henrique";
        joao.cpf = "123.456.678-32";
        joao.profissao = "arquiteto";
        System.out.println(joao.nome);

        //criando uma conta para o João
        Conta contaJoao = new Conta();
        contaJoao.deposita(100);

        //fazendo a conexão entre as classes cliente e conta - associa o cliente (joao) a conta (contaJoao)
        contaJoao.titular = joao;
        System.out.println(contaJoao.titular.nome);
        System.out.println(contaJoao.titular.cpf);

    }
}
