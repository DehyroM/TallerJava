package com.sofka.ejerciciosjava;

import javax.net.ssl.SNIHostName;

public class Videojuego implements Entregable{

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego(){
        titulo = "";
        horasEstimadas = 10;
        entregado = false;
        genero = "";
        compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        entregado = false;
        genero = "";
        compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo(){ return this.titulo; }
    public int getHorasEstimadas(){ return this.horasEstimadas; }
    public String getGenero(){ return this.genero; }
    public String getCompañia(){ return this.compañia; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
    public void setHorasEstimadas(int horasEstimadas){ this.horasEstimadas = horasEstimadas; }
    public void setGenero(String genero){ this.genero = genero; }
    public void setCompañia(String compañia){ this.compañia = compañia; }

    @Override
    public String toString(){
        String atributos;

        atributos=  "Título: "          + titulo         + "\n" +
                    "Horas estimadas: " + horasEstimadas + "\n" +
                    "Género: "          + genero         + "\n" +
                    "Compañía: "        + compañia       + "\n" +
                    "Entregado: "       + entregado      + "\n";
        return atributos;
    }

    public void entregar(){
        this.entregado = true;
    }

    public void devolver(){
        this.entregado = false;
    }

    public boolean isEntregado(){
        return this.entregado;
    }

    @Override
    public int compareTo(Object a){
        Videojuego c1; // casting
        int resultado = 2;
        if(a instanceof Videojuego){
            c1 = (Videojuego) a; // casting
            if (this.horasEstimadas<c1.horasEstimadas){ resultado = -1; }
            else if (this.horasEstimadas>c1.horasEstimadas){ resultado = 1; }
            else { resultado = 0; }
        }
        return resultado;
    }
}
