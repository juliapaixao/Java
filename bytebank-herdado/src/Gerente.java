////classe Gerente herda atributos da classe Funcionario - para fazer essa ligação, usamos o EXTENDS
//
//public class Gerente extends FuncionarioAutenticavel {
//
//
//
//    //funcionário ganha bonificação
//    //super - indica que o atributo salário é da classe mãe e não da classe atual(gerente)
//    //super.getBonificacao() - está pegando o método getBonificacao da classe Funcionário -
//    // PS: é uma forma melhor de se fazer, pois se o valor da bonificação na classe Funcionário mudar, aqui irá mudar automaticamente
//    public double getBonificacao() {
//        System.out.println("Chamando o método de bonificacao do Gerente");
//        return super.getSalario();
//    }
//
//
//    public void setSenha(int senha) {
//        this.senha = senha;
//    }
//}
//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel

//Gerente é um Funcionário, que herda de Funcionário e implementa de Autenticável
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }


    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }


    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}

