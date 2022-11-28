package com.example.sumadojava;

public class Sumador {
    public Integer sumatorio(int n1,int n2)  {

        int new1;
        int new2;

        if (n1<n2) {
            new1 = n1;
            new2 = n2;
        }else{
            new1 = n2;
            new2 = n1;
        }

        int sumatorio = 0;

        for (int i = new1; i<= new2; i++){
            sumatorio = sumatorio + i;
        }

        return sumatorio;
    }

    public static void main(String[] args){
        Sumador s = new Sumador();
        int resultado = s.sumatorio(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println("El sumatorio vale " + resultado);
        System.exit(0);
    }
}
