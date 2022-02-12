package com.sofka.ejerciciosjava;

public class Television extends Electrodomestico{

    private double resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        resolucion = 20;
        sintonizadorTDT = false;
    }

    public Television(double precio, double peso){
        super(precio, peso);
        resolucion = 20;
        sintonizadorTDT = false;
    }

    public Television(double resolucion, boolean sintonizadorTDT, double precio, double peso, String color, char consumoEnergetico){
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion(){ return resolucion; }

    public boolean getSintonizadorTDT(){ return sintonizadorTDT; }

    @Override
    public double precioFinal(){
        double precioPrevio = super.precioFinal();
        double precioFinal = precioPrevio;
        double precioResolucion = 0;
        if (this.sintonizadorTDT){ precioFinal += 50; }
        if (this.resolucion > 40){ precioResolucion = this.precioBase*0.3; }
        return precioFinal += precioResolucion;
    }
}
