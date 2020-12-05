
import java.util.Scanner;

public class Type {

	public static void main(String[] args){
		

		try {
			conver("M");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		
	}

  
    //Imprimir un string pasado por argumento letra a letra, con
    //salto de línea automático.
    public static void conver(String mensaje) throws InterruptedException {

        char[] caracteres = {' '};
        caracteres = mensaje.toCharArray();// Convertir mensaje a array de caracteres

        System.out.print(" ");

        for (int i = 0 ; i < caracteres.length ; i++) {

            //Imprime los caracteres uno a uno en la misma línea.
            System.out.print(caracteres[i]);
            if ((i+1) % 120 == 0) System.out.print("\n ");// Si ha imprimido 120 caracteres salta la línea
            Thread.sleep(30); // Tiempo de espera entre caracter y caracter en milisegundos.
        }
        System.out.println("\n");
    }

    //Separa un input en partes separadas por espacios
    public static String[] separador(String input) {

        String[] partes = {" "};

        partes = input.split(" ");

        return partes;
    }

    //Pausa el programa hasta que se introduzca lo que sea,
    //para dar tiempo a leer el resultado de alguna acción
    public static void pausa() throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduce cualquier cosa para continuar...\n");

        teclado.nextLine();
    }

    //Introducción general de Cadenas
    public static String scannerCadena() {

        String input;
        Scanner teclado = new Scanner(System.in);

        System.out.print("\n >> ");

        input = teclado.nextLine();
        System.out.println();
        return input;
    }

    //Introducción general de enteros TODO Usar try/catch para validar en lugar de bucle while
    public static int scannerInt() {

        int input;
        Scanner teclado = new Scanner(System.in);
        System.out.print("\n >> ");

        while (!teclado.hasNextInt()) {
            System.out.println(" Introduce un número válido:");
            System.out.print("\n >> ");
            teclado.nextLine();
        }

        input = Integer.parseInt(teclado.nextLine());
        System.out.println();
        return input;
    }



}