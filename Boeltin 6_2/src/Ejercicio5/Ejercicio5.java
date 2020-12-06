package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dividendo=0, divisor=0;
        System.out.print("Introduce el dividendo: ");
        dividendo = teclado.nextInt();
        System.out.print("Introduce el divisor: ");
        divisor = teclado.nextInt();
        System.out.printf("El resultado de la división es: "+restasSucesivas(dividendo,divisor));
        teclado.close();

	}
	
	public static int restasSucesivas(int dividendo, int divisor){
		int resultado=0;
		
		if(dividendo!=0){
		
			resultado=1+restasSucesivas(dividendo-divisor,divisor);
			
		}
		

		return resultado;
		
		
	}

}
