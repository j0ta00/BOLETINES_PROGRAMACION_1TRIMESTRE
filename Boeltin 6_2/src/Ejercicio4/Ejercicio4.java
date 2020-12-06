package Ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(potencia(3,3));

	}



	public static int potencia(int numero, int exponente ){
		
		int resultado=numero;
		
		if(exponente<=1){
			
			resultado=numero;
			
		}else {
			
			resultado=numero*potencia(numero,exponente-1);
			
		}

		return resultado;
	}
}