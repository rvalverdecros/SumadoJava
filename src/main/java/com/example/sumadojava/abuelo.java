package com.example.sumadojava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class abuelo {
    public static void main(String[] args) throws Exception{
        File fi = new File("fin.txt");
        File ru = new File("target/classes");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fi,true));
        String tx ="El output del sumador 101 es: ";
        bw.write(tx);
        bw.close();

    }
}
