package com.sofka.ejerciciosjava;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    protected static double precioBase;
    protected static String color;
    protected static char consumoEnergetico;
    protected static double peso;

    public Electrodomestico(){
        precioBase = 100;
        peso = 5;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico){
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public void getPrecioBase(double precioBase){
        this.precioBase = precioBase;
    }

    public void getColor(String Color){
        this.color = color;
    }

    public void getConsumoEnergetico(char consumoEnergético){
        this.consumoEnergetico = consumoEnergético;
    }

    public void getPeso(double peso){
        this.peso = peso;
    }

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



    public static void main(String[] args) {
        Electrodomestico equipo= new Electrodomestico(180, 10, "AZUL",'B');
        System.out.println(equipo.precioFinal());

    }


}
