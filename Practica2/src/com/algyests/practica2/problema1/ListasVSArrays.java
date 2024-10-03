package com.algyests.practica2.problema1;

import java.util.Scanner;

public class ListasVSArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        int t = 1;
        do{
            System.out.print("Ingrese la cantidad de valores (Debe ser par): ");
            n = sc.nextInt();
        }while (n % 2 != 0);
        do{
            System.out.println("Ingrese el valor T: ");
            t = sc.nextInt();
        }while(t <= 1 || t >= n);
        
        int mitad = n/2;

        int[] numeros = new int[n];

        for (int ind = 0; ind < n; ind++) {
            System.out.println("Ingrese el valor " + (ind+1) + ": ");
            numeros[ind] = sc.nextInt();
        }

        imprimir(numeros);
        System.out.println("");

        int i,ind = 0,mitad1, mitad2, temp = numeros[0], actual;
        mitad1 = mitad2 = t/2;
        if (t%2 == 1) mitad1++;
        
        for (i = 0; i<mitad; i++)
        {
        	actual = temp;
        	ind = (ind+mitad1)%mitad;
        	temp = numeros[ind];
        	numeros[ind] = actual;
        }
        
        temp = numeros[mitad];
        for (i = 0; i<mitad; i++)
        {
        	actual = temp;
        	ind = ((ind+mitad2)%mitad) + mitad;
        	temp = numeros[ind];
        	numeros[ind] = actual;
        }
        
        imprimir(numeros);
    }

    public static void imprimir(int[] numeros){
        for (int ind = 0; ind < numeros.length; ind++) {
            System.out.print(numeros[ind] + " ");
        }
    }
}
