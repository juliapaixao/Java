public class FluxoComErro {
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        }
        catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception: " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }


    private static void metodo1()  {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }


    private static void metodo2() {
        System.out.println("Iniciando chamada do método 2");
        metodo2();
        System.out.println("Finalizando chamada do método 2");
    }

}

