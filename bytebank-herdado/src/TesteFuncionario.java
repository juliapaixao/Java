public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario julia = new Designer();
        julia.setNome("Júlia");
        julia.setCpf("12567856445");
        julia.setSalario(8000);

        System.out.println("Nome: " + julia.getNome());
        System.out.println("Salário: " + julia.getSalario());
        System.out.println("Bonificação: " + julia.getBonificacao());

    }

}
