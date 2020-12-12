package Ejercicio1Simulacro;
import java.util.Scanner;
public class Ejercicio1Simulacro {
	/*
	 * Objeto teclado que será un objeto estático de esta clase para que puedan usarlo los distintos métodos, si qusieramos podemos
	 * declararlo en cada uno de los métodos pero para ahorrarnos esto lo hacemos así pero si no quereis porqué pensais que estais usando
	 * objetos que es algo que no hemos visto como quien dice pues los instanciamos en cada uno de los métodos que lo necesitemos y ya esta
	 * */
	static Scanner teclado = new Scanner(System.in);
	//Método principal
	public static void main(String[] args) {
		//Declaración de variables
		int dia=0,mes=0,ano=0,diasAnadidos=0;
		//Pide al usuario que introduzca por teclado el día de la fecha y lo asigna a la variable dia
		dia=pedirDia();
		//Pide al usuario que introduzca por teclado el mes de la fecha y lo asigna a la variable mes
		mes=pedirMes();
		//Pide al usuario que introduzca por teclado el año de la fecha y lo asigna a la variable ano
		ano=pedirAno();
		//Imprime la fecha base para que el usuario observe como tras la suma de los días añadidos esta cambiará
		System.out.println("Día: "+dia+" Mes: "+mes+" Año: "+ano);
		//Pide al usuario que introduzca por teclado el año de la fecha
		diasAnadidos=pedirDiasAnadidos(diasAnadidos);
		//Suma los días añadidos introducidos por el usuario e imprime dicha fecha
		addFecha(dia,mes,ano,diasAnadidos);
	}
	/*
	 * Cabecera:public static int pedirDiasAnadidos(int diasAnadidos)
	 * Proposito:Pedira al usuario cuantos dias desea sumar a la fecha base
	 * Entrada:int diasAnadidos
	 * Salida:int diasAnadidos
	 * Precondición:Ninguna
	 * Postcondición:Se trata de una funcion que devuelve un valor entero que serán los dias introducidos por el usuario
	 * 
	 * */
	public static int pedirDiasAnadidos(int diasAnadidos){
		//Pide al usuario cuantos días quiere sumar a la fecha que ha introducido con anterioridad
		System.out.println("¿Cuántos dias quieres sumar a la fecha introducida?");
		diasAnadidos=teclado.nextInt();
		return diasAnadidos;
	}

	/*
	 * Cabecera:public static void addFecha(int dia, int mes, int ano)
	 * Proposito:Suma los días introducidos por el usuario a la fecha base y devuelve la nueva fecha tras los días añadidos transcurridos 
	 * Entrada:int dia, int mes, int ano,int diasAnadidos
	 * Salida:Ninguna
	 * Precondición:
	 * Postcondición:Se trata de un procedimiento e imprimira en pantalla 
	 * */
	public static void addFecha(int dia, int mes, int ano,int diasAnadidos){
		dia+=diasAnadidos;//Le sumamos los dias extra a dia de esta forma tenemos los dias en total
		do {
			if(dia>=365){ //Si los dias son más de 365 se lo restamos a los dias y sumamos 1 a año
				if(esBisiesto(ano)){
					dia-=366; //Si es bisiesto el año tiene un dia más
				}else{
					dia-=365;
				}
				ano++;//Sumamos un año
			}
			if(dia>diasPorMes(mes,ano)) {//Si los dias son más grande que los dias del mes en el que estamos sumamos 1 a mes y restamos los dias a dia
				dia-=diasPorMes(mes,ano);//Restamos los dias de ese mes a dia
				mes++;//Sumamos 1 mes
			}
		
		}while(dia>diasPorMes(mes,ano));
		
		System.out.println(" La fecha resultante es: Día: "+dia+" Mes: "+mes+" Año: "+ano);//Imprimimos la fecha
	}
	/*
	 * Cabecera:public static int diasPorMes(int mes, int ano)
	 * Proposito:Método que nos dirá cuantos dias tiene cada mes respectivamente
	 * Entrada:int mes, int ano
	 * Salida:int diasEnElMes
	 * Precondición:Tanto mes como ano serán meses y años válidos respectivamente
	 * Postcondición:Se trata de una funcioón que devuelve un entero en función de cuantos días tenga cada mes
	 * */
	public static int diasPorMes(int mes, int ano){
		int diasEnElMes=0;
		//Según el mes pues tendra 30 días,31,28 o 29
		switch(mes){
		
		case 2://Mes de Febrero
			if(esBisiesto(ano)){//Si es bisiesto tiene 29 días
				diasEnElMes=29;	
			}else{
				
				diasEnElMes=28;//Si no lo es tiene 28
			}
		break;
		
		case 1,3,5,7,8,10,12://Los meses con 31 días: Enero,Marzo,Mayo,Julio,Agosto,Octubre,Diciembre
			diasEnElMes=31;
		break;
		
		case 4,6,9,11://Los meses con 30 días:Abril,Junio,Septiembre,Noviembre 
			diasEnElMes=30;
		break;
		}
		return diasEnElMes;
	}
	/*
	 * Cabecera:public static int pedirDia()
	 * Proposito:Pide al usuario que introduzca por teclado un día, lo lee y lo asigna a dia
	 * Entrada:Ninguna
	 * Salida:int dia
	 * Precondición:Ninguna
	 * Postcondición:Se trata de una función que devolverá un entero dia
	 * */
	public static int pedirDia(){
		int  dia=0;
		do {
			System.out.println("Introduce un día válido");
			dia=teclado.nextInt();
		}while(validarDia(dia)==false);
		return dia;
	}
	/*
	 * Cabecera:public static boolean validarDia(int dia)
	 * Proposito:Validar si un dia es o no válido
	 * Entrada:int dia
	 * Salida:boolean diaValido
	 * Precondición:El dia no puede ser mayor que 32 ni menor que 0 si es válido
	 * Postcondición:Se trata de una función que devolverá un booleano en funcion de si el dia es o no válido.
	 * */
	public static boolean validarDia(int dia){
		boolean diaValido=false;
		if(dia>0 && dia<32){//El dia deberá estar comprendido entre 1 y 31 para ser válido
			diaValido=true;
		}
		return diaValido;
	}
	/*
	 * Cabecera:public static int pedirMes()
	 * Proposito:Pide al usuario que introduzca por teclado un mes, lo lee y lo asigna a mes
	 * Entrada:Ninguna
	 * Salida:int mes
	 * Precondición:Ninguna
	 * Postcondición:Se trata de una función que devolverá un entero mes
	 * */
	public static int pedirMes(){
		int mes=0;
		do {
			System.out.println("Introduce un mes válido");
			mes=teclado.nextInt();
		}while(validarMes(mes)==false);
		return mes;
	}
	/*
	 * Cabecera:public static boolean validarMes(int mes)
	 * Proposito:Validar si un mes es o no válido
	 * Entrada:int mes
	 * Salida:boolean mesValido
	 * Precondición:El mes no puede ser mayor que 12 ni menor que 0 si es válido
	 * Postcondición:Se trata de una función que devolverá un booleano en funcion de si el mes es o no válido.
	 * */
	public static boolean validarMes(int mes){
		boolean mesValido=false;
		if(mes>0 && mes<13){//El mes deberá estar comprendido entre 1 y 12 para ser válido
			mesValido=true;
		}
		return mesValido;
	}
	/*
	 * Cabecera:public static int pedirAno()
	 * Proposito:Pide al usuario que introduzca por teclado un año, lo lee y lo asigna a ano
	 * Entrada:Ninguna
	 * Salida:int ano
	 * Precondición:Ninguna
	 * Postcondición:Se trata de una función que devolverá un entero ano
	 * */
	public static int pedirAno(){
		int ano=0;
		do {
			System.out.println("Introduce un año válido");
			ano=teclado.nextInt();
		}while(validarAno(ano)==false);
		return ano;
	}
	/*
	 * Cabecera:public static boolean validarAno(int ano)
	 * Proposito:Validar si un año es o no válido
	 * Entrada:int ano
	 * Salida:boolean anoValido
	 * Precondición:El año no puede ser negativo si es válido
	 * Postcondición:Se trata de una función que devolverá un booleano en funcion de si el año es o no válido.
	 * */
	public static boolean validarAno(int ano){
		boolean anoValido=false;
		if(ano>0){//Si el año es mayor que 0 y por lo tanto es un año trás el nacimiento de cristo, el año es válido 
			anoValido=true;
		}
		return anoValido;
	}
	/*
	 * Cabecera:public static boolean esBisiesto(int ano)
	 * Proposito:Validar si un año es o no bisiesto 
	 * Entrada:int ano
	 * Salida:boolean bisiesto
	 * Precondición:Ninguna
	 * Postcondición:Se trata de una función que devuelve un booleano en función de si el año es o no bisiesto
	 * */
	public static boolean esBisiesto(int ano){
		boolean bisiesto=false;
		if(ano%100!=0 && ano%4==0 || ano%400==0){//Si el año es divisible entre	4 es bisiesto, si es divisible entre 100 no lo es excepto si es divisible entre 400	
				bisiesto=true;
		}
		return bisiesto;
	}

}
