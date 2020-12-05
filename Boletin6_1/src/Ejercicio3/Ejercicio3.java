package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado  = new Scanner(System.in);
		int respuesta=0;
		double radio=0, altura=0;
		System.out.println("Introduce la figura de la que quieres conocer el volumen y área: 1)Cono 2)Cilindro 3)Pirámide Cuadrada");
		respuesta=teclado.nextInt();
		switch(respuesta){
		case 1:
			System.out.println("Introduce el radio del cono");
			radio=teclado.nextDouble();
			System.out.println("Introduce la altura del cono");
			altura=teclado.nextDouble();
			areaYVolumenCono(radio,altura);
		break;
		
		case 2:
			System.out.println("Introduce el radio del cilindro");
			radio=teclado.nextDouble();
			System.out.println("Introduce la altura del cilindro");
			altura=teclado.nextDouble();
			areaYVolumenCilindro(radio,altura);
		break;
		
		case 3:
			System.out.println("Introduce el tamaño de un lado de la base de la pirámide");
			radio=teclado.nextDouble();
			System.out.println("Introduce la altura de la pirámide");
			altura=teclado.nextDouble();
			areaYVolumenPiramideCuadrada(radio,altura);
			
		break;

		}
		teclado.close();

	}
	
	public static void areaYVolumenCono(double radio,double  altura){
		final double PI=3.14;
		double generatriz=0,areaTotal=0,volumen=0;
		generatriz=Math.pow(radio, 2)+Math.pow(altura, 2);
		generatriz=Math.sqrt(generatriz);
		areaTotal=PI*radio*(radio+generatriz);
		volumen=PI*Math.pow(radio, 2)*altura/3;
		System.out.println("El área del cono es "+areaTotal+" m²");
		System.out.println("El volumen del cono es "+volumen+" m³");
	}
	public static void areaYVolumenPiramideCuadrada(double ladoBase,double  altura){
		final double PI=3.14;
		double areaTotal=0,volumen=0,auxiliar=0;
		auxiliar=4*Math.pow(altura, 2)+Math.pow(ladoBase, 2);
		areaTotal=ladoBase*(ladoBase+Math.sqrt(auxiliar));
		volumen=Math.pow(ladoBase, 2)*altura/3;
		System.out.println("El área de la pirámide cuadrada es "+areaTotal+" m²");
		System.out.println("El volumen de la pirámide cuadrada es "+volumen+" m³");
		
	}
	public static void areaYVolumenCilindro(double radio,double  altura){
		final double PI=3.14;
		double areaTotal=0,volumen=0;
		areaTotal=2*PI*radio*(altura+radio);
		volumen=PI*Math.pow(radio, 2)*altura;
		System.out.println("El área del cilindro es "+areaTotal+" m²");
		System.out.println("El volumen del cilindro es "+volumen+" m³");
		
	}

}
