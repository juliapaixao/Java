//Criando uma exceção - exceções criadas devem herdar de Exception
//Classes que herdam do Exception são CHECKED, ou seja, são verificadas pelo compilador
//Classes que herdam do RuntimeException são UNCHECKED, ou seja, NÃO são verificadas pelo compilador
//ma hora de executar não faz diferença se é checked ou unchecked

public class MinhaExcecao extends Exception{

    public MinhaExcecao(String msg){
        super(msg);
    }

}
