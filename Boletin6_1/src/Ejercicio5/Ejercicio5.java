package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
		
    public static void main(String args[]) {
    	//Declaración de variables
    	Scanner teclado = new Scanner(System.in);
        int minimo=0, maximo=0;
        System.out.println("Introduce el mínimo");
		minimo=teclado.nextInt();
		System.out.println("Introduce el máximo");
		maximo=teclado.nextInt();
		validarEntero(minimo, maximo);
        teclado.close();
    }
    /*
     * Cabecera: public static int validarEntero(int minimo,int maximo)
     * Proposito:Validara un numero entero introducido por teclado para que este se encuentre entre el mínimo
     * y máximo introducido por parámetros.
     * Entrada:int minimo,int maximo
     * Salida:int numero
     * Post condición:Se trata de una función que nos devolverá el valor de int numero
     * */

    public static int validarEntero(int minimo,int maximo) {
    	//Declaración de variables locales
    	Scanner teclado = new Scanner(System.in);
    	int numero=0;
    	do {
    		System.out.println("Introduce un valor entero válido");
    		numero=teclado.nextInt();
    		
    	}while(numero<minimo || numero>maximo);
       teclado.close();
       return numero;

    }
}
