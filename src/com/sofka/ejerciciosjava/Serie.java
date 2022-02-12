package com.sofka.ejerciciosjava;

public class Serie implements Entregable{

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(){
        titulo = "";
        numeroTemporadas = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.entregado = false;
        this.genero = "";
    }

    public Serie(String titulo, String creador, int numeroTemporadas, String genero){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = false;
        this.genero = genero;
    }

    public String getTitulo(){ return this.titulo; }
    public String getCreador(){ return this.creador; }
    public int getNumeroTemporadas(){ return this.numeroTemporadas; }
    public String getGenero(){ return this.genero; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
    public void setCreador(String creador){ this.creador = creador; }
    public void setNumeroTemporadas(int numeroTemporadas){ this.numeroTemporadas = numeroTemporadas; }
    public void setGenero(String genero){ this.genero = genero; }

    @Override
    public String toString(){
        String atributos;

        atributos=  "Título: "              + titulo          + "\n" +
                    "Creador: "             + creador         + "\n" +
                    "Número de Temporadas: "+ numeroTemporadas+ "\n" +
                    "Género: "              + genero          + "\n" +
                    "Entregado: "           + entregado       + "\n";
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
        Serie c1; // casting
        int resultado = 2;
        if(a instanceof Serie){
            c1 = (Serie)a; // casting
            if (this.numeroTemporadas<c1.numeroTemporadas){ resultado = -1; }
            else if (this.numeroTemporadas>c1.numeroTemporadas){ resultado = 1; }
            else { resultado = 0; }
        }
        return resultado;
    }
}
