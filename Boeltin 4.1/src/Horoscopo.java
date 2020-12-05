import java.util.Scanner;
public class Horoscopo {

	public static void main(String[] args) {
		String mes="";
		boolean mesErroneo;
		int dia=0;
		Scanner teclado = new Scanner(System.in);
		do{
			mesErroneo=false;
			System.out.println("Introduce un mes válido para conocer tu simbolo del zodiaco");
			mes=teclado.next();
			System.out.println("Introduce un día válido para conocer tu simbolo del zodiaco");
			dia=teclado.nextInt();
			switch(mes) {
		
					case "Enero":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<20) {
							
								System.out.println("Eres Capricornio");
							}else
							
								System.out.println("Eres Acuario");
							
					break;
							
					case "Febrero":
						if(dia>29 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<20) {
							
								System.out.println("Eres Acuario");
							}else
							
								System.out.println("Piscis");
							
					break;
						
					case "Marzo":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=20) {
							
								System.out.println("Eres Piscis");
							}else
							
								System.out.println("Eres Aries");
							
					break;
						
					case "Abril":
						if(dia>30 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=20) {
							
								System.out.println("Eres Aries");
							}else
							
								System.out.println("Eres Tauro");
							
					break;	
					
					case "Mayo":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=21) {
							
								System.out.println("Eres Tauro");
							}else
							
								System.out.println("Eres Géminis");
							
					break;
					
					case "Junio":
						if(dia>30 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=21) {
							
								System.out.println("Eres Géminis");
							}else
							
								System.out.println("Eres Cáncer");
							
					break;
						
					case "Julio":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=23) {
							
								System.out.println("Eres Cáncer");
							}else
							
								System.out.println("Eres Leo");
							
					break;
					
					case "Agosto":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=23) {
							
								System.out.println("Eres Leo");
							}else
							
								System.out.println("Eres Virgo");
							
					break;
					
					case "Septiembre":
						if(dia>30 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=22) {
							
								System.out.println("Eres Virgo");
							}else
							
								System.out.println("Eres Libra");
							
					break;
				
					case "Octubre":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=22) {
							
								System.out.println("Eres Libra");
							}else
							
								System.out.println("Eres Escorpio");
							
					break;
							
					case "Noviembre":
						if(dia>30 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=22) {
							
								System.out.println("Eres Escorpio");
							}else
							
								System.out.println("Eres Sagitario");
							
					break;
					
					case "Diciembre":
						if(dia>31 || dia<1){
							mesErroneo=true;
							
						}else 
							
							if(dia<=21) {
							
								System.out.println("Eres Sagitario");
							}else
							
								System.out.println("Eres Capricornio");
							
					break;
					
					default:
						mesErroneo=true;
							break;
			}
		}while(mesErroneo==true);
		teclado.close();
	}		
}