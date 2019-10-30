package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String nome = "Júlia";

        //gera um arquivo do tipo bin (bits) - desserialização
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        //lê arquivo do tipo bin - serialização
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(ois);
    }
}
