/*
 * Nombre del programa: NombreEnPantalla
 * Variables:nombre
 * Programa Principal
 * Inicio:
 * 		Escribe("Escribe tu nombre")
 * 		Leer(nombre)
 * 		Escribir("Tu nombre es ",nombre)
 * Fin
 * 
 * */
import java.util.Scanner;

public class NombreEnPantalla{
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
			String nombre="";
			
		System.out.println("Introduce tu nombre");
		
		nombre=teclado.nextLine();
		
		System.out.println("Tu nombre es "+nombre);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
