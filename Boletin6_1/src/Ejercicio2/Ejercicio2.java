package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		double radio=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el radio de la esfera");
		radio=teclado.nextDouble();
		esfera(radio);
		

	}
	
	public static void esfera(double radio){
		Scanner teclado = new Scanner(System.in);
		double longitud=0,volumen=0,area=0;
		int respuesta=0;
		final double PI=3.14;
		System.out.println("Introduce una de las opciones para conocer:, 1)longitud de la esfera, 2)�rea , 3)volumen");
		respuesta=teclado.nextInt();
		//Seg�n opciones
		switch(respuesta){
		case 1:
			longitud=2*PI*radio;
			System.out.println("La longitud de la esfera es "+longitud+" m");
		break;
		
		case 2:
			area=4*PI*Math.pow(radio, 2);
			System.out.println("El �rea de la esfera es "+area+" m�");
		break;
		
		case 3:
			volumen=4*PI*Math.pow(radio, 3)/3;
			System.out.println("El volumen de la esfera es "+volumen+" m�");
		break;
				
			
		}
		
		teclado.close();
	}

}
