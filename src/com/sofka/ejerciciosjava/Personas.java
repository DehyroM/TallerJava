package com.sofka.ejerciciosjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Personas {

    static Scanner userData = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = "";
        int edad = 0;
        String DNI;
        char sexo = 'H';
        double peso = 0;
        double altura = 0;

        System.out.println("Por favor, ingrese el nombre: ");
        nombre = userData.nextLine();

        boolean salir = true;

        while(salir){
            try{
                System.out.println("Por favor, ingrese la edad: ");
                edad = userData.nextInt();
                try{
                    System.out.println("Por favor, ingrese el sexo: ");
                    sexo = userData.next().charAt(0);
                    try{
                        System.out.println("Por favor, ingrese el peso: ");
                        peso = userData.nextDouble();
                        try{
                            System.out.println("Por favor, ingrese la altura");
                            altura = userData.nextDouble();
                            salir = false;
                        }catch (InputMismatchException e){
                            System.out.println("Debes escribir un numero");
                            userData.next();
                        }
                    }catch (InputMismatchException e){
                        System.out.println("Debes escribir un numero");
                        userData.next();
                    }
                }catch (InputMismatchException e){
                    System.out.println("Debes escribir un caracter 'H' o 'M'");
                    userData.next();
                }
            }catch (InputMismatchException e){
                System.out.println("Debes escribir un número");
                userData.next();
            }
        }

        Persona personaA = new Persona(nombre, edad, sexo, peso, altura);

        Persona personaB = new Persona("Juan", 17, 'H');

        Persona personaC = new Persona();

        personaC.setNombre("Julia");
        personaC.setEdad(35);
        personaC.setSexo('M');
        personaC.setPeso(75);
        personaC.setAltura(1.75);

        System.out.println("\n");
        int[] IMCX ={personaA.calcularIMC(), personaB.calcularIMC(), personaC.calcularIMC()};

        for (int IMCPersonas: IMCX) {
            switch (IMCPersonas){
                case 1:
                    System.out.println("Tiene sobrepeso");
                    break;
                case 0:
                    System.out.println("Está por debajo de su peso ideal");
                    break;
                case -1:
                    System.out.println("Está en su peso ideal");
                    break;
                case 2:
                    System.out.println("No se puede calcular el IMC");
                    break;
            }
        }

        System.out.println("\n");
        boolean[] mayorEdades = {personaA.esMayorDeEdad(), personaB.esMayorDeEdad(),personaC.esMayorDeEdad()};
        for (boolean mayoriaEdad : mayorEdades) {
            if(mayoriaEdad){
                System.out.println("Es mayor de edad");
            }else {
                System.out.println("Es menor de edad");
            }
        }

        System.out.println("\n");
        String[] informacionPersonas = {personaA.toString(), personaB.toString(),personaC.toString()};
        for (String infoPersona : informacionPersonas) {
            System.out.println(infoPersona);
        }

    }
}
