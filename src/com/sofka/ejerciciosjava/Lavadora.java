package com.sofka.ejerciciosjava;

public class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora(){
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, double peso){
        super(precio, peso);
        this.carga = 5;
    }

    public Lavadora(double carga, double precio, double peso, String color, char consumoEnergetico){
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga(){ return carga; }

    @Override
    public double precioFinal(){
        double precioPrevio = super.precioFinal();
        double precioFinal = precioPrevio;
        if (this.carga > 30.0){ precioFinal = precioPrevio + 50.0;}
        return precioFinal;
    }
}
