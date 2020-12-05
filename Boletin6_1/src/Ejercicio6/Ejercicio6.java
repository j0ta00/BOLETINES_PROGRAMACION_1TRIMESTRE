package Ejercicio6;

import java.util.Scanner;

import Ejercicio5.Ejercicio5;

public class Ejercicio6 {

	public static void main(String[] args) {
		int respuesta=0,respuesta2=0;
		double radio1=0,radio2=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce lo que deseas hacer: 1)propiedades de una esfera 2)restar area de  dos esferas");
		respuesta=Ejercicio5.validarEntero(1,2);
		if(respuesta==1) {
			System.out.println("Introduce el radio de la esfera");
			radio1=teclado.nextDouble();
			System.out.println("Introduce una de las opciones para conocer:, 1)longitud de la esfera, 2)área , 3)volumen");
			respuesta2=Ejercicio5.validarEntero(1,3);
			System.out.println("El resultado es "+esfera(radio1,respuesta2));
		}else {
			
		System.out.println("Introduce el radio de la primera esfera");
		radio1=teclado.nextDouble();
		System.out.println("Introduce el radio de la segunda esfera");
		radio2=teclado.nextDouble();
		restaEsferas(radio1,radio2);
		}
		teclado.close();
	}
	
	public static double esfera(double radio,int respuesta2){
		Scanner teclado = new Scanner(System.in);
		double resultado=0;
		int respuesta=0;
		final double PI=3.14;
		//Según opciones
		switch(respuesta2){
		case 1:
			resultado=2*PI*radio;
			
		break;
		
		case 2:
			resultado=4*PI*Math.pow(radio, 2);
			
		break;
		
		case 3:
			resultado=4*PI*Math.pow(radio, 3)/3;
		
		break;
				
			
		}
		
		return resultado;
	}
	
	
	public static void restaEsferas(double radio1,double radio2) {
	double resultado=0;
	resultado=esfera(radio1,2)-esfera(radio2,2);
	System.out.println("El resultado de la resta de las areas de ambas esferas es "+resultado+" m²");
	}
}
