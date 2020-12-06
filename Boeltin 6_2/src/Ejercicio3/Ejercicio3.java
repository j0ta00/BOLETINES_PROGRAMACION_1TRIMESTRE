package Ejercicio3;
/*
 * 
 * 
 * entero  función1 (entero m, entero n)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaración de vraible resultado
 * SI (n == 0)
 * resultado = 100 <-- caso base
 * EN OTRO CASO
 * SI (n <= m)
 * resultado = función2(m,n) <--llamada a la funcion 2 caso general
 * EN OTRO CASO
 * resultado = función2(n,m)  <--llamada a la función 2 caso general
 * FINSI
 * FINSI
 * FIN
 * 
 * entero  función2 (entero m, entero n)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaración de vraible resultado
 * SI (n == 0)
 * resultado = función1(m,0) <--llamada a la función 1
 * EN OTRO CASO
 * resultado = función1(m,n-1) <--llamada a la función 1
 * FINSI
 * FIN
 * 
 * 
 *  **CASO DE PRUEBA 1**
 *entero  función1 (entero 5, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaración de vraible resultado 
 * SI (2 == 0) <-- apertura del si para entrar en el caso base
 * resultado = 100 <-- caso base, se le asigna a resultado el valor de 100
 * EN OTRO CASO <-- Si no pasaríamos a los casos generales
 * SI (2 <= 5) <--Si n es menor que 5 entramos al primera caso general
 * resultado = función2(5,2)  <--llamaríamos a la función 2 y esta llamará a la 1 produciendose una recursividad indirecta o cruzada
 * EN OTRO CASO<-- Si no pasaríamos al segundo caso general
 * resultado = función2(2,5)  <---de nuevo llamaríamos a la función 2 y esta llamará a la 1 produciendose una recursividad indirecta o cruzada
 * FINSI
 * FINSI
 * FIN
 * 
 * 
 *entero  función2 (entero 5, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaración de vraible resultado
 * SI (2 == 0)
 * resultado = función1(2,0) <--llamada a la función 1
 * EN OTRO CASO
 * resultado = función1(5,2-1) <--llamada a la función 1
 * 2º llamada resultado= funcion1(5,2-1)
 * 3º la función 1 devolvería 100
 * FINSI
 * FIN
 * 
 * SALIDA: resultado=100
 * 
 *  *  **CASO DE PRUEBA 2**
 *entero  función1 (entero 1, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaración de vraible resultado 
 * SI (2 == 0) <-- apertura del si para entrar en el caso base
 * resultado = 100 <-- caso base, se le asigna a resultado el valor de 100
 * EN OTRO CASO <-- Si no pasaríamos a los casos generales
 * SI (2 <= 1) <--Si n es menor que 5 entramos al primera caso general
 * resultado = función2(1,2)  <--llamaríamos a la función 2 y esta llamará a la 1 produciendose una recursividad indirecta o cruzada
 * EN OTRO CASO<-- Si no pasaríamos al segundo caso general
 * resultado = función2(2,1)  <---de nuevo llamaríamos a la función 2 y esta llamará a la 1 produciendose una recursividad indirecta o cruzada
 * FINSI
 * FINSI
 * FIN
 * 
 * 
 *entero  función2 (entero 1, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaración de vraible resultado
 * SI (2 == 0)
 * resultado = función1(1,0) <--llamada a la función 1
 * EN OTRO CASO
 * resultado = función1(1,2-1) <--llamada a la función 1
 * 2º llamada resultado= funcion1(1,1-1)
 * 3º la función 1 devolvería 100
 * FINSI
 * FIN
 * 
 * SALIDA: resultado=100
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(funcion1(1,2));
		System.out.println(funcion1(5,2));
		System.out.println(funcion1(0,0));
		

	}
	
	public static int funcion1(int numero, int numero2){
		
		int resultado=0;
		if(numero2==0){
			
			resultado = 100;
			
			
		}else{
			
			
			resultado = funcion2(numero2,numero);
			
		}
		
		return resultado;
		
	}
	
	public static int funcion2(int numero, int numero2){
		
		int resultado=0;
		
		
			
			resultado=funcion1(numero,numero2-1);
			

		
		return resultado;
		
	}

}
