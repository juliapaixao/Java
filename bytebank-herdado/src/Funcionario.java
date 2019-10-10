//não se pode instanciar esta classe pois ela é abstrata
//abstract indica que o funcionário é algo abstrato
//abstract está sempre relacionado com herança
//ex: numa empresa todos são funcionários, mas um é programador, outro designer...Neste caso, não faz sentido termos alguém que seja APENAS do tipo Funcionario
//ngm cria objeto do tipo funcionário pois ele é abstrato


//Classe abstrata - não pode ser instanciada. Só pode servir como progenitora.
//Método abstrato - método que é declarado mas não implementado na progenitora. Ex.: public abstract double getBonificacao();
//
//public abstract class Funcionario {
//
//    private int senha;
//
//    public void setSenha(int senha) {
//        this.senha = senha;
//    }
//
//    public boolean autentica(int senha) {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//
//
//    private String nome;
//    private String cpf;
//    //protected double salario; //protected significa que os filhos desta classe, irão enxergar este atributo, porém outras classe não! (Público para os filhos)
//    private double salario;
//
//    //public Funcionario (String nome, String cpf, double salario){}
//
//    //método com abstract, é um método sem "corpo" - não foi implementado
//    public abstract double getBonificacao();
//
//
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome){
//            this.nome = nome;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public double getSalario() {
//        return salario;
//    }
//
//    public void setSalario(double salario) {
//        this.salario = salario;
//    }
//
//
//    public abstract boolean autentica(int senha);
//}

//nao pode instanciar dessa classe, pq é abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //metodo sem corpo, nao há implementacao
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }




}
