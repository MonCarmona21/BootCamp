package com.javabasico;

public class bucleWhile {

    public static void main(String[] args){

        boolean check = true;

        int count = 0;
        while (count < 10){
            count++; //condicion

            if(count == 6)
                break; //rompe el flujo de ejecucion
                //continue; //salta el valor 6 y continua a la siguiente iteración

            System.out.println("Hola mundo" + count);




        }
        System.out.println("fin");
    }
}
