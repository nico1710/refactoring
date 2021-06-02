import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //dv
        // cantidad = cantidadEjercicios
        // a = operadorUno
        // b = operadorDos
        // op = opcion
        // conta = respuestasCorrectas
        // res = respuestaUser
        // c = resutadoCorrecto
        // cumple = numeroValido
        int cantidadEjercicios=0,i,operadorUno,operadorDos,opcion,respuestasCorrectas=0;
        double respuestaUser=0,respuestaCorrecta=0;
        boolean numeroValido=false;
        // cumple = cumplir la condicion y salir del while
        Scanner teclado = new Scanner(System.in);

        while(!numeroValido){
            try{
                while(cantidadEjercicios<1){
                    System.out.println("Ingresa cantidad de ejercicios");
                    cantidadEjercicios = teclado.nextInt();}//fin whilecantidad
                numeroValido=true;}//fin try
            catch (Exception e){
                System.out.println("Ingrese un valor adecuado");
                teclado.next();       }//fin catch

        }//fin while cumple

        for(i=0;i<cantidadEjercicios;i++) {
            numeroValido = false;
            operadorUno = generarRandom(0, 10);
            operadorDos = generarRandom(0, 10);
            opcion = generarRandom(1, 4);

            respuestaCorrecta = calcularResultado(operadorUno, operadorDos, opcion);
            System.out.println(operadorUno + "/" + operadorDos + "= ");

            while(!numeroValido){
                try{
                    respuestaUser=teclado.nextDouble();
                    numeroValido=true;
                }catch (Exception e){
                    System.out.println("Ingrese un valor adecuado");
                    teclado.next();
                }//fin catch
            }//fin while numeroValido

            if(respuestaCorrecta==respuestaUser){respuestasCorrectas++;}


        }//fin for

        System.out.println("Su rendimiento fue "+respuestasCorrectas+" de "+cantidadEjercicios);
    }

    // funcion que retorne numero aleatorio entre dos numeros
    public static int generarRandom(int minimo, int maximo) {
        int numRandom;
        numRandom = (int)(Math.random()*(minimo-maximo+1)+maximo);
        return numRandom;
    }

    //funcion que hace el caculo correcto
    public static double calcularResultado(int operadorUno, int operadorDos, int opcion) {
        double resultado = 0;
        switch (opcion) {
            case 1 -> resultado = operadorUno + operadorDos;
            case 2 -> resultado = operadorUno - operadorDos;
            case 3 -> resultado = operadorUno * operadorDos;
            case 4 -> {
                try {
                    resultado = ((double) operadorUno / operadorDos);
                    resultado = Math.floor(resultado * 10)/10;
                }catch(ArithmeticException e) {
                    resultado = 0;
                }
            }
        }
        return resultado;
    }
}
