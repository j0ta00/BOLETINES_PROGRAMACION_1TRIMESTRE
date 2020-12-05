package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
		
    public static void main(String args[]) {
    	//Declaraci�n de variables
    	Scanner teclado = new Scanner(System.in);
        int minimo=0, maximo=0;
        System.out.println("Introduce el m�nimo");
		minimo=teclado.nextInt();
		System.out.println("Introduce el m�ximo");
		maximo=teclado.nextInt();
		validarEntero(minimo, maximo);
        teclado.close();
    }
    /*
     * Cabecera: public static int validarEntero(int minimo,int maximo)
     * Proposito:Validara un numero entero introducido por teclado para que este se encuentre entre el m�nimo
     * y m�ximo introducido por par�metros.
     * Entrada:int minimo,int maximo
     * Salida:int numero
     * Post condici�n:Se trata de una funci�n que nos devolver� el valor de int numero
     * */

    public static int validarEntero(int minimo,int maximo) {
    	//Declaraci�n de variables locales
    	Scanner teclado = new Scanner(System.in);
    	int numero=0;
    	do {
    		System.out.println("Introduce un valor entero v�lido");
    		numero=teclado.nextInt();
    		
    	}while(numero<minimo || numero>maximo);
       teclado.close();
       return numero;

    }
}
