package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	}
	 /*Método para conocer si un numero es primo
    *
    *Cabecera/Signatura: public static boolean siPrimo(int numero)
    *Descripción:Se trata de un método que nos devolverá si un número es o no primo
    *Entrada:int numero
    *Salida:boolean primo
    *Precondiciones:
    *Postcondiciones:Se trata de una función y nos devolvera un tipo de dato booleano
    *
    * */
    public static boolean siPrimo(int numero){
        //Declarar variables locales
        boolean primo=false;
            for (int i = 2; i <= (numero/ 2); i++) {

                if (numero % i != 0 && i != 1) {

                    primo = true;

                }
            };
        return primo;


    }
    /*Método para conocer si una hora es válida
    *
    *Cabecera/Signatura:public static boolean validarDosHoras(int horas, int minutos, int segundos)
    *Descripción:Se trata de un método que nos validará las horas, segundos y minutos que introduzca el usuario
    *Entrada:int horas, int minutos, int segundos
    *Salida:boolean primo
    *Precondiciones:
    *Postcondiciones:Se trata de una función y nos devolvera un tipo de dato booleano
    *
    * */
   public static boolean validarHoras(int horas, int minutos, int segundos){
       //Declaración de variables locales
       boolean horasValidas=true;
       if(horas<0 || horas>23 ) {

           horasValidas = false;

       }else
           if(minutos<0 || minutos>60){
               horasValidas = false;
       }else
           if(segundos<0 || segundos>60){
               horasValidas = false;
           }

       return horasValidas;

   }

}
