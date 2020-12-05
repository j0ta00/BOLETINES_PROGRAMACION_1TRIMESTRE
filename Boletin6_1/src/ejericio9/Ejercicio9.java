package ejericio9;
import java.util.Scanner;
public class Ejercicio9{
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		char caracter=' ';
		int niveles=0;
		do {
		System.out.println("Introduce los niveles que desees, debe ser más de 2 y menos de 9");
		niveles=teclado.nextInt();
		}while(niveles<2 || niveles>9);
		System.out.println("Introduce un carácter recuerda que debe ser imprimible");
		caracter=teclado.next().charAt(0);
		imprimirCuadrado2(niveles,caracter);
		teclado.close();
	}

	
	public static void imprimirCuadrado2(int niveles,char caracter){
		int contador=niveles-1,contador2=0;
		do{
			for(int i=1;i<=2;i++,contador2++) {
				
				for(int j=0;j<=contador;j++){
					 System.out.print(caracter);
					
				}
				if(i%2!=0) {
				    for(int j=1;j-1<=contador2;j++){
		                System.out.print(j);
	
		            }
				}else if(contador==0){
					System.out.println();
					for(int j=-1;j<=contador2;j++){
		                System.out.print(caracter);
	
		            }
					
				}
			}
			contador--;
			System.out.println();
		}while(contador>=0);
	}

		
		
		
}
		

	
	
	
