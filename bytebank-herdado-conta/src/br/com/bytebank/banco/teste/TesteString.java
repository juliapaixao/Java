package br.com.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {

        String nome = "julia"; //objeto literaL
        //String outro = new String("Júlia)
        System.out.println(nome);

        //replace: altera caracteres
        String outra = nome.replace("ju", "Jú");
        System.out.println(outra);

        String outra1 = nome.toLowerCase();
        System.out.println("Letras minúsculas: " + outra1);

        String outra2 = nome.toUpperCase();
        System.out.println("Letras maiúsculas: " + outra2);

        String outra3 = nome.replace('i', 'y');
        System.out.println("Alterando um caracter: " + outra3);

        char a = nome.charAt(3);
        System.out.println("Letra que está na posição 3: " + a);

        int posicao = nome.indexOf("a");
        System.out.println("Posição da letra a: " + posicao);

        String substring = nome.substring(1);
        System.out.println("Substring: " + substring);

        int tamanho = nome.length();
        System.out.println("Tamanho: " + tamanho);

        //método que imprime caracter por caracter
        for (int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

        //verifica se a string está vazia
        String vazia = " ";
        System.out.println("String vazia: " + vazia.isEmpty());
        String vazia1 = "";
        System.out.println("String vazia: " + vazia1.isEmpty());

        //tira espaço no início e fim de uma string
        String vazia2 = vazia.trim();
        System.out.println("Espaços removidos! " + vazia2);
        System.out.println("String vazia: " +  vazia2.isEmpty());

        //verifica se a string contém determinados caracteres/substring
        boolean contem = nome.contains("lia");
        System.out.println("Contém: " + contem);
        boolean contem1 = nome.contains("ail");
        System.out.println("Contém: " + contem1);
    }
}
