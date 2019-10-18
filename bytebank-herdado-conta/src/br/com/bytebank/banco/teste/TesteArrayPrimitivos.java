package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

    //Array []
    public static void main(String[] args) {

        int[] idades  = new int[5]; //Array do tipo int com nome idades, que contém 5 elementos com valor padrão, que é 0

//        idades[0] = 22;
//        idades[1] = 36;
//        idades[2] = 35;
//        idades[3] = 50;
//
//        int idade = idades[1];
//        int idade1 = idades[3];
//        System.out.println(idade);
//        System.out.println(idade1);
//
//        int tamanho = idades.length;
//        System.out.println("Tamanho do array: " + tamanho);

        //Criando laço com array
        for(int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }


    }
}
