package com.sofka.ejerciciosjava;

import java.nio.channels.spi.AbstractSelector;
import java.util.ArrayList;

public class Electrodomesticos {

    public static ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

    public static void main(String[] args) {

        Electrodomestico estufa = new Electrodomestico(200, 10);
        Lavadora lavadoraWhirlpool = new Lavadora(32,100,15,"AZUL",'B');
        Lavadora lavadoraLG = new Lavadora(18,110,21,"Gris",'E');
        Lavadora lavadoraMabe = new Lavadora(150,25);
        Lavadora lavadoraSamsung = new Lavadora(10,90,11,"Rojo",'C');
        Television televisorChallenger = new Television(80,5);
        Television televisorLG = new Television(95,3);
        Television televisorSimply = new Television(41,true,150,4,"Negro",'A');
        Television televisorSamsung = new Television();
        Television televisorSony = new Television(21,false,100,10,"BLANCO",'D');

        electrodomesticos.add(estufa);
        electrodomesticos.add(lavadoraWhirlpool);
        electrodomesticos.add(lavadoraLG);
        electrodomesticos.add(lavadoraMabe);
        electrodomesticos.add(lavadoraSamsung);
        electrodomesticos.add(televisorChallenger);
        electrodomesticos.add(televisorLG);
        electrodomesticos.add(televisorSimply);
        electrodomesticos.add(televisorSamsung);
        electrodomesticos.add(televisorSony);

        double precioTelevisores = 0;
        double precioLavadoras = 0;
        double precioTotal = 0;
        double precio;

        for (int i = 0; i < electrodomesticos.size(); i++) {
            precio = electrodomesticos.get(i).precioFinal();
            if (electrodomesticos.get(i) instanceof Lavadora){
                precioLavadoras += precio;
            }else if (electrodomesticos.get(i) instanceof Television){
                precioTelevisores += precio;
            }
            precioTotal += precio;
        }
        System.out.println("El precio de los electrodomésticos es: "+precioTotal +" € ");
        System.out.println("El precio de las lavadoras es: "+precioLavadoras + " € ");
        System.out.println("El precio de los televisores es: "+precioTelevisores + " € ");
    }
}
