package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {


        //Equals -> é publico, devolve boolean e recebe um Object:  public boolean equals(Object ref)
        //A implementação do método equals da classe Object compara apenas as referências

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);
        Conta cc1 = new ContaCorrente(44,33);
        lista.add(cc1);

        boolean existe = lista.contains(cc);
        System.out.println("Já existe?");
        if (existe == true){
            System.out.println("Sim, já existe");
        }
        else{
            System.out.println("Não existe");
        }

        Conta cc3 = new ContaCorrente(44,33);
        boolean existe1 = lista.contains(cc3);
        System.out.println("Já existe?");
        if (existe1 == true){
            System.out.println("Sim, já existe");
        }
        else{
            System.out.println("Não existe");
        }


        for(Conta conta : lista) {
            if(conta.equals(cc3)) {
                System.out.println("Já tenho essa conta!");
            }
        }


        for(Conta conta : lista){
            System.out.println(conta);
        }



    }

}
