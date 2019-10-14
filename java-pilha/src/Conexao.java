public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
        //a exception acima é padrão do java!
    }

//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}