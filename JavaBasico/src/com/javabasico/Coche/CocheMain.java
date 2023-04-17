package com.javabasico.Coche;

public class CocheMain {

    public static void main(String[] args) {
        String coche = "alfa romeo";
        //Coche cocheObj= new Coche();

        Coche cocheObj2 = new CocheElectrico("motor", "Honda", "Civic", "Verde", 1550.5, 150.3);

        //cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.5;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Ferrari";
        cocheElectrico.modelo = "A4";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("TXZ", "Ferrari", "A4","verde", 1000.5, 5.5);

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);

    }
}
