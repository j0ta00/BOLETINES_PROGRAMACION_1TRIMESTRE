import java.util.*;
import java.util.Scanner;
	
public class Primo {
	    
	    public static void main(String[] args){
	        
	        int numero,i,primoContador=0;
	        
	        boolean primo=false;
	        
	        Scanner teclado = new Scanner(System.in);
	        
	        do{
				System.out.println("Introduce un n\u00famero para ver si es primo");
	        
				numero=teclado.nextInt();
	        
			} while(numero<0);
			
	        for(i=1;i<=numero && i>(numero/2);i++){
	            
				primo=numero%i==0;
	            
	            if(primo){
	                
	                primoContador++;
	                
	            }
	            
	        }
	        
	        if(primoContador==2){
				
	            
	            System.out.print("El n\u00famero "+numero+" es primo");
	            
	            
	        }else{
				
	            
	            System.out.print("El n\u00famero "+numero+" no es primo");
	            
	            
	        }
	        
	    }
	    
	}


