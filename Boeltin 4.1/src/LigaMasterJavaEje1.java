import java.util.Scanner;
public class LigaMasterJavaEje1 {

	public static void main(String[] args) {
		//Declaración e inicialización de variables
		int respuestaAleatorio=0,randomAleatorio=0,randomSpock=0, juegoElegido=0,paresONones=0,numeroParesONones=0,randomParesONones=0, i, puntuacionJugadorSpock=0, puntuacionPcSpock=0, eleccionJugadorSpock=0;;
		char continuar='s';
		
		Scanner teclado = new Scanner(System.in); 
		
	//Validará si se realizará el programa o no dependiendo de lo que el usuario diga tras la primera iteración
	while(continuar=='s'){	
		//Validación del menu de elección del juego
		do {
			
			System.out.println("Que juego desea jugar, introduzca 1 para jugar pares o nones, introduzca 2 para jugar piedra, papel, tijera, lagarto, Spock "
									+ " o introduzca 3 para jugar a adivinar el número");
			juegoElegido=teclado.nextInt();
		}while(juegoElegido<1 || juegoElegido>3);		
			
			//Menú de elección de juego realizado con un Según
			switch(juegoElegido) {
				
			case 1:
				System.out.println("Bienevenido al juego de pares o nones");
				
				//Validación para que solo pueda elegir pares o nones
				do {
					
					System.out.println("Elige pares o nones introduce 1 para nones y 2 para pares");
					paresONones=teclado.nextInt();
					
				}while(paresONones<1 || paresONones>2);
				
				//Genero un número random del 1 al 10 estando estos incluidos, esto será lo que saque la máquina 
				randomParesONones = (int) Math.floor(Math.random()*(11-1)+1);
				
				if(paresONones==1) {
					
					System.out.println("Bien has elegido nones, entonces la máquina elegirá pares");
					//Validación del número que va a sacar
					do {
						
					System.out.println("Introduce el número que quieres sacar recuerda que solo puedes sacar del 1 al 10");
					numeroParesONones=teclado.nextInt();
					
					}while(numeroParesONones<1 || numeroParesONones>10);
					
					
					System.out.println("La consola ha sacado "+randomParesONones);
					
					//Sumo lo sacado por la máquina y el jugador
					numeroParesONones+=randomParesONones;
					
					//Comprobación del resultado, al haber elegido nones perdera cuando el numero al hacer la division entera entre 2 de 0 de resto y eso compruebo
					if(randomParesONones%2==0){
						
						System.out.println("El número total es "+numeroParesONones+" por lo tanto has perdido");
						
					}else {
						
						
						System.out.println("El número total es "+numeroParesONones+" por lo tanto has ganado");
						
					}
					
				}else{
					
					System.out.println("Bien has elegido pares, entonces la máquina elegirá nones");
					
					//Validación del número que va a sacar
					do {

						System.out.println("Introduce el número que quieres sacar recuerda que solo puedes sacar del 1 al 10");
						numeroParesONones=teclado.nextInt();
						
					}while(numeroParesONones<1 || numeroParesONones>10);
					
					System.out.println("La consola ha sacado "+randomParesONones);
					
					//Sumo lo sacado por la máquina y el jugador	
					numeroParesONones+=randomParesONones;
				
					//Comprobación del resultado, al haber elegido nones perdera cuando el numero al hacer la division entera entre 2 de 0 de resto y eso compruebo
					if(randomParesONones%2!=0){
						
						System.out.println("El número es "+numeroParesONones+" por lo tanto has perdido");
						
					}else {
						
						
						System.out.println("El número es "+numeroParesONones+" por lo tanto has ganado");
						
					}
				}
			break;
			case 2:
				System.out.println("Bienvenido a piedra, papel, tijeras, Spock o lagarto");
				for(i=1;i<=3 && puntuacionJugadorSpock<2 && puntuacionPcSpock<2;i++) {		
					System.out.println("\nTurno "+i+" Puntos de la máquina "+puntuacionPcSpock+" Tus puntos "+puntuacionJugadorSpock);
					//Genero un número random del 1 al 5 estando estos incluidos, esto será lo que saque la máquina 
					randomSpock = (int) Math.floor(Math.random()*(6-1)+1);
				//Validamos entrada para que no escriba algo que se salga del rango entre 1 y 5
					do {		
						System.out.println("Introduce un 1 para elegir papel, un 2 para elegir tijeras,un 3 para elegir piedra, un 4 para elegir lagarto y un 5 para elegir Spock");
						eleccionJugadorSpock=teclado.nextInt();
								
							}while(eleccionJugadorSpock<1 || eleccionJugadorSpock>5);
							
							switch(eleccionJugadorSpock) {
								
								case 1:	
									
									if(randomSpock==2) {
										
										System.out.println("La máquina ha sacado tijeras has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==3){
										
										System.out.println("La máquina ha sacado piedra, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4) {
										
										System.out.println("La máquina ha sacado lagarto, has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==5){
										
										System.out.println("La máquina ha sacado Spock, has ganado");
										puntuacionJugadorSpock++;
										
									}else{
										
										System.out.println("La máquina ha sacado papel, habeis empatado");
										
										}	
									
								break;
								
								case 2:
									
									if(randomSpock==3) {
										
										System.out.println("La máquina ha sacado piedra has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==1){
										
										System.out.println("La máquina ha sacado papel, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4){
										
										System.out.println("La máquina ha sacado lagarto, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==5){
										System.out.println("La máquina ha sacado Spock, has perdido");
										puntuacionPcSpock++;
										
									}else{
										
										System.out.println("La máquina ha sacado tijeras, habeis empatado");
									
										}
									
								break;
								
								case 3:
									
									if(randomSpock==1) {
										
										System.out.println("La máquina ha sacado papel has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==2){
										
										System.out.println("La máquina ha sacado tijeras, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4) {
										
										System.out.println("La máquina ha sacado lagarto , has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==5){
										
										System.out.println("La máquina ha sacado Spock, has perdido");
										puntuacionPcSpock++;
										
									}else {
										
										System.out.println("La máquina ha sacado piedra, habeis empatado");
										
										}
									
								break;
								case 4:

									if(randomSpock==1) {
										
										System.out.println("La máquina ha sacado papel has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==2){
										
										System.out.println("La máquina ha sacado tijeras, has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==3) {
										
										System.out.println("La máquina ha sacado piedra , has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==5){
										
										System.out.println("La máquina ha sacado Spock, has ganado");
										puntuacionJugadorSpock++;
										
									}else {
										
										System.out.println("La máquina ha sacado lagarto, habeis empatado");
										
										}
									
								break;
								case 5:

									if(randomSpock==1) {
										
										System.out.println("La máquina ha sacado papel has perdido");
										puntuacionPcSpock++;
										
									}else if(randomSpock==2){
										
										System.out.println("La máquina ha sacado tijeras, has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==3) {
										
										System.out.println("La máquina ha sacado piedra , has ganado");
										puntuacionJugadorSpock++;
										
									}else if(randomSpock==4){
										
										System.out.println("La máquina ha sacado lagarto, has perdido");
										puntuacionPcSpock++;
										
									}else {
										
										System.out.println("La máquina ha sacado Spock, habeis empatado");
										
										}
									
								break;
								
							}
							
						}
			break;
			case 3:
				System.out.println("Bienvenido al juego del número aleatorio, este juego lo vimos en clase,"
						+ "este juego se basa en que debes intentar acertar el número e ire dandote pistas");
			
				//Genero el número aleatorio que deberá acertar el jugador
				randomAleatorio = (int) Math.floor(Math.random()*(51-1)+1);
				
				//Validamos para que no escriba un número fuera del rango
				do {
				System.out.println("Adelante intentalo, tienes 5 intentos, el número se encuentra entre 1 y 50");
				respuestaAleatorio=teclado.nextInt();
				
				}while(respuestaAleatorio<1 || respuestaAleatorio>50);
				
				for(i=1;respuestaAleatorio!=randomAleatorio && i!=5;i++){
					
					//Con una estructura de if anidados compruebo si se cumplen ciertos requisitos para darle ciertas pistas
					if(i>=3 && respuestaAleatorio%5==0){
							
							System.out.println("Acaba en 5 o 0 \n");
					
					}else if(i>=4) {
							
							if(respuestaAleatorio%2==0) {
								
								System.out.println("Es un número par \n");
								
							}else
								
								System.out.println("Es un número impar \\n");
							
							
						}
					
					if(randomAleatorio>respuestaAleatorio){
						
					System.out.println("Has fallado, el numero es más grande");
						
						
					}else{
							
						System.out.println("Has fallado, el número es más pequeño");
							
							
						}
						
					respuestaAleatorio=teclado.nextInt();
					
				}
					
					
					
					if(respuestaAleatorio==randomAleatorio){
						
						System.out.println("Has acertado, enhorabuena, la respuesta era "+randomAleatorio);
						
						
					}else{
						
						
						System.out.println("Has superado el número máximo de intentos, lo siento");
						
						System.out.println("La solución era "+randomAleatorio);
						
						}

			break;
				}
			//Valida que la respuesta solo pueda ser 's' y 'n'
			do {
				System.out.println("¿Desea volver a jugar?, introduce 's' si quieres volver a jugar o 'n' si no es así");
				continuar=teclado.next().charAt(0);
				
				//En caso de que el usuario escriba 'S' o 'N' se le convertira a 's' o 'n' para que lo reconozca el programa así la condición de validación del bucle es más corta
				if(Character.isUpperCase(continuar)) {
					
			         continuar = Character.toLowerCase(continuar);
				}
				
			}while(continuar!='n' && continuar!='s');
	
			}
		teclado.close();
	}

}

	


