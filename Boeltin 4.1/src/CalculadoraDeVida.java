
import java.util.Calendar;
import java.util.Scanner;
public class CalculadoraDeVida {

  public static void main(String[] args) {
	  int n1=1, n2;
	  
	  if(++n1==0){
		  
		  n2=50;
		  System.out.println(n2);
	  }
	  
	Calendar today = Calendar.getInstance();
	int  ESPERANZA_DE_VIDA=83, currentYear, edad=0,habitoPositivo=0, habitoNegativo=0;
	char respuesta=' ';
	Scanner teclado = new Scanner(System.in);
	 do {
		System.out.println("Introduce tu edad y te dire cuando conoceras a dios en persona");
		edad=teclado.nextInt();
		do {
			System.out.println("¿Sueles fumar a diario o semanalmente, responde con 's' para sí y 'n para no'?");
			respuesta=teclado.next().charAt(0);
		}while(respuesta!='s' && respuesta!='n');
		if (respuesta=='s') {
			 habitoNegativo+=2;
		}else
			habitoPositivo++;
		do {
			System.out.println("¿Sueles hacer deporte a diario o semanalmente?");
			respuesta=teclado.next().charAt(0);
		}while(respuesta!='s' && respuesta!='n');
		 if (respuesta=='s') {
			habitoPositivo++;
		}else
			habitoNegativo++;
		 
		 do {
				System.out.println("¿Sueles llevar una dieta equilibrada, comiendo 5 veces al día con las raciones y alimentos recomendables?");
				respuesta=teclado.next().charAt(0);
		}while(respuesta!='s' && respuesta!='n');
			 if (respuesta=='s') {
				habitoPositivo++;
			}else
				habitoNegativo++;
		do {
				System.out.println("Sueles ver anime, jugar al Lol o en su defecto al fortnite");
				respuesta=teclado.next().charAt(0);
		}while(respuesta!='s' && respuesta!='n');
		 if (respuesta=='s') {
				habitoNegativo++;
		}else
				habitoPositivo++;
		do {
				System.out.println("¿Eres programador o estudias programación?");
				respuesta=teclado.next().charAt(0);
		}while(respuesta!='s' && respuesta!='n');
		if (respuesta=='s') {
				habitoNegativo++;
		}else
				habitoPositivo++;
		habitoNegativo*=5;
		habitoPositivo*=2;
		edad=(ESPERANZA_DE_VIDA-edad)-habitoNegativo+habitoPositivo;
		currentYear= today.get(Calendar.YEAR)+edad;
		System.out.println("Viviras "+edad+" años más, es decir fallecerás en el "+currentYear);
		do{
			System.out.println("¿Desea repetir el programa?,contesta con 's' o 'n'");
			respuesta=teclado.next().charAt(0);
		}while(respuesta!='s' && respuesta!='n');
	  }while(respuesta!='n');
	 teclado.close();
	}

}
