public class TesteSistema {

    //verifica senha
    public static void main(String[] args) {
        Gerente julia = new Gerente();
        julia.setSenha(12345);

        Administrador lorenna = new Administrador();
        lorenna.setSenha(12346);

        Cliente maria = new Cliente();
        maria.setSenha(2222);


        SistemaInterno si = new SistemaInterno();
        si.autentica(julia);
        si.autentica(lorenna);
        si.autentica(maria);
    }
}
