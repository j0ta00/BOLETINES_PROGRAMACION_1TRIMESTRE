import java.util.Scanner;
public class PrimosConSubprograma {

	public static void main(String[] args) {
		//Declaración de variables
		int numero;
		//Llamada al subrpograma LeerValidarNumeros
		numero=LeerValidarNumeros();
		//Llamada al subrpograma si es primo
		SiPrimo(numero);
		
	}
	public static int LeerValidarNumeros() {
		
		//Declaración de variables locales
		int numero, numero2;
		Scanner teclado = new Scanner(System.in);
		//Repetir Mientras para validar los números introducidos
		do {
			System.out.println("Introduce el primer número");
			numero=teclado.nextInt();
			System.out.println("Introduce el segundo número");
			numero2=teclado.nextInt();
		}while(numero==numero2 || numero<2 || numero2<2);
		//Si para averiguar que número es más grande
		if(numero2>numero) {
			
			numero=numero2;
		}
		teclado.close();
		return numero;	
		
	}
	 public static void SiPrimo(int numero){
		//Declaración de variables locales
		boolean primo=true;
		//Compruebo si es primo
		for(int i=2;i<=(numero/2);i++ ){
			
			if(numero%i==0 && i!=1){
				
				primo=false;	
			}
		//Si para imprimir el resultado
		}if(primo){
			
			System.out.println("Es primo");
			
		}else{
			
			System.out.println("No es primo");
		}

		
		
	}

}
