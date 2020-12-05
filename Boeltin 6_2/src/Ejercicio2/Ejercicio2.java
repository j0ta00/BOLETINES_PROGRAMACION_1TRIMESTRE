package Ejercicio2;
/*
 * entero  función (entero m, entero n) <--Cabecera/Signatura del método en este caso se le pasará por parámetros dos números enteros n y m
 *	Inicio
 *	entero resultado <--Declaración de la variable entero resultado
 *	SI (n == 0) <--Apertura del SI cuya condición  se trata de que si el número n vale 0 se entraría al caso base
 *		resultado = 0<--Caso base
 *	EN OTRO CASO<--En caso de que no se cumpliera el SI anterior pasaríamos al siguiente
 *	SI (n == 1)<--Si n vale 1 entraría en este sí en el controlaremos dicha particularidad
 *		resultado = m <--Asignamos a resultado el valor de m 
 *	EN OTRO CASO <-- Si no hemos entrada al si anterior entraremos al caso general
 *		resultado = m + funcion(m,n-1) <-- caso general
 *	FINSI <-- cierre del si del caso base
 *	FINSI<-- cierre del si del caso general
 *	FIN <-- fin del programa
 *
 * **CASO DE PRUEBA 1**
 * entero  función (entero 2, entero 4) 
 *	Inicio
 *	entero resultado 
 *	SI (n == 0)
 *		resultado = 0
 *	EN OTRO CASO
 *	SI (n == 1)
 *		resultado = 2 
 *	EN OTRO CASO 
 *		resultado = 2 + funcion(2,4-1) = 8
 *      1ºLlamada resultado = 2+funcion(2,3-1) = 6
 *      2ºLlamada resultado = 2+funcion(2,2-1) = 4
 *      3ºLlamada resultado = 2
 *	FINSI 
 *	FINSI
 *	FIN 
 * SALIDA: entero 8
 * 
 * **CASO DE PRUEBA 2**
 * entero  función (entero 4, entero 1) 
 *	Inicio
 *	entero resultado 
 *	SI (n == 0)
 *		resultado = 0
 *	EN OTRO CASO
 *	SI (n == 1)
 *		resultado = 4 
 *	EN OTRO CASO 
 *		resultado = 4 + funcion(4,1-1) = 4
 *    
 *	FINSI 
 *	FINSI
 *	FIN 
 * 
 * SALIDA: entero 4
 * 
 * * **CASO DE PRUEBA 3**
 * entero  función (entero -2, entero -1) 
 *	Inicio
 *	entero resultado 
 *	SI (n == 0)
 *		resultado = 0
 *	EN OTRO CASO
 *	SI (n == 1)
 *		resultado = -2 
 *	EN OTRO CASO 
 *		resultado = -2 + funcion(-2,-1-1) = No terminaría nunca
 *    
 *	FINSI 
 *	FINSI
 *	FIN 
 * 
 * SALIDA: Ninguna daría excepción
 * 
 * 
 * 
 * funcion pública estática entera(entero numero, entero numero2)
 * Variables: entero numero
 * Inicio
 * 	Para(entero indice = 1; indice<numero; indice++ )
 * 	resultado=resultado+numero
 *  FIN_Para
 *Fin del programa
 * 
 * 
 * 
 * */

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(funcion(2,4));
		System.out.println(funcion(4,1));
		System.out.println(funcion(-2,-1));
		System.out.println(funcion(5,3));
	}
	public static int funcion(int numero, int numero2){
		//Declaración de variables locales 
		int resultado=numero;
		for(int i=1;i<numero2;i++){
			
			
			resultado+=numero;
			
			
		}	
		
		return resultado;
	}

}
