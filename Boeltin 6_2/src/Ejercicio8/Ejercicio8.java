package Ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		int numero=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce cuantas veces quieres que se llame a la función");
		numero=teclado.nextInt();
		for(int i=0;i<=numero;i++) {
			
			System.out.println(funcionFibonacci(i));
		}
		teclado.close();
	}
	
	public static int funcionFibonacci(int numero){
		int resultado=0;
		if(numero==0){
			
			resultado=0;
			
		}else if(numero==1){
		   
		   resultado=1;
		   
	   }else{

		   resultado=funcionFibonacci(numero-1)+funcionFibonacci(numero-2);
		   	   
	   }
			
	    return resultado;
	    
	}

}
