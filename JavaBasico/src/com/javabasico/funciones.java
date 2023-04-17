package com.javabasico;

public class funciones {

    public static void main(String[] args){

        holaMundo();
        holaMundo(4);
        holaMundo("Luis");
        holaMundo("Luis", "Rodriguez");

        //holaMundo("Alan");
        //holaMundo("Roberto");

        String hola = devolverHola();
        System.out.println(hola);
    }

    public static void holaMundo(){
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static void holaMundo(Integer number){
        System.out.println("Hola " + number);
    }

    private static void holaMundo(String name){
        System.out.println("Hola " + name);
    }

    private static void holaMundo(String name, String surname){
        System.out.println("Hola " + name + " " + surname);
    }

    private static String devolverHola(){
        return "Hola";
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
    }


}
