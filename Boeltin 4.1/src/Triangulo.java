import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		int tamanoTriangulo=0, i, j;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuál quieres que sea el tamaño del triangulo?");
		tamanoTriangulo=teclado.nextInt();
		for(i=1;i<=tamanoTriangulo;i++) {
			
			System.out.print("\n*");
			
			for(j=1;j!=i;j++) {
				
				System.out.print("*");
				
			}
			
			
		}
		teclado.close();
	}

}
