package com.javabasico;

public class Switch {

    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather){

            case "sunny":
                System.out.println("Es soleado");
                break;

            case "cloudy":
                System.out.println("Esta nublado");
                break;
            default:
                System.out.println("El hoy no existe");
                break;
        }

    }
}
