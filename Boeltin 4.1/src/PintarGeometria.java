import java.util.Scanner;
public class PintarGeometria {

	public static void main(String[] args) {
		int respuesta=0, numFila=0, numColumna=0, i, j;
		char caracter=' ';
		Scanner teclado = new Scanner(System.in);
		//Validando entrada de respuesta
		do {
			System.out.println("Si desea realizar un tri�ngulo introduzca un 1, si prefiere un cuadrado un 2 y para un rect�ngulo un 3");
			respuesta=teclado.nextInt();
		}while(respuesta<1 || respuesta>3);
	
		System.out.println("�Cu�l quieres que sea el tama�o de la figura?");
		numFila=teclado.nextInt();
		System.out.println("Introduce el car�cter con el que quieres que este hecho el tri�ngulo");
		caracter=teclado.next().charAt(0);
		//Segun respuesta realizaremos la figura correspondiente
		switch(respuesta) {
						
						case 1:
							for(i=1;i<=numFila;i++) {
								
								System.out.print("\n"+caracter);
								
								for(j=1;j!=i;j++) {
									
									System.out.print(caracter);
									
								}
							}
						break;
						
						case 2:
							for(i=1;i<=numFila;i++) {
								
								System.out.print("\n"+caracter);
								
								for(j=1;j<numFila;j++) {
									
									System.out.print(caracter);
									
								}
								
							}
						break;
						
						case 3:
							System.out.println("Introduce el n�mero de columnas que quieres que tenga el rect�ngulo");
							numColumna=teclado.nextInt();
							for(i=1;i<=numFila;i++) {
								
								System.out.print("\n"+caracter);
								
								for(j=1;j<numColumna;j++) {
									
									System.out.print(caracter);
									
								}
								
							}
						break;
		
		}
		teclado.close();
	}

}
