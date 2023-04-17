package com.javabasico;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("introduce un numero");
        int numero = scanner.nextInt();

        System.out.println("el nombre es: " + nombre);
        System.out.println("El numero es: " + numero);

        System.out.println("Hola Mundo");
    }
}
