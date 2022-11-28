package com.example.sumadojava;

import java.util.Scanner;

public class EntradaJava {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre");

        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");

        int edad = sc.nextInt();

        System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años.");
    }
}