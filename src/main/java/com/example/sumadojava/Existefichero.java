package com.example.sumadojava;

import java.io.File;

public class Existefichero {
    public static void main(String[] args) throws Exception{
        File miFichero = new File("pruebaFichero.txt");

        if (miFichero.exists()) {
            System.out.println("El fichero existe!");
        }else {
            System.out.println("El fichero no existe!");
        }
    }
}
