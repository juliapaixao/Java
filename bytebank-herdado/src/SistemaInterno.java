public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa) {

        boolean autenticou = fa.autentica(this.senha);

        if (autenticou) {
            System.out.println("Login realizado com sucesso (: ");
        } else {
            System.out.println("Login não pode ser realizado :( ");
        }
    }
}