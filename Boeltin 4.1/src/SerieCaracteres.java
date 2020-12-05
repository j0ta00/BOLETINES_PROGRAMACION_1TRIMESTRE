import java.util.Scanner;

public class SerieCaracteres {

	public static void main(String[] args) {
		char caracter=' ', caracterAnterior='Ñ';
		int mayuscula=0, signosPuntuacion=0, repetido=0;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("¿Introduce los carácteres que desees?,cuando quieras finalizar introduce '*'");
			caracter=teclado.next().charAt(0);
			
			 if (Character.isLetter(caracter)) {
		        	
		          if(Character.isUpperCase(caracter)) {
		        	  
		        	  mayuscula++;
		        	  
		          }
		        }else
		        	switch(caracter) {
		        			
		        				case'—':
		        					signosPuntuacion++;
		        				break;
		        				case'<':
		        					signosPuntuacion++;
		        				break;
		        				case'>':
		        					signosPuntuacion++;
		        				break;
		        				case'«':
		        					signosPuntuacion++;
		        				break;
		        				case'»':
		        					signosPuntuacion++;
		        				break;
		        				case'‘':
		        					signosPuntuacion++;
		        				break;
		        				case'’':
		        					signosPuntuacion++;
		        				break;
		        				case')':
		        					signosPuntuacion++;
		        				break;
		        				case'(':
		        					signosPuntuacion++;
		        				break;
		        				case'?':
		        					signosPuntuacion++;
		        				break;
		        				case'¿':
		        					signosPuntuacion++;
		        				break;
		        				case'\'':
		        					signosPuntuacion++;
		        				break;
		        				case'!':
		        					signosPuntuacion++;
		        				break;
		        				case'¡':
		        					signosPuntuacion++;
		        				break;
		        				case'.':
		        					signosPuntuacion++;
		        				break;
		        				case',':
		        					signosPuntuacion++;
		        				break;
		        				case';':
		        					signosPuntuacion++;
		        				break;
		        				case'-':
		        					signosPuntuacion++;
		        				break;
		        	
		        	}
			 
			 	if(caracterAnterior==caracter){
			 		
			 		repetido++;
			 		
			 		
			 	}
			 	caracterAnterior=caracter;
			
		}while(caracter!='*');
		
		System.out.println("Se ha introducido el mismo carácter de forma consecutiva "+repetido+" vez/es \nSe han introducido "+mayuscula+
				" letras mayusculas \nSe han introducido "+signosPuntuacion+" signos de puntuación");
		teclado.close();

	}

}
