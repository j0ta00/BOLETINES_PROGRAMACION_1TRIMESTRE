package Ejercicio1Simulacro;
import java.util.Scanner;
public class Ejercicio1Simulacro {
	/*
	 * Objeto teclado que ser� un objeto est�tico de esta clase para que puedan usarlo los distintos m�todos, si qusieramos podemos
	 * declararlo en cada uno de los m�todos pero para ahorrarnos esto lo hacemos as� pero si no quereis porqu� pensais que estais usando
	 * objetos que es algo que no hemos visto como quien dice pues los instanciamos en cada uno de los m�todos que lo necesitemos y ya esta
	 * */
	static Scanner teclado = new Scanner(System.in);
	//M�todo principal
	public static void main(String[] args) {
		//Declaraci�n de variables
		int dia=0,mes=0,ano=0,diasAnadidos=0;
		//Pide al usuario que introduzca por teclado el d�a de la fecha y lo asigna a la variable dia
		dia=pedirDia();
		//Pide al usuario que introduzca por teclado el mes de la fecha y lo asigna a la variable mes
		mes=pedirMes();
		//Pide al usuario que introduzca por teclado el a�o de la fecha y lo asigna a la variable ano
		ano=pedirAno();
		//Imprime la fecha base para que el usuario observe como tras la suma de los d�as a�adidos esta cambiar�
		System.out.println("D�a: "+dia+" Mes: "+mes+" A�o: "+ano);
		//Pide al usuario que introduzca por teclado el a�o de la fecha
		diasAnadidos=pedirDiasAnadidos(diasAnadidos);
		//Suma los d�as a�adidos introducidos por el usuario e imprime dicha fecha
		addFecha(dia,mes,ano,diasAnadidos);
	}
	/*
	 * Cabecera:public static int pedirDiasAnadidos(int diasAnadidos)
	 * Proposito:Pedira al usuario cuantos dias desea sumar a la fecha base
	 * Entrada:int diasAnadidos
	 * Salida:int diasAnadidos
	 * Precondici�n:Ninguna
	 * Postcondici�n:Se trata de una funcion que devuelve un valor entero que ser�n los dias introducidos por el usuario
	 * 
	 * */
	public static int pedirDiasAnadidos(int diasAnadidos){
		//Pide al usuario cuantos d�as quiere sumar a la fecha que ha introducido con anterioridad
		System.out.println("�Cu�ntos dias quieres sumar a la fecha introducida?");
		diasAnadidos=teclado.nextInt();
		return diasAnadidos;
	}

	/*
	 * Cabecera:public static void addFecha(int dia, int mes, int ano)
	 * Proposito:Suma los d�as introducidos por el usuario a la fecha base y devuelve la nueva fecha tras los d�as a�adidos transcurridos 
	 * Entrada:int dia, int mes, int ano,int diasAnadidos
	 * Salida:Ninguna
	 * Precondici�n:
	 * Postcondici�n:Se trata de un procedimiento e imprimira en pantalla 
	 * */
	public static void addFecha(int dia, int mes, int ano,int diasAnadidos){
		dia+=diasAnadidos;//Le sumamos los dias extra a dia de esta forma tenemos los dias en total
		do {
			if(dia>=365){ //Si los dias son m�s de 365 se lo restamos a los dias y sumamos 1 a a�o
				if(esBisiesto(ano)){
					dia-=366; //Si es bisiesto el a�o tiene un dia m�s
				}else{
					dia-=365;
				}
				ano++;//Sumamos un a�o
			}
			if(dia>diasPorMes(mes,ano)) {//Si los dias son m�s grande que los dias del mes en el que estamos sumamos 1 a mes y restamos los dias a dia
				dia-=diasPorMes(mes,ano);//Restamos los dias de ese mes a dia
				mes++;//Sumamos 1 mes
			}
		
		}while(dia>diasPorMes(mes,ano));
		
		System.out.println(" La fecha resultante es: D�a: "+dia+" Mes: "+mes+" A�o: "+ano);//Imprimimos la fecha
	}
	/*
	 * Cabecera:public static int diasPorMes(int mes, int ano)
	 * Proposito:M�todo que nos dir� cuantos dias tiene cada mes respectivamente
	 * Entrada:int mes, int ano
	 * Salida:int diasEnElMes
	 * Precondici�n:Tanto mes como ano ser�n meses y a�os v�lidos respectivamente
	 * Postcondici�n:Se trata de una funcio�n que devuelve un entero en funci�n de cuantos d�as tenga cada mes
	 * */
	public static int diasPorMes(int mes, int ano){
		int diasEnElMes=0;
		//Seg�n el mes pues tendra 30 d�as,31,28 o 29
		switch(mes){
		
		case 2://Mes de Febrero
			if(esBisiesto(ano)){//Si es bisiesto tiene 29 d�as
				diasEnElMes=29;	
			}else{
				
				diasEnElMes=28;//Si no lo es tiene 28
			}
		break;
		
		case 1,3,5,7,8,10,12://Los meses con 31 d�as: Enero,Marzo,Mayo,Julio,Agosto,Octubre,Diciembre
			diasEnElMes=31;
		break;
		
		case 4,6,9,11://Los meses con 30 d�as:Abril,Junio,Septiembre,Noviembre 
			diasEnElMes=30;
		break;
		}
		return diasEnElMes;
	}
	/*
	 * Cabecera:public static int pedirDia()
	 * Proposito:Pide al usuario que introduzca por teclado un d�a, lo lee y lo asigna a dia
	 * Entrada:Ninguna
	 * Salida:int dia
	 * Precondici�n:Ninguna
	 * Postcondici�n:Se trata de una funci�n que devolver� un entero dia
	 * */
	public static int pedirDia(){
		int  dia=0;
		do {
			System.out.println("Introduce un d�a v�lido");
			dia=teclado.nextInt();
		}while(validarDia(dia)==false);
		return dia;
	}
	/*
	 * Cabecera:public static boolean validarDia(int dia)
	 * Proposito:Validar si un dia es o no v�lido
	 * Entrada:int dia
	 * Salida:boolean diaValido
	 * Precondici�n:El dia no puede ser mayor que 32 ni menor que 0 si es v�lido
	 * Postcondici�n:Se trata de una funci�n que devolver� un booleano en funcion de si el dia es o no v�lido.
	 * */
	public static boolean validarDia(int dia){
		boolean diaValido=false;
		if(dia>0 && dia<32){//El dia deber� estar comprendido entre 1 y 31 para ser v�lido
			diaValido=true;
		}
		return diaValido;
	}
	/*
	 * Cabecera:public static int pedirMes()
	 * Proposito:Pide al usuario que introduzca por teclado un mes, lo lee y lo asigna a mes
	 * Entrada:Ninguna
	 * Salida:int mes
	 * Precondici�n:Ninguna
	 * Postcondici�n:Se trata de una funci�n que devolver� un entero mes
	 * */
	public static int pedirMes(){
		int mes=0;
		do {
			System.out.println("Introduce un mes v�lido");
			mes=teclado.nextInt();
		}while(validarMes(mes)==false);
		return mes;
	}
	/*
	 * Cabecera:public static boolean validarMes(int mes)
	 * Proposito:Validar si un mes es o no v�lido
	 * Entrada:int mes
	 * Salida:boolean mesValido
	 * Precondici�n:El mes no puede ser mayor que 12 ni menor que 0 si es v�lido
	 * Postcondici�n:Se trata de una funci�n que devolver� un booleano en funcion de si el mes es o no v�lido.
	 * */
	public static boolean validarMes(int mes){
		boolean mesValido=false;
		if(mes>0 && mes<13){//El mes deber� estar comprendido entre 1 y 12 para ser v�lido
			mesValido=true;
		}
		return mesValido;
	}
	/*
	 * Cabecera:public static int pedirAno()
	 * Proposito:Pide al usuario que introduzca por teclado un a�o, lo lee y lo asigna a ano
	 * Entrada:Ninguna
	 * Salida:int ano
	 * Precondici�n:Ninguna
	 * Postcondici�n:Se trata de una funci�n que devolver� un entero ano
	 * */
	public static int pedirAno(){
		int ano=0;
		do {
			System.out.println("Introduce un a�o v�lido");
			ano=teclado.nextInt();
		}while(validarAno(ano)==false);
		return ano;
	}
	/*
	 * Cabecera:public static boolean validarAno(int ano)
	 * Proposito:Validar si un a�o es o no v�lido
	 * Entrada:int ano
	 * Salida:boolean anoValido
	 * Precondici�n:El a�o no puede ser negativo si es v�lido
	 * Postcondici�n:Se trata de una funci�n que devolver� un booleano en funcion de si el a�o es o no v�lido.
	 * */
	public static boolean validarAno(int ano){
		boolean anoValido=false;
		if(ano>0){//Si el a�o es mayor que 0 y por lo tanto es un a�o tr�s el nacimiento de cristo, el a�o es v�lido 
			anoValido=true;
		}
		return anoValido;
	}
	/*
	 * Cabecera:public static boolean esBisiesto(int ano)
	 * Proposito:Validar si un a�o es o no bisiesto 
	 * Entrada:int ano
	 * Salida:boolean bisiesto
	 * Precondici�n:Ninguna
	 * Postcondici�n:Se trata de una funci�n que devuelve un booleano en funci�n de si el a�o es o no bisiesto
	 * */
	public static boolean esBisiesto(int ano){
		boolean bisiesto=false;
		if(ano%100!=0 && ano%4==0 || ano%400==0){//Si el a�o es divisible entre	4 es bisiesto, si es divisible entre 100 no lo es excepto si es divisible entre 400	
				bisiesto=true;
		}
		return bisiesto;
	}

}
