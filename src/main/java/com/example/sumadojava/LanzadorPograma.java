package com.example.sumadojava;

import java.io.*;

public class LanzadorPograma {
    public static void main(String[] args) throws Exception {
        File ruta = new File("C:\\Users\\usuario tarde");
        ProcessBuilder pb = new ProcessBuilder("notepad");
        ProcessBuilder pb2 = new ProcessBuilder("chrome");
        pb.directory(ruta);
        pb.start();
    }
}
