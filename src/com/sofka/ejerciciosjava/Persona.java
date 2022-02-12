package com.sofka.ejerciciosjava;

import java.net.SocketTimeoutException;
import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        nombre = "";
        edad = 0;
        sexo = 'H';
        peso = 0;
        altura = 0;
        comprobarSexo(sexo);
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo(sexo);
        generarDNI();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
        comprobarSexo(sexo);
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }


    public int calcularIMC(){

        if (altura == 0){
            //No se puede calcular el IMC:
            return 2;
        }else{
            double IMC = peso/(Math.pow(altura,2));
            final int resultado;
            if (IMC < 20){
                resultado = -1;
            }else if (IMC >=20 && IMC <=25){
                resultado = 0;
            }else{
                resultado = 1;
            }
            return resultado;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public void comprobarSexo(char sexo){
        this.sexo = sexo;
        if(sexo != 'M'){
            this.sexo = 'H';
        }
    }
    @Override
    public String toString(){
        String atributos;

        atributos=  "Nombre: " + nombre + "\n" +
                    "Edad: "   + edad   + "\n" +
                    "DNI: "    + DNI    + "\n" +
                    "Sexo: "   + sexo   + "\n" +
                    "Peso: "   + peso   + "\n" +
                    "Altura: " + altura + "\n";
        return atributos;
    }

    public void generarDNI(){

        Random random = new Random();
        String dni="";
        String aux;
        int number;
        for (int i = 0; i < 8; i++) {
            number = (int)(Math.random() * 10);
            aux = String.valueOf(number);
            dni= dni+aux;
        }
        char caracterAleatorio = Character.toUpperCase((char) (random.nextInt(26) + 'a'));
        this.DNI = dni+caracterAleatorio;
    }
}
