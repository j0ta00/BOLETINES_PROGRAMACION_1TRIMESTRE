import java.util.Scanner;
public class LigaMasterJavaEje1 {

	public static void main(String[] args) {
		//Declaraci�n e inicializaci�n de variables
		int respuestaAleatorio=0,randomAleatorio=0,randomSpock=0, juegoElegido=0,paresONones=0,numeroParesONones=0,randomParesONones=0, i, puntuacionJugadorSpock=0, puntuacionPcSpock=0, eleccionJugadorSpock=0;;
		char continuar='s';
		
		Scanner teclado = new Scanner(System.in); 
		
	//Validar� si se realizar� el programa o no dependiendo de lo que el usuario diga tras la primera iteraci�n
	while(continuar=='s'){	
		//Validaci�n del menu de elecci�n del juego
		do {
			
			System.out.println("Que juego desea jugar, introduzca 1 para jugar pares o nones, introduzca 2 para jugar piedra, papel, tijera, lagarto, Spock "
									+ " o introduzca 3 para jugar a adivinar el n�mero");
			juegoElegido=teclado.nextInt();
		}while(juegoElegido<1 || juegoElegido>3);		
			
			//Men� de elecci�n de juego realizado con un Seg�n
			switch(juegoElegido) {
				
			case 1:
				System.out.println("Bienevenido al juego de pares o nones");
				
				//Validaci�n para que solo pueda elegir pares o nones
				do {
					
					System.out.println("Elige pares o nones introduce 1 para nones y 2 para pares");
					paresONones=teclado.nextInt();
					
				}while(paresONones<1 || paresONones>2);
				
				//Genero un n�mero random del 1 al 10 estando estos incluidos, esto ser� lo que saque la m�quina 
				randomParesONones = (int) Math.floor(Math.random()*(11-1)+1);
				
				if(paresONones==1) {
					
					System.out.println("Bien has elegido nones, entonces la m�quina elegir� pares");
					//Validaci�n del n�mero que va a sacar
					do {
						
					System.out.println("Introduce el n�mero que quieres sacar recuerda que solo puedes sacar del 1 al 10");
					numeroParesONones=teclado.nextInt();
					
					}while(numeroParesONones<1 || numeroParesONones>10);
					
					
					System.out.println("La consola ha sacado "+randomParesONones);
					
					//Sumo lo sacado por la m�quina y el jugador
					numeroParesONones+=randomParesONones;
					
					//Comprobaci�n del resultado, al haber elegido nones perdera cuando el numero al hacer la division entera entre 2 de 0 de resto y eso compruebo
					if(randomParesONones%2==0){
						
						System.out.println("El n�mero total es "+numeroParesONones+" por lo tanto has perdido");
						
					}else {
						
						
						System.out.println("El n�mero total es "+numeroParesONones+" por lo tanto has ganado");
						
					}
					
				}else{
					
					System.out.println("Bien has elegido pares, entonces la m�quina elegir� nones");
					
					//Validaci�n del n�mero que va a sacar
					do {

						System.out.println("Introduce el n�mero que quieres sacar recuerda que solo puedes sacar del 1 al 10");
						numeroParesONones=teclado.nextInt();
						
					}while(numeroParesONones<1 || numeroParesONones>10);
					
					System.out.println("La consola ha sacado "+randomParesONones);
					
					//Sumo lo sacado por la m�quina y el jugador	
					numeroParesONones+=randomParesONones;
				
					//Comprobaci�n del resultado, al haber elegido nones perdera cuando el numero al hacer la division entera entre 2 de 0 de resto y eso compruebo
					if(randomParesONones%2!=0){
						
						System.out.println("El n�mero es "+numeroParesONones+" por lo tanto has perdido");
						
					}else {
						
						
						System.out.println("El n�mero es "+numeroParesONones+" por lo tanto has ganado");
						
					}
				}
			break;
			case 2:
				System.out.println("Bienvenido a piedra, papel, tijeras, Spock o lagarto");
				for(i=1;i<=3 && puntuacionJugadorSpock<2 && puntuacionPcSpock<2;i++) {		
					System.out.println("\nTurno "+i+" Puntos de la m�quina "+puntuacionPcSpock+" Tus puntos "+puntuacionJugadorSpock);
					//Genero un n�mero random del 1 al 5 estando estos incluidos, esto ser� lo que saque la m�quina 
					randomSpock = (int) Math.floor(Math.random()*(6-1)+1);
				//Validamos entrada para que no escriba algo que se salga del rango entre 1 y 5
					do {		
						System.out.println("Introduce un 1 para elegir papel, un 2 para elegir tijeras,un 3 para elegir piedra, un 4 para elegir lagarto y un 5 para elegir Spock");
						eleccionJugadorSpock=teclado.nextInt();
								
							}while(eleccionJugadorSpock<1 || eleccionJugadorSpock>5);
							
							switch(eleccionJugadorSpock) {
								
								case 1:	
									
									if(randomSpock==2) {
										
										System.out.println("La m�quina ha sacado tijeras has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==3){
										
										System.out.println("La m�quina ha sacado piedra, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4) {
										
										System.out.println("La m�quina ha sacado lagarto, has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==5){
										
										System.out.println("La m�quina ha sacado Spock, has ganado");
										puntuacionJugadorSpock++;
										
									}else{
										
										System.out.println("La m�quina ha sacado papel, habeis empatado");
										
										}	
									
								break;
								
								case 2:
									
									if(randomSpock==3) {
										
										System.out.println("La m�quina ha sacado piedra has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==1){
										
										System.out.println("La m�quina ha sacado papel, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4){
										
										System.out.println("La m�quina ha sacado lagarto, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==5){
										System.out.println("La m�quina ha sacado Spock, has perdido");
										puntuacionPcSpock++;
										
									}else{
										
										System.out.println("La m�quina ha sacado tijeras, habeis empatado");
									
										}
									
								break;
								
								case 3:
									
									if(randomSpock==1) {
										
										System.out.println("La m�quina ha sacado papel has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==2){
										
										System.out.println("La m�quina ha sacado tijeras, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4) {
										
										System.out.println("La m�quina ha sacado lagarto , has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==5){
										
										System.out.println("La m�quina ha sacado Spock, has perdido");
										puntuacionPcSpock++;
										
									}else {
										
										System.out.println("La m�quina ha sacado piedra, habeis empatado");
										
										}
									
								break;
								case 4:

									if(randomSpock==1) {
										
										System.out.println("La m�quina ha sacado papel has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==2){
										
										System.out.println("La m�quina ha sacado tijeras, has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==3) {
										
										System.out.println("La m�quina ha sacado piedra , has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==5){
										
										System.out.println("La m�quina ha sacado Spock, has ganado");
										puntuacionJugadorSpock++;
										
									}else {
										
										System.out.println("La m�quina ha sacado lagarto, habeis empatado");
										
										}
									
								break;
								case 5:

									if(randomSpock==1) {
										
										System.out.println("La m�quina ha sacado papel has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==2){
										
										System.out.println("La m�quina ha sacado tijeras, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==3) {
										
										System.out.println("La m�quina ha sacado piedra , has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4){
										
										System.out.println("La m�quina ha sacado lagarto, has perdido");
										puntuacionPcSpock++;
										
									}else {
										
										System.out.println("La m�quina ha sacado Spock, habeis empatado");
										
										}
									
								break;
								
							}
							
						}
			break;
			case 3:
				System.out.println("Bienvenido al juego del n�mero aleatorio, este juego lo vimos en clase,"
						+ "este juego se basa en que debes intentar acertar el n�mero e ire dandote pistas");
			
				//Genero el n�mero aleatorio que deber� acertar el jugador
				randomAleatorio = (int) Math.floor(Math.random()*(51-1)+1);
				
				//Validamos para que no escriba un n�mero fuera del rango
				do {
				System.out.println("Adelante intentalo, tienes 5 intentos, el n�mero se encuentra entre 1 y 50");
				respuestaAleatorio=teclado.nextInt();
				
				}while(respuestaAleatorio<1 || respuestaAleatorio>50);
				
				for(i=1;respuestaAleatorio!=randomAleatorio && i!=5;i++){
					
					//Con una estructura de if anidados compruebo si se cumplen ciertos requisitos para darle ciertas pistas
					if(i>=3 && respuestaAleatorio%5==0){
							
							System.out.println("Acaba en 5 o 0 \n");
					
					}else if(i>=4) {
							
							if(respuestaAleatorio%2==0) {
								
								System.out.println("Es un n�mero par \n");
								
							}else
								
								System.out.println("Es un n�mero impar \\n");
							
							
						}
					
					if(randomAleatorio>respuestaAleatorio){
						
					System.out.println("Has fallado, el numero es m�s grande");
						
						
					}else{
							
						System.out.println("Has fallado, el n�mero es m�s peque�o");
							
							
						}
						
					respuestaAleatorio=teclado.nextInt();
					
				}
					
					
					
					if(respuestaAleatorio==randomAleatorio){
						
						System.out.println("Has acertado, enhorabuena, la respuesta era "+randomAleatorio);
						
						
					}else{
						
						
						System.out.println("Has superado el n�mero m�ximo de intentos, lo siento");
						
						System.out.println("La soluci�n era "+randomAleatorio);
						
						}

			break;
				}
			//Valida que la respuesta solo pueda ser 's' y 'n'
			do {
				System.out.println("�Desea volver a jugar?, introduce 's' si quieres volver a jugar o 'n' si no es as�");
				continuar=teclado.next().charAt(0);
				
				//En caso de que el usuario escriba 'S' o 'N' se le convertira a 's' o 'n' para que lo reconozca el programa as� la condici�n de validaci�n del bucle es m�s corta
				if(Character.isUpperCase(continuar)) {
					
			         continuar = Character.toLowerCase(continuar);
				}
				
			}while(continuar!='n' && continuar!='s');
	
			}
		teclado.close();
	}

}

	


