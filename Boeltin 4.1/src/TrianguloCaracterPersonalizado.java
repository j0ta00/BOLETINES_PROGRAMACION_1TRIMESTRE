import java.util.Scanner;
public class TrianguloCaracterPersonalizado {

	public static void main(String[] args) {
		int tamanoTriangulo=0, i, j;
		char caracter=' ';
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuál quieres que sea el tamaño del triangulo?");
		tamanoTriangulo=teclado.nextInt();
		System.out.println("Introduce el carácter con el que quieres que este hecho el triángulo");
		caracter=teclado.next().charAt(0);
		for(i=1;i<=tamanoTriangulo;i++) {
			
			System.out.print("\n"+caracter);
			
			for(j=1;j!=i;j++) {
				
				System.out.print(caracter);
				
			}
			
			
		}
	
		teclado.close();
	}

}
