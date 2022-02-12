package com.sofka.ejerciciosjava;

import javax.swing.*;
import java.util.ArrayList;

public class Multimedia {

    public static ArrayList<Serie> series = new ArrayList<Serie>();
    public static ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();

    public static void main(String[] args) {

        Serie demonSlayer = new Serie("Kimetsu No Yaiba","Koyoharu Gotoge",2,"acción");
        Serie onePiece = new Serie("One Piece","Eiichiro Oda",20,"fantasía");
        Serie pokemon = new Serie("Pokemon","Satoshi Tajiri",18,"aventura");
        Serie inuyasha = new Serie("Inuyasha","Josuka Toyotaro",6,"sobrenatural");
        Serie dragonBallZ = new Serie("Dragon Ball Z","Akira Toriyama",9,"acción");
        Videojuego superMario = new Videojuego("Super Mario Bros",11,"aventura","Nintendo");
        Videojuego zelda = new Videojuego("The Legend of Zelda",20,"aventura","Nintendo");
        Videojuego halo = new Videojuego("Halo",40,"acción","Bungie - Xbox");
        Videojuego sonic = new Videojuego("Sonic the Hedgehog",21,"aventura","Sega - Sonic");
        Videojuego spiderman = new Videojuego("Marvel's Spiderman",25,"aventura","PS, Marvel, Sony");

        series.add(demonSlayer);
        series.add(onePiece);
        series.add(pokemon);
        series.add(inuyasha);
        series.add(dragonBallZ);
        videojuegos.add(superMario);
        videojuegos.add(zelda);
        videojuegos.add(halo);
        videojuegos.add(sonic);
        videojuegos.add(spiderman);

        series.get(1).entregar();
        series.get(2).entregar();
        videojuegos.get(2).entregar();
        videojuegos.get(3).entregar();

        int entregado = 0;

        for (int i = 0; i < series.size(); i++) {
            if(series.get(i).isEntregado()){
                series.get(i).devolver();
                entregado ++;
            }if (videojuegos.get(i).isEntregado()){
                videojuegos.get(i).devolver();
                entregado ++;
            }
        }
        System.out.println(series.get(0).compareTo(series.get(1)));


        System.out.println("Había "+entregado+" series/videojuegos entregados");


    }
}
