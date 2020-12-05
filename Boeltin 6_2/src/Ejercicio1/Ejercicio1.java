package Ejercicio1;

/*
 * 
 * entero  funci�n (entero n) <-- Cabecera/Signatura de la funcion, tenemos como entrada por par�metros entero n
 *	Inicio
 *	entero resultado <--Declaraci�n de la variable resultado que ser� la salida de la funci�n
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que n valga 0, la funci�n nos va a devolver 0 ya que resultado pasar� a valer 0
 *	EN OTRO CASO
 *	resultado = n + funcion(n-1)  <-- (Asignamos a resultado el valor de n + la llamada recursiva al propio m�todo solo que esta vez n valdr� menos
 *	FINSI	<--Cierre del si							de esta forma se va reduciendo el valor de n por lo que este se trata del caso general ya que se ir� llamando cada
 *										vez a "versiones menores" de la funci�n hasta lleagr al caso base)
 *	Devolver (resultado) <-- return de resultado es decir la salida de la funci�n ser� el valor del entero resultado
 *	Fin
 *
 * 
 * Esta funci� nos devovler�a los siguientes valores:
 * ** CASO DE PRUEBA 1**
 * Entrada: 5
 * No entrar�a en el primer si, sino que pasar�a al segundo, en el segundo se volver�a a llamar a la funci�n
 * solo que esta vez a n le restamos 1 por lo que estamos pasandole 4 por par�metros, as� se har� sucesivamente
 * hasta que lleguemos al caso base y por lo tanto no se vuelva a llamar el m�todo a si mismo
 * 
 * Inicio
 * entero  funci�n (entero 5) <-- Cabecera/Signatura de la funcion, tenemos como entrada por par�metros entero 5
 *	Inicio
 *	entero resultado <--Declaraci�n de la variable resultado que ser� la salida de la funci�n
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que el par�metro introducido valga 0, la funci�n nos va a devolver 0 ya que resultado pasar� a valer 0, en la primera llamada es obvio que no se cumplir� ya que vale 5 pero si en la �ltima
 *	EN OTRO CASO
 *	resultado = 5 + funcion(5-1)<--Caso General
 *
 * 1� Llamada resultado = 5+10 = 15 <--Devuelve
 * 2� Llamada resultado = 4+6 = 10 <--Devuelve
 * 3� Llamada resultado = 3+3 = 6 <--Devuelve
 * 4� Llamada resultado = 2+1 = 3 <--Devuelve
 * 5� Llamada resulado = 1+0 = 1 <--Devuelve
 * 
 *  FINSI								
 *	Devolver (resultado) <-- return de resultado es decir la salida de la funci�n ser� el valor del entero resultado que es 15
 *	Fin
 * 
 * Salida:int resultado = 15
 * 
 * ** CASO DE PRUEBA 2**
 * Inicio
 * entero  funci�n (entero -6) <-- Cabecera/Signatura de la funcion, tenemos como entrada por par�metros entero -6
 *	Inicio
 *	entero resultado <--Declaraci�n de la variable resultado que ser� la salida de la funci�n
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que el par�metro introducido valga 0, como vemos no vale 0 ni nunca va a llegar a 0 esto se debe a un error de dise�o bastar�a con cambiar "==" por "<="
 *	EN OTRO CASO
 *	resultado = -6 + funcion(-6-1)<--Caso General
 *  *DAR�AN LLAMDAS INFINITAS Y NOS ARROJAR�A UNA EXCEPCI�N*
 *  FINSI								
 *	Devolver (resultado) <-- return de resultado es decir la salida de la funci�n ser� el valor del entero resultado 
 *	Fin
 * 
 * Salida:Ninguna
 * 
 * ** CASO DE PRUEBA 3**
 * Inicio
 * entero  funci�n (entero 1) <-- Cabecera/Signatura de la funcion, tenemos como entrada por par�metros entero 1
 *	Inicio
 *	entero resultado <--Declaraci�n de la variable resultado que ser� la salida de la funci�n
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que el par�metro introducido valga 0, que como vemos no vale 0, se le asignar�a a resultado el valor 0 
 *	EN OTRO CASO
 *	resultado = 1 + funcion(1-1)
 *  1�Llamada 1+(0)
 *  2�Llamada return devolver=0
 *  FINSI								
 *	Devolver (resultado) <-- return de resultado es decir la salida de la funci�n ser� el valor del entero resultado que ser� 1
 *	Fin
 * 
 * 
 * Salida:int resultado = 1
 * 
 * Esta recursividad ser�a del tipo directa ya que la funci�n se llama a s� misma sin llamarse desde otra y de tipo simple 
 * ya que solo aparece una �nica llamada en en el cuerpo de la funci�n.
 * 
 * 
 * Funcion entera estatica p�blica(entero numero)
 * Variables:Entero resultado
 * Inicio
 * Para(entero indice = 0; indice!=numero; indice++ )
 * resultado=resultado+(numero-indice)
 * FIN_Para
 * SI
 * resultado=0
 * Fin_SI
 * */

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(funcion(5));
		System.out.println(funcion(-6));
		System.out.println(funcion(0));
	}
	
	public static int funcion(int numero){
		int resultado=numero;
		for(int i=1;i!=numero;i++){
			
			resultado+=(numero-i);
			
		}
		if(resultado<0){
			
			resultado=0;
			
		}
		
		return resultado;
		
	}

}
