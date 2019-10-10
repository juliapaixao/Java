public class TesteGerente {

    public static void main(String[] args) {

        Autenticavel aut = new Gerente();

        Gerente henrique = new Gerente();
        henrique.setNome("Carlos Henrique");
        henrique.setCpf("13467865345");
        henrique.setSalario(25000);
        henrique.setSenha(12345);

        //metodos da classe Funcionario que foram herdados pela classe Gerente
        System.out.println(henrique.getNome());
        System.out.println(henrique.getCpf());
        System.out.println(henrique.getSalario());
        System.out.println(henrique.getBonificacao());


        //metodo somente da classe Gerente
        boolean autenticou = henrique.autentica(12345);
        System.out.println("Senha correta: " + autenticou);

    }
}
