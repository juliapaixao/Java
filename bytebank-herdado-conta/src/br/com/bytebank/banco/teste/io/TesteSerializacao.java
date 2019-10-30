package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("Júlia");
        cliente.setProfissao("Front-end Developer");
        cliente.setCpf("15767890865");

        ContaCorrente cc = new ContaCorrente(11,22);
        cc.setTitular(cliente);
        cc.deposita(500.00);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

    }
}
