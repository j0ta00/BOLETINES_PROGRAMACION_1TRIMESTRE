/*
 * Nombre del programa:MiniCuestionario
 * Variables:
 * Entero: aciertos=0, errores=0
 * caracter:respuesta=''
 * Programa Principal
 * Inicio:
 * 			Escribir("Para responder las preguntar deberas introducir a, b o c dependiendo de la que quieras escoger")
 * 			Repetir
 * 				Escribir("Pregunta 1 ¿Cuántas iteraciones realizará este bucle? \n\n 			int x=4 y=3; \n 			while(x>=4){ \n 				x-=3 \n 			} \n"
 * 					+ "\n a)0 veces \n b)1 vez \n c)2 veces")
 * 				Leer(respuesta)
 * 				Si(respuesta==Mayuscula)
 * 					respuesta=minusucula
 * 				Fin_Si
 * 			Mientras(respuesta!='a' && respuesta!='b' && respuesta!='c')
 * 				Si(respuesta==a || respuesta==c)
 * 					Escribir("Respuesta incorrecta")
 * 				Si_No
 * 					Escribir("Respuesta correcta")
 * 						aciertos++
 * */

import java.util.Scanner;

public class MiniCuestionario{
	
	public static void main(String[] args){
		int aciertos=0, errores=3;
		char respuesta=' ';
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para responder las preguntar deberas introducir a, b o c dependiendo de la que quieras escoger");
		
	do {	
		System.out.println("Pregunta 1 ¿Cuántas iteraciones realizará este bucle? \n\n 			int x=4 y=3; \n 			while(x>=4){ \n 				x-=3 \n 			} \n"
				+ "\n a)0 veces \n b)1 vez \n c)2 veces");
		
		respuesta=teclado.nextLine().charAt(0);
		
		if(Character.isUpperCase(respuesta)) {
			
	          respuesta = Character.toLowerCase(respuesta);
		}
		
		}while(respuesta!='a' && respuesta!='b' && respuesta!='c');
	
	if(respuesta=='a' || respuesta=='c') {
		
		System.out.println("\n Respuesta incorrecta \n");
		
	}else{
		
			System.out.println("\n Respuesta correcta \n");
			aciertos++;
		}
	
	
	do {	
		System.out.println("Pregunta 2 ¿Qué dos tipos de bucles son los más usados frecuentemente? \n\n a)bucles controlados por contador y bucles controlados por sucesos "
				+ "\n b)bucles controlados por sucesos y bucles controlados por datos centinelas \n c)bucles controlados por contados y bucles controlados por acumuladores");
		
		respuesta=teclado.nextLine().charAt(0);
		
		if(Character.isUpperCase(respuesta)) {
			
	          respuesta = Character.toLowerCase(respuesta);
		}
		}while(respuesta!='a' && respuesta!='b' && respuesta!='c');
	
	if(respuesta=='b' || respuesta=='c') {
		
		System.out.println("\n Respuesta incorrecta \n");
		
	}else{
		
			System.out.println("\n Respuesta correcta \n");
			aciertos++;
		}
	
	
	do {	
		System.out.println("Pregunta 3 ¿Qué es un acumulador? \n\n a) Una variable que se incrementa o decrementa de forma constante "
				+ "\n b) una variable que se incrementa o decrementa de forma variable  \n c) Una constante que se incrementa o decrementa de forma variable");
		
		respuesta=teclado.nextLine().charAt(0);
		
		if(Character.isUpperCase(respuesta)) {
			
	          respuesta = Character.toLowerCase(respuesta);
		}
		}while(respuesta!='a' && respuesta!='b' && respuesta!='c');
	
	if(respuesta=='a' || respuesta=='c') {
		
		System.out.println("\n Respuesta incorrecta \n");
		
	}else{
		
			System.out.println("\n Respuesta correcta \n");
			aciertos++;
		}
	
	errores-=aciertos;
	
	System.out.println("Ya has acabado el cuestionario, tu puntuación ha sido de "+aciertos+" acierto/s y "+errores+" error/es");
	
	teclado.close();
	
	}
	
}
