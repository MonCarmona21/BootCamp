package com.javabasico.Coche;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
        this.motorElectrico = motorElectrico;

    }

    public CocheElectrico(String motorElectrico, String marca, String modelo, String color, double peso, double largo) {
        super(marca, modelo, color, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';

    }
}