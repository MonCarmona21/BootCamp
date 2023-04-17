package com.javabasico.Coche.interfaces;

import com.javabasico.Coche.Coche;
import com.javabasico.Coche.CocheElectrico;
import com.javabasico.Coche.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("destruyendo coche clasico");

    }
}
