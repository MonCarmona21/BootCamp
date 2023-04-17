package com.javabasico.Coche.interfaces;

import com.javabasico.Coche.Coche;

public class InterfacesMain {

    public static void main(String[] args){

        CocheService service =  new CocheServiceSportImpl();


        Coche coche = service.crearCocheDemo();





    }
}
