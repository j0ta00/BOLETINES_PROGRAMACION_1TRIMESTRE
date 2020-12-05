import java.util.Scanner;
public class NumeroPrimoTeclado {

	public static void main(String[] args) {
		int numero1=0, numero2=0, i;
		boolean primo;
		Scanner teclado = new Scanner(System.in); 
		do {
			System.out.println("Introduce el primer número");
			numero1=teclado.nextInt();
			System.out.println("Introduce el segundo número");
			numero2=teclado.nextInt();
		}while(numero1<2 || numero2<2 || numero1>=numero2);
		
		
	do {
		primo=true;
		for(i=1; primo==true && i<numero1;i++ ){
			
			if(numero1%i==0 && i!=1){
				
				primo=false;	
				
			}
	
		}
		if(primo) {
			
			System.out.println(numero1);
			
		}
		
			numero1++;
			
		}while(numero1!=numero2);

	}
}


