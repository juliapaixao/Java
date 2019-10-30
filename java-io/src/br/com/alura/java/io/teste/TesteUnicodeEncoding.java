package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String c = "C";
        System.out.println("Representação decimal do caracter na tabela ASCII: " + c.codePointAt(0)); //unicode


        Charset charset = Charset.defaultCharset();
        System.out.println("Charset utilizado: " + charset.displayName());


        byte[] bytes = c.getBytes("windows-1252");
        System.out.print("Quantidade de bytes (segundo windows -1252): " + bytes.length + " ; ");
        //Transformando charset em caracter
        String cNovo = new String(bytes,"windows-1252");
        System.out.println(cNovo);


        bytes = c.getBytes("UTF-16");
        System.out.print("Representação UTF-16: " + bytes.length + " ; ");
        //Transformando charset em caracter
        cNovo = new String(bytes,"UTF-16");
        System.out.println(cNovo);

        bytes = c.getBytes(StandardCharsets.US_ASCII);
        System.out.print("Representação US-ASCII: " + bytes.length + " ; ");
        //Transformando charset em caracter
        cNovo = new String(bytes,"US-ASCII");
        System.out.println(cNovo);
    }
}
