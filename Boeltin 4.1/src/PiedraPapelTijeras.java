import java.util.Scanner;
public class PiedraPapelTijeras {

	public static void main(String[] args) {
		
		int i, puntuacionJugador=0, puntuacionPc=0, eleccionJugador=0;
		char respuesta='s';
		Scanner teclado = new Scanner(System.in);
		
		for(i=1;respuesta!='n' && puntuacionJugador<3 && puntuacionPc<3;i++) {
			
			int random = (int) Math.floor(Math.random()*(4-1)+1);
			
			do {
				
				if(Character.isUpperCase(respuesta)) {
					
			          respuesta = Character.toLowerCase(respuesta);
				}
				
				if(respuesta=='s') {
					
					System.out.println("Turno "+i+" Puntos de la máquina "+puntuacionPc+" Tus puntos "+puntuacionJugador);
					
					do {
						
						System.out.println("Introduce un 1 para elegir papel, un 2 para elegir tijeras y un 3 para elegir piedra");
						eleccionJugador=teclado.nextInt();
						
					}while(eleccionJugador<1 || eleccionJugador>3);
					
					switch(eleccionJugador) {
						
						case 1:	
							
							if(random==2) {
								
								System.out.println("La máquina ha sacado tijeras has perdido");
								puntuacionPc++;
								
							}else if(random==3){
								
								System.out.println("La máquina ha sacado piedra, has ganado");
								puntuacionJugador++;
								
							}else
								
								System.out.println("La máquina ha sacado papel, habeis empatado");
							
						break;
						
						case 2:
							
							if(random==3) {
								
								System.out.println("La máquina ha sacado piedra has perdido");
								puntuacionPc++;
								
							}else if(random==1){
								
								System.out.println("La máquina ha sacado papel, has ganado");
								puntuacionJugador++;
								
							}else
								
								System.out.println("La máquina ha sacado tijeras, habeis empatado");
							
							
						break;
						
						case 3:
							
							if(random==1) {
								
								System.out.println("La máquina ha sacado papel has perdido");
								puntuacionPc++;
								
							}else if(random==2){
								
								System.out.println("La máquina ha sacado tijeras, has ganado");
								puntuacionJugador++;
								
							}else
								
								System.out.println("La máquina ha sacado piedra, habeis empatado");
							
							
						break;
						
					}
					
				}
				
				System.out.println("¿Desea continuar jugando? Contesta con 's' para continuar o con 'n' para retirarte");
				respuesta=teclado.next().charAt(0);
			}while(respuesta!='n' && respuesta!='s');
			
			teclado.close();
			
		}
		System.out.println("El resultado de la partida ha sido: Tus puntos "+puntuacionJugador+" Los puntos de la máquina "+puntuacionPc);
		if(puntuacionJugador>puntuacionPc) {
			
			System.out.println("Has ganado, enhorabuena");
			
		}else if(puntuacionJugador<puntuacionPc) {
			
			System.out.println("Has perdido, la proxima vez será");
			
		}else
			
			System.out.println("Habeis empatado");

	}

}
