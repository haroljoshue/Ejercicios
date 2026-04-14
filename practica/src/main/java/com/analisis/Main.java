package com.analisis;

import java.util.Scanner;

public class Main {

    private int n;
    private int[] digitos;
    private int[] sumaDigitos;

    public Main(int n) {
        this.n = n;
        this.digitos = new int[n];
        this.sumaDigitos = new int[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del arreglo: ");
        int n = sc.nextInt();

        Main main = new Main(n);

        main.llenarArreglo();
        main.sumarDigitos();
        System.out.println("Arreglo de digitos: ");
        main.mostrar(main.digitos);
        System.out.println("\nSuma de digitos: ");
        main.mostrar(main.sumaDigitos);
    }

    //Ejericicio 1
    //Realizar un programa que genere valores en un arreglo de longitud n. 
    //Realizar la suma de los digitos de cada elemento del arreglo y almacenar el resultado en otro arreglo.
    public void llenarArreglo() {
        int pos = 0;
        for (pos = 0; pos < digitos.length; pos++) {
            digitos[pos] = (int) (Math.random() * 50);
        }
    }

    public void sumarDigitos() {
        int pos = 0;
        for (pos = 0; pos < digitos.length; pos++) {
            int numero = digitos[pos];
            int suma = 0;
            while (numero > 0) {
                int digito = numero % 10;
                suma += digito;
                numero /= 10;
            }
            sumaDigitos[pos] = suma;
        }

    }

    public void mostrar(int arreglo[]) {
        int pos = 0;
        for (pos = 0; pos < arreglo.length; pos++) {
            System.out.print(arreglo[pos] + " ");
        }
    }

    //Realizar un programa que permita ingresar numeros enteroos aleat en una matriz de orden mxn econtrar la cant de  numeros primos existentes en la matriz y almacernarla en un arreglo

}
