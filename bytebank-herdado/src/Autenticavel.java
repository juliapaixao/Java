//interface = contrato
//toda classe que "assinar" o contrato com a interface, deve implementar seus métodos
//em outras palavras, quem implementa a interface precisa construir obrigatoriamente os seus métodos
//interface é uma classe abstrata com todos os métodos abstratos
//dentro da interface não tem nada concreto

public abstract interface Autenticavel {

    public abstract void setSenha(int senha) ;

    public abstract boolean autentica(int senha) ;
}
