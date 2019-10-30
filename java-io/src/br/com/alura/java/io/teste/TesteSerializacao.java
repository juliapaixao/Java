package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Júlia");
        cliente.setProfissao("Front-end Developer");
        cliente.setCpf("15767890865");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();



//        String nome = "Júlia";

        //gera um arquivo do tipo bin (bits) - desserialização
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        //lê arquivo do tipo bin - serialização
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//        String nome = (String) ois.readObject();
//        ois.close();
//        System.out.println(ois);
    }
}
