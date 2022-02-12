package com.sofka.ejerciciosjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosPropuestos {

    Scanner userData = new Scanner(System.in);

    //Punto 1:
    public void comparar(double numA, double numB){

        if (numA == numB){
            System.out.println("Los número son iguales");
        }else{
            double mayor = Math.max(numA, numB);
            System.out.println("El número mayor es "+mayor);
        }
    }

    //Punto 2:
    public void compararConsola(){
        System.out.println("Por favor, ingrese el primer número: ");
        double numA = userData.nextDouble();
        System.out.println("Por favor, ingrese el segundo número: ");
        double numB = userData.nextDouble();

        if (numA == numB){
            System.out.println("Los número son iguales");
        }else if (numA > numB){
            System.out.println("El número mayor es "+numA+" y el menor es "+numB);
        }else{
            System.out.println("El número mayor es "+numB+" y el menor es "+numA);
        }
    }

    //Punto 3:
    public void areaCirculo(){
        System.out.println("Por favor, ingrese el radio del círculo: ");
        String rad = userData.nextLine();
        double radio = Double.parseDouble(rad);
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El área del círculo es "+area);
    }

    //Punto 4:
    public void precioProducto(){
        System.out.println("Por favor, ingrese el precio del producto: ");
        String precio = userData.nextLine();
        double price = Double.parseDouble(precio);
        double precioFinal = price + (price*0.21);
        System.out.println("El precio final del producto con el IVA del 21% es "+precioFinal);
    }

    //Punto 5:
    public void paresImparesWhile(){
        int num = 1;

        while(num <=100){
            if (num % 2 == 0){
                System.out.println("numero par: "+num);
            }else{
                System.out.println("numero impar : "+num);
            }
            num ++;
        }
    }

    //Punto 6:
    public void paresImparesFor(){
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0){
                System.out.println("numero par: "+num);
            }else{
                System.out.println("numero impar: "+num);
            }
        }
    }

    //Punto 7:
    public void ceroDoWhile(){
        double numero;
        do{
            System.out.println("Por favor, ingrese un número mayor o igual que cero :");
            String num = userData.nextLine();
            numero = Double.parseDouble(num);
        }while(numero < 0);
        System.out.println("El número es "+numero);
    }

    //Punto 8:
    public void diaLaboral(){
        System.out.println("Por favor ingrese el día de la semana: ");
        String diaSemana = userData.nextLine();
        String inicial = diaSemana.substring(0,1);
        switch (inicial){
            case "S":
            case "D":
            case "s":
            case "d":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("Es un día laboral");
                break;
        }
    }

    //Punto 9:
    public void cambiarFrase(){
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevoTexto = texto.replaceAll("a","e");
        System.out.println("Por favor, ingrese la frase para completar: ");
        String complemento = userData.nextLine();
        String fraseCompleta = nuevoTexto + " " + complemento;
        System.out.println(fraseCompleta);
    }

    //Punto 10:
    public void eliminarEspacios(){
        System.out.println("Por favor, ingrese una frase: ");
        String frase = userData.nextLine();
        String nuevaFrase = frase.replaceAll(" ","");
        System.out.println("\n"+nuevaFrase);
    }

    //Punto 11:
    public void fraseVocales(){
        System.out.println("Por favor, ingrese la frase: ");
        String frase = userData.nextLine();
        int longitud = frase.length();
        System.out.println("La longitud de la frase es: "+longitud);
        String reemplazo="[aeiouAEIOU]";
        String nuevaFrase = frase.replaceAll(reemplazo,"");
        System.out.println("El número de vocales es: "+(frase.length()-nuevaFrase.length()));
    }

    //Punto 12:
    public void diferenciaPalabras(){
        System.out.println("Por favor, ingrese la primera palabra: ");
        String palabraA = userData.nextLine();
        System.out.println("Por favor, ingrese la segunda palabra: ");
        String palabraB = userData.nextLine();
        if (palabraB.compareTo(palabraA) == 0){
            System.out.println("Las palabras son iguales");
        }else if (palabraA.length() > palabraB.length()){
            System.out.println("La palabra '"+palabraA+"' es más larga que la palabra '"+palabraB+"'\n"+
                    "Y la palabra '"+palabraB+"' sólo contiene "+palabraB.length()+" letras.");
            for (int letraPosición = 0; letraPosición < palabraB.length() ; letraPosición++) {
                if (palabraA.charAt(letraPosición) != palabraB.charAt(letraPosición)){
                    System.out.println("La letra "+palabraA.charAt(letraPosición)+" en la posición "+letraPosición
                            +" de la palabra '"+palabraA+"' es diferente a la letra "+
                            palabraB.charAt(letraPosición)+" en la misma posición de la palabra '"+palabraB+"'");
                }
            }
        }else {
            System.out.println("La palabra '"+palabraB+"' es más larga que la palabra '"+palabraA+"'\n"+
                    "Y la palabra '"+palabraA+"' sólo contiene "+palabraA.length()+" letras.");
            for (int letraPosición = 0; letraPosición < palabraA.length() ; letraPosición++) {
                if (palabraB.charAt(letraPosición) != palabraA.charAt(letraPosición)){
                    System.out.println("La letra "+palabraB.charAt(letraPosición)+" en la posición "+letraPosición
                            +" de la palabra '"+palabraB+"' es diferente a la letra "+
                            palabraA.charAt(letraPosición)+" en la misma posición de la palabra '"+palabraA+"'");
                }
            }
        }
    }

    //Punto 13:
    public void consultarFechaHora(){
        Date fechaActual = Calendar.getInstance().getTime();
        DateFormat formateador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fechaActualFormateada = formateador.format(fechaActual);
        System.out.println(fechaActualFormateada);
    }

    //Punto 14:
    public void numerosHastaMil(){
        String numero;
        Integer numeroEntrada;
        do{
            System.out.println("Por favor, ingrese un número del 0 al 1000: ");
            numero= userData.nextLine();
            numeroEntrada = Integer.parseInt(numero);
        }while(numeroEntrada > 1000 || numeroEntrada < 0);
        for (int incr = numeroEntrada; incr <= 1000; incr++) {
            System.out.println(incr);
            incr++;
        }
    }

    //Punto 15:}
    public void menu(){
        int opcionUsuario;
        boolean salirMenu = false;

        while (!salirMenu){
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            try{
                System.out.println("Digita una de las 7 opciones: ");
                opcionUsuario = userData.nextInt();

                switch (opcionUsuario){
                    case 1:
                        System.out.println("1-NUEVO ACTOR");
                        break;
                    case 2:
                        System.out.println("2-BUSCAR ACTOR");
                        break;
                    case 3:
                        System.out.println("3-ELIMINAR ACTOR");
                        break;
                    case 4:
                        System.out.println("4-MODIFICAR ACTOR");
                        break;
                    case 5:
                        System.out.println("5-VER TODOS LOS ACTORES");
                        break;
                    case 6:
                        System.out.println("6- VER PELICULAS DE LOS ACTORES");
                        break;
                    case 7:
                        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                        break;
                    case 8:
                        salirMenu = true;
                        break;
                    default:
                        System.out.println("OPCIÓN INCORRECTA");
                }

            }catch (InputMismatchException e){
                System.out.println("Debes escribir un número");
                userData.next();
            }
        }

    }

    public static void main(String[] args) {

        EjerciciosPropuestos ejercicios = new EjerciciosPropuestos();
        //ejercicios.comparar(3.0,3);
        //ejercicios.compararConsola();
        //ejercicios.areaCirculo();
        //ejercicios.precioProducto();
        //ejercicios.paresImparesWhile();
        //ejercicios.paresImparesFor();
        //ejercicios.ceroDoWhile();
        //ejercicios.diaLaboral();
        //ejercicios.cambiarFrase();
        //ejercicios.eliminarEspacios();
        //ejercicios.fraseVocales();
        //ejercicios.diferenciaPalabras();
        //ejercicios.consultarFechaHora();
        //ejercicios.numerosHastaMil();
        //ejercicios.menu();
    }
}
