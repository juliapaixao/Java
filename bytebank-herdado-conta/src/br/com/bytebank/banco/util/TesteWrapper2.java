package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper2 {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(22);
        System.out.println(idadeRef.doubleValue());

        Double dRef = Double.valueOf(2.3);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);
        System.out.println(refNumero.floatValue());

        List<Number> lista = new ArrayList<>();
        lista.add(22);
        lista.add(36.2);
        lista.add(23.1f);
        System.out.println(lista);
    }

}
