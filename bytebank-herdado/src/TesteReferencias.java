public class TesteReferencias {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(50);

//        Funcionario f = new Funcionario();
//        f.setSalario(20);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(10);

        Designer d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        //controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }
}
