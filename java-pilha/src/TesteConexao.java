public class TesteConexao {

    public static void main(String[] args) {

//        Conexao con = null;
//        try { //o try só funciona se tiver um catch ou finally
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Erro na conexão :/");
//        } finally { //bloco opcional que pode colocar no final do try-catch para rodar um  determinado comando que sempre será executado, isto é, se possuir erro ou não.
//            System.out.println("finally");
//            if (con != null) {
//                con.close();
//            }
//        }


        //----------------------------------------------------------------------------------------
        //Código acima de forma simplificada

        try (Conexao conexao = new Conexao()){ // automaticamente é criado um bloco finally, nele é chamado o método close() do recurso.
            conexao.leDados();
        }
        catch (IllegalStateException ex) {
            System.out.println("Erro na conexão :/");
        }







    }
}
