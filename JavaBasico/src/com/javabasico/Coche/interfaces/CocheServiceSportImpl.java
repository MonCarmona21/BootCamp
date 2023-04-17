package com.javabasico.Coche.interfaces;

import com.javabasico.Coche.Coche;
import com.javabasico.Coche.CocheElectrico;
import com.javabasico.Coche.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("destruir coche de carreras");

    }
}
