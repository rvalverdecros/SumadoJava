package com.example.sumadojava;

public class Main {
    public static void main(String[] args) {


        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        /*
        Sumador sum = new Sumador();
        System.out.println(sum.sumatorio(n1,n2));
         */

        Lanzador l = new Lanzador();
        l.lanzarSumador(n1,n2, "");
    }
}
