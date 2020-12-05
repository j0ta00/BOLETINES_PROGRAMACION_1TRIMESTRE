import java.util.Scanner;
public class ValorOrdenador {

	public static void main(String[] args) {
		
		int valorPc=0, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuánto le ha costado el ordenador?");
		valorPc=teclado.nextInt();
		teclado.close();
		for(i=1;valorPc>=300;i++) {
			
			valorPc=valorPc-valorPc*40/100;
			
			System.out.println("Año "+i+ " valor "+valorPc);
			
		}

		System.out.println("\nEl ordenador se depreció en "+--i+ " año/s");
		teclado.close();
	}
	

}
