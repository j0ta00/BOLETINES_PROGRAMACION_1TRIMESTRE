package Ejercicio3;
/*
 * 
 * 
 * entero  funci�n1 (entero m, entero n)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaraci�n de vraible resultado
 * SI (n == 0)
 * resultado = 100 <-- caso base
 * EN OTRO CASO
 * SI (n <= m)
 * resultado = funci�n2(m,n) <--llamada a la funcion 2 caso general
 * EN OTRO CASO
 * resultado = funci�n2(n,m)  <--llamada a la funci�n 2 caso general
 * FINSI
 * FINSI
 * FIN
 * 
 * entero  funci�n2 (entero m, entero n)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaraci�n de vraible resultado
 * SI (n == 0)
 * resultado = funci�n1(m,0) <--llamada a la funci�n 1
 * EN OTRO CASO
 * resultado = funci�n1(m,n-1) <--llamada a la funci�n 1
 * FINSI
 * FIN
 * 
 * 
 *  **CASO DE PRUEBA 1**
 *entero  funci�n1 (entero 5, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaraci�n de vraible resultado 
 * SI (2 == 0) <-- apertura del si para entrar en el caso base
 * resultado = 100 <-- caso base, se le asigna a resultado el valor de 100
 * EN OTRO CASO <-- Si no pasar�amos a los casos generales
 * SI (2 <= 5) <--Si n es menor que 5 entramos al primera caso general
 * resultado = funci�n2(5,2)  <--llamar�amos a la funci�n 2 y esta llamar� a la 1 produciendose una recursividad indirecta o cruzada
 * EN OTRO CASO<-- Si no pasar�amos al segundo caso general
 * resultado = funci�n2(2,5)  <---de nuevo llamar�amos a la funci�n 2 y esta llamar� a la 1 produciendose una recursividad indirecta o cruzada
 * FINSI
 * FINSI
 * FIN
 * 
 * 
 *entero  funci�n2 (entero 5, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaraci�n de vraible resultado
 * SI (2 == 0)
 * resultado = funci�n1(2,0) <--llamada a la funci�n 1
 * EN OTRO CASO
 * resultado = funci�n1(5,2-1) <--llamada a la funci�n 1
 * 2� llamada resultado= funcion1(5,2-1)
 * 3� la funci�n 1 devolver�a 100
 * FINSI
 * FIN
 * 
 * SALIDA: resultado=100
 * 
 *  *  **CASO DE PRUEBA 2**
 *entero  funci�n1 (entero 1, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaraci�n de vraible resultado 
 * SI (2 == 0) <-- apertura del si para entrar en el caso base
 * resultado = 100 <-- caso base, se le asigna a resultado el valor de 100
 * EN OTRO CASO <-- Si no pasar�amos a los casos generales
 * SI (2 <= 1) <--Si n es menor que 5 entramos al primera caso general
 * resultado = funci�n2(1,2)  <--llamar�amos a la funci�n 2 y esta llamar� a la 1 produciendose una recursividad indirecta o cruzada
 * EN OTRO CASO<-- Si no pasar�amos al segundo caso general
 * resultado = funci�n2(2,1)  <---de nuevo llamar�amos a la funci�n 2 y esta llamar� a la 1 produciendose una recursividad indirecta o cruzada
 * FINSI
 * FINSI
 * FIN
 * 
 * 
 *entero  funci�n2 (entero 1, entero 2)<-- Cabecera o signatura
 * Inicio
 * entero resultado <--Declaraci�n de vraible resultado
 * SI (2 == 0)
 * resultado = funci�n1(1,0) <--llamada a la funci�n 1
 * EN OTRO CASO
 * resultado = funci�n1(1,2-1) <--llamada a la funci�n 1
 * 2� llamada resultado= funcion1(1,1-1)
 * 3� la funci�n 1 devolver�a 100
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
