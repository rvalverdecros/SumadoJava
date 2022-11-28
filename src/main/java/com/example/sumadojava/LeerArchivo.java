package com.example.sumadojava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LeerArchivo {
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("fich21.txt");

        BufferedInputStream input = new BufferedInputStream(file);



        /*for(int i = input.read();i <= 1 ;i++) {
            System.out.print((char) i);
            i = input.read();
        }*/

        input.close();
    }
}
