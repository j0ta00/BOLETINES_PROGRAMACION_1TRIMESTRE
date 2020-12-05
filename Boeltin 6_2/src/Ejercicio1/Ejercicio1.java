package Ejercicio1;

/*
 * 
 * entero  función (entero n) <-- Cabecera/Signatura de la funcion, tenemos como entrada por parámetros entero n
 *	Inicio
 *	entero resultado <--Declaración de la variable resultado que será la salida de la función
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que n valga 0, la función nos va a devolver 0 ya que resultado pasará a valer 0
 *	EN OTRO CASO
 *	resultado = n + funcion(n-1)  <-- (Asignamos a resultado el valor de n + la llamada recursiva al propio método solo que esta vez n valdrá menos
 *	FINSI	<--Cierre del si							de esta forma se va reduciendo el valor de n por lo que este se trata del caso general ya que se irá llamando cada
 *										vez a "versiones menores" de la función hasta lleagr al caso base)
 *	Devolver (resultado) <-- return de resultado es decir la salida de la función será el valor del entero resultado
 *	Fin
 *
 * 
 * Esta funció nos devovlería los siguientes valores:
 * ** CASO DE PRUEBA 1**
 * Entrada: 5
 * No entraría en el primer si, sino que pasaría al segundo, en el segundo se vovlería a llamar a la función
 * solo que esta vez a n le restamos 1 por lo que estamos pasandole 4 por parámetros, así se hará sucesivamente
 * hasta que lleguemos al caso base y por lo tanto no se vuelva a llamar el método a si mismo
 * 
 * Inicio
 * entero  función (entero 5) <-- Cabecera/Signatura de la funcion, tenemos como entrada por parámetros entero 5
 *	Inicio
 *	entero resultado <--Declaración de la variable resultado que será la salida de la función
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que el parámetro introducido valga 0, la función nos va a devolver 0 ya que resultado pasará a valer 0, en la primera llamada es obvio que no se cumplirá ya que vale 5 pero si en la última
 *	EN OTRO CASO
 *	resultado = 5 + funcion(5-1)
 *
 * 1ª Llamada resultado = 5+10 = 15 <--Devuelve
 * 2ª Llamada resultado = 4+6 = 10 <--Devuelve
 * 3ª Llamada resultado = 3+3 = 6 <--Devuelve
 * 4ª Llamada resultado = 2+1 = 3 <--Devuelve
 * 5ª Llamada resulado = 1+0 = 1 <--Devuelve
 * 
 *  FINSI								
 *	Devolver (resultado) <-- return de resultado es decir la salida de la función será el valor del entero resultado que es 15
 *	Fin
 * 
 * Salida:int resultado = 15
 * 
 * ** CASO DE PRUEBA 2**
 * Inicio
 * entero  función (entero -6) <-- Cabecera/Signatura de la funcion, tenemos como entrada por parámetros entero -6
 *	Inicio
 *	entero resultado <--Declaración de la variable resultado que será la salida de la función
 * 	SI (n == 0) <-- Caso Base y apertura de un si
 *	resultado = 0  <-- En caso de que el parámetro introducido valga 0, como vemos no vale 0 ni nunca va a llegar a 0 esto se debe a un error de diseño bastaría con cambiar "==" por "<="
 *	EN OTRO CASO
 *	resultado = 5 + funcion(5-1)
 *
 * 1ª Llamada resultado = 5+10 = 15 <--Devuelve
 * 2ª Llamada resultado = 4+6 = 10 <--Devuelve
 * 3ª Llamada resultado = 3+3 = 6 <--Devuelve
 * 4ª Llamada resultado = 2+1 = 3 <--Devuelve
 * 5ª Llamada resulado = 1+0 = 1 <--Devuelve
 * 
 *  FINSI								
 *	Devolver (resultado) <-- return de resultado es decir la salida de la función será el valor del entero resultado que es 15
 *	Fin
 * 
 * 
 * Salida:int resultado = 15
 * 
 * */
public class Ejercicio1 {

	public static void main(String[] args) {
		

	}

}
