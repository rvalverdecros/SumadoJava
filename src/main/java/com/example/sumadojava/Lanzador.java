package com.example.sumadojava;

import java.io.File;

public class Lanzador {
    public void lanzarSumador(Integer n1,Integer n2,String fichResultado)  {
        File fileOutput = new File(fichResultado);
        String clase = "com.example.sumadojava.Sumador";

        ProcessBuilder pb;

        try {

            pb = new ProcessBuilder("java",clase,n1.toString(),n2.toString());
            pb.redirectError(new File("resources/errores.txt"));
            pb.redirectOutput(fileOutput);
            pb.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){

        Lanzador l = new Lanzador();
        l.lanzarSumador(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"resources/resultado1.txt");
        System.out.println("OK");

    }
}
