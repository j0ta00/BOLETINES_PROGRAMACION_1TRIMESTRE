/*
 * Nombre del programa:OperacionEnteros
 * Variables:
 * Entero:x=144, y=99, suma=0, resta=0, divisio=0, multiplicacion=0
 * Programa principal:
 * Inicio:
 * 	       Escribir("El valor de la variable x es ",x,"\n El valor de la variable y es ",y)
 * 		   suma=x+y            		
 * 		   Escribir("El resultado de la suma de ambas variables es",suma)
 * 		   resta=x-y
 * 	       Escribir("El resultado de la resta de ambas variables es",resta)
 * 		   division=x/y
 * 		   Escribir("El resultado de la división de ambas variables es",division)
 * 		   multiplicacion=x*y	
 * 		   Escribir("El resultado de la multiplicación de ambas variables es",multiplicación)	
 * 
 *		   Fin
 * 
 * 
 * */


public class OperacionEnteros{
    
    public static void main(String[] args){

	int x=144,y=99,suma=0,resta=0,division=0,multiplicacion=0;
	System.out.println("El valor de la variable x es "+x+"\nEl valor de la variable y es "+y);
	suma=x+y;
	System.out.println("El resultado de la suma de ambas variables es "+suma);
	resta=x-y;
	System.out.println("El resultado de la resta de ambas variables es "+resta);
 	division=x/y;
 	System.out.println("El resultado de la división de ambas variables es "+division);
 	multiplicacion=x*y;
  	System.out.println("El resultado de la multiplicación de ambas variables es "+multiplicacion);
  	
	}
}
