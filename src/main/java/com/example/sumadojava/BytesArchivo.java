package com.example.sumadojava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BytesArchivo {
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("fich21.txt");

        BufferedInputStream buffer = new BufferedInputStream(file);

        System.out.println("Bytes disponibles al principio: " + buffer.available());

        buffer.read();
        buffer.read();
        buffer.read();

        System.out.println("Bytes disponibles al final: " + buffer.available());

        buffer.close();
    }
}
