package Ejercicio6;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(algoritmoAckerman(1,3));

	}
	public static int algoritmoAckerman(int numero,int numero2){
		int resultado=0;
		if(numero==0){
			
			resultado=numero2+1;
			
		}else if(numero2==0 && numero>0){
			
			resultado=algoritmoAckerman(numero-1,1);
			
			
		}else{
			
			resultado=algoritmoAckerman(numero-1,algoritmoAckerman(numero,numero2-1));
			
		}
		
		
		return resultado;
	}
}
