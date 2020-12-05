import java.util.Scanner;
public class PrimosConSubprograma {

	public static void main(String[] args) {
		//Declaraci�n de variables
		int numero;
		//Llamada al subrpograma LeerValidarNumeros
		numero=LeerValidarNumeros();
		//Llamada al subrpograma si es primo
		SiPrimo(numero);
		
	}
	public static int LeerValidarNumeros() {
		
		//Declaraci�n de variables locales
		int numero, numero2;
		Scanner teclado = new Scanner(System.in);
		//Repetir Mientras para validar los n�meros introducidos
		do {
			System.out.println("Introduce el primer n�mero");
			numero=teclado.nextInt();
			System.out.println("Introduce el segundo n�mero");
			numero2=teclado.nextInt();
		}while(numero==numero2 || numero<2 || numero2<2);
		//Si para averiguar que n�mero es m�s grande
		if(numero2>numero) {
			
			numero=numero2;
		}
		teclado.close();
		return numero;	
		
	}
	 public static void SiPrimo(int numero){
		//Declaraci�n de variables locales
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
