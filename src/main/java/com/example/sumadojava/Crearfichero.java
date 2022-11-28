package com.example.sumadojava;

import java.io.File;
import java.io.IOException;

public class Crearfichero {
    public static void main(String[] args) throws Exception{
        File nuevoFichero = new File("pruebaFichero.txt");
        if (nuevoFichero.createNewFile()) {
            System.out.println("Fichero creado correctamente!");
            System.exit(0);
        }else {
            System.out.println("No se ha podido crear el fichero!");
            System.exit(1);
        }
    }
}
