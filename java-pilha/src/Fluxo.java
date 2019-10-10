public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        // try catch - serve para tratar as Exceptions
        try { //try - diz pra máquina virtual tratar com cuidado as linhas dentro do escopo
            metodo1();
        }
        catch(ArithmeticException ex) { //catch - coloca o nome da Exception e cria uma variável - dentro do escopo ficará a forma como a máquina deverá tratar o código
            System.out.println("ArithmeticException");
        }
        System.out.println("Fim do main");
    }


    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();

        System.out.println("Fim do metodo1");
    }


    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i/0;




        }
        System.out.println("Fim do metodo2");
    }

}

