package com.example.sumadojava;

import java.io.File;

public class Borrarfichero {
    public static void main(String[] args) throws Exception{
        File miFichero = new File("pruebaFichero.txt");

        miFichero.delete();


        if (miFichero.exists()) {
            System.out.println(miFichero.getName() + " existe");
        }else {
            System.out.println(miFichero.getName() + " NO existe");
        }
    }
}
