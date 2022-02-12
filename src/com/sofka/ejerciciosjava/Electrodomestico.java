package com.sofka.ejerciciosjava;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico(){
        precioBase = 100;
        peso = 5;
        consumoEnergetico = 'F';
        color = "blanco";
    }

    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        consumoEnergetico = 'F';
        color = "blanco";
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico){
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public double getPrecioBase(){
        return precioBase;
    }

    public String getColor(){
        return color;
    }

    public char getConsumoEnergetico(){ return consumoEnergetico; }

    public double getPeso(){ return peso; }

    public void comprobarConsumoEnergetico(char letra){
        String consumo = String.valueOf(letra);
        String letras="[ABCDEF]";
        String nuevaLetra = consumo.replaceAll(letras,"");
        if(nuevaLetra.equals("")){
            consumoEnergetico = letra;
        }else{
            consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color){

        String reemplazo="[ blanco negro rojo azul gris BLANCO NEGRO ROJO AZUL GRIS Blanco Negro Rojo Azul Gris ]";
        if(reemplazo.contains(color)){
            if (color.contains(" ")){
                this.color = "blanco";
            }else{
                this.color = color;
            }
        }else{
            this.color = "blanco";
        }
    }

    public double precioFinal(){

        Map<Character, Double> precioConsumo = new HashMap<>();
        precioConsumo.put('A', 100.0);
        precioConsumo.put('B', 80.0);
        precioConsumo.put('C', 60.0);
        precioConsumo.put('D', 50.0);
        precioConsumo.put('E', 30.0);
        precioConsumo.put('F', 10.0);
        precioConsumo.computeIfPresent(consumoEnergetico, (k, v) -> v + precioBase);
        double precioConsumoEnergetico = precioConsumo.get(consumoEnergetico);
        double precio = calcularPrecioPeso(precioConsumoEnergetico);
        return precio;
    }

    public double calcularPrecioPeso(double precio){
        if(this.peso<80){
            if(this.peso<50){
                if(this.peso<20){
                    precio += 10;
                } else precio += 50;
            }else precio += 80;
        }else precio += 100;
        return precio;
    }
}
