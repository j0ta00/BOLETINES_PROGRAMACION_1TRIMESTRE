package ejerciciosNavidad;
import java.util.Scanner;
public class Ejercicio1 {
	//Objeto teclado estático
static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		DosNumerosSonAmigosONo(220,284);
		System.out.println(deBinarioADecimal(10000110));
		escalera(3);
		pintarCalendario(4,'X');
	}
	/*
	 * Cabecera:public static void DosNumerosSonAmigosONo(int numero,int numero2)
	 * Proposito:Se trata de un método que imprime si dos números son o no amigos
	 * Entrada:int numero, int numero2
	 * Salida:int sonAmigos
	 * Precondición:Los números debe ser positivo y entero
	 * Postcondición:Se trata de un procedimiento que imprime si dos número son o no amigos
	 * */
	public static void DosNumerosSonAmigosONo(int numero,int numero2){
		if(siDosNumerosSonAmigos(numero,numero2)){
			System.out.println(numero+" y "+numero2+" son amigos");
		}else{
			System.out.println(numero+" y "+numero2+" no son amigos");
		}
		
	}
	/*
	 * Cabecera:(public static boolean siDosNumerosSonAmigos(int numero,int numero2))
	 * Proposito:Se trata de un método que compara la suma de los divisores de dos números para ver si son o no amigos
	 * Entrada:int numero, int numero2
	 * Salida:int sonAmigos
	 * Precondición:Los números debe ser positivo y entero
	 * Postcondición:Se trata de una función que devuelve boolean sonAmigos
	 * */
	public static boolean siDosNumerosSonAmigos(int numero,int numero2){
		boolean sonAmigos=false;
		if(sumaDivisores(numero)==numero2 && sumaDivisores(numero2)==numero){
			sonAmigos=true;
		}
		return sonAmigos;
	}
	/*
	 * Cabecera:public static int sumaDivisores()
	 * Proposito:Se trata de un método que suma todos los divisores de un número(excepto si mismo)en una sola variable y los devuelve
	 * Entrada:int numero
	 * Salida:int sumaDivisores
	 * Precondición:El número debe ser positivo y entero
	 * Postcondición:Se trata de una función que devuelve un entero sumaDivisores
	 * */
	public static int sumaDivisores(int numero){
		int sumaDivisores=1;
		for(int i=2;i!=numero;i++){
			if(numero%i==0){	
				sumaDivisores+=i;
			}	
		}
		return sumaDivisores;	
	}
	/*
	 * Cabecera:public static void deBinarioADecimal()
	 * Proposito:Se trata de un método que convierte un número decimal a binario
	 * Entrada:int numeroBinario
	 * Salida:int numeroEnDecimal
	 * Precondición:El númerol introducido por parámetros debe ser un número binario
	 * Postcondición:Se trata de una función que devuelve un entero numeroDecimal
	 * */
	public static int deBinarioADecimal(int numeroBinario){
		String numeroBinarioEnCadena;
		int numeroEnDecimal=0;
		numeroBinarioEnCadena= String.valueOf(numeroBinario);
		for(int i=0;i<numeroBinarioEnCadena.length();i++){
			if(numeroBinarioEnCadena.charAt(numeroBinarioEnCadena.length()-i-1)=='1' && i>0){
				numeroEnDecimal+=Math.pow(2,i);
			}else if(numeroBinarioEnCadena.charAt(numeroBinarioEnCadena.length()-i-1)=='1'){
				numeroEnDecimal=1;
			}
		}
		return numeroEnDecimal;
	}
	/*
	 * Cabecera:public static void escalera(int peldano)
	 * Proposito:Se trata de un método que imprime una escalera con una cantidad de peldaños decidida por el usuario
	 * Entrada:int peldano.
	 * Salida:Ninguna
	 * Precondición:Nignuna
	 * Postcondición:Se trata de un procedimiento que imprime una escalera
	 * */
	public static void escalera(int peldano){
		for(int i=0;i<peldano;i++){
			pintarEspacio(peldano-i);
			System.out.println("*********");
			for(int j=1;j<peldano;j++){
				pintarEspacio(peldano-i);
				System.out.println("*");
			}
		}
	}
	/*
	 * Cabecera:public static void pintarEspacio(int peldano)
	 * Proposito:Se trata de un método que imprime los espacios necesarios para que la escalera quede con la forma adecuada
	 * Entrada:int peldano
	 * Salida:Ninguna
	 * Precondición:Nignuna
	 * Postcondición:Se trata de un procedimiento que imprime espacios
	 * */
	public static void pintarEspacio(int peldano){
		for(int i=0;i<((peldano-1)*9);i++) {
			System.out.print(" ");
		}
	}
	/*
	 * Cabecera:public static void pintarCalendario(int mes, char diaDeLaSemanaQueComienzaMes)
	 * Proposito:Se trata de un método que imprime un calendario segun un mes y un día de la semana
	 * Entrada:int mes, char diaDeLaSemanaQueComienzaMes
	 * Salida:Ninguna
	 * Precondición:Nignuna
	 * Postcondición:Se trata de un procedimiento que imprime un calendario
	 * */
	public static void pintarCalendario(int mes, char diaDeLaSemanaQueComienzaMes){
		int diasPorPintar=0,diasQueTieneElMes=0,dias=1;
		System.out.println(" L  M  X  J  V  S  D");
		diasQueTieneElMes=DiasQueTieneCadaMes(mes);
		diasPorPintar=DiasRestantesDeLaSemana(diaDeLaSemanaQueComienzaMes);
		diasQueTieneElMes-=diasPorPintar;
		do{
			for(int j=0;j<diasPorPintar;j++,dias++){
				if(dias<10){
					System.out.print(" "+dias+" ");
				}else{
					System.out.print(dias+" ");
				}
			}
			System.out.println();
			if(diasPorPintar<diasQueTieneElMes){
				diasPorPintar=7;
				diasQueTieneElMes-=7;
			}else if(diasQueTieneElMes!=0){
				diasPorPintar=diasQueTieneElMes;
				diasQueTieneElMes=0;
			}else{
				diasQueTieneElMes=-1;
			}
		}while(diasQueTieneElMes>=0);
	}
	/*
	 * Cabecera:private static int DiasQueTieneCadaMes(int mes)
	 * Proposito:Se trata de un método que te dice los días que tiene cada mes
	 * Entrada:int mes
	 * Salida:int diasPorMes
	 * Precondición:Nignuna
	 * Postcondición:Se trata de un procedimiento que te devuelve un entero diasPorMes
	 * */
	private static int DiasQueTieneCadaMes(int mes){
		int diasPorMes=0;
		switch(mes){
			case 1,3,5,7,8,10,12->diasPorMes=31;
			case 4,6,9,11->diasPorMes=30;
			case 2->diasPorMes=28;
		}
		return diasPorMes;
	}
	/*
	 * Cabecera:public static int DiasRestantesDeLaSemana(char diaDeLaSemanaQueComienzaMes)
	 * Proposito:Se trata de un método que te dice los días restantes de la semana
	 * Entrada:char diaDeLaSemanaQueComienzaMes
	 * Salida:int diasRestantes
	 * Precondición:Nignuna
	 * Postcondición:Se trata de un procedimiento que te devuelve un entero diasRestantes
	 * */
	public static int DiasRestantesDeLaSemana(char diaDeLaSemanaQueComienzaMes){
	int diasRestantes=0;
			switch(diaDeLaSemanaQueComienzaMes){
				case'L'->diasRestantes=7;
				case'M'->{diasRestantes=6; pintarEspacioSemana(3);}
				case'X'->{diasRestantes=5; pintarEspacioSemana(6);}
				case'J'->{diasRestantes=4; pintarEspacioSemana(9);}
				case'V'->{diasRestantes=3; pintarEspacioSemana(12);}
				case'S'->{diasRestantes=2; pintarEspacioSemana(15);}
				case'D'->{diasRestantes=1; pintarEspacioSemana(18);}
			}
		return diasRestantes;
	}
	/*
	 * Cabecera:private static void pintarEspacioSemana(int espacios)
	 * Proposito:Se trata de un método que imprime espacios
	 * Entrada:int espacios
	 * Salida:Ninguna
	 * Precondición:Nignuna
	 * Postcondición:Se trata de un procedimiento que imprime espacios
	 * */
	private static void pintarEspacioSemana(int espacios){
		for(int i=0;i<espacios;i++) {
			System.out.print(" ");
		}
		
	}
}
