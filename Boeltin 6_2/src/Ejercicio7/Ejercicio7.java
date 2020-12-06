package Ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(sumarDigitos(21));

	}
	
	public static int sumarDigitos(int numero) {
		int resultado=0;
		
		if (numero == 0) {   
			
			resultado=numero;
			
		}else {
			
			resultado=sumarDigitos(numero / 10) + (numero % 10);
			
		}
		return resultado;
	}

}
