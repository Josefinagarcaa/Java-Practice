import java.util.Scanner;

public class ParPositivo{

	public static void main(String[] args){	
	int numeroPar;
	int numeroPositivo;
	Scanner entradaInt = new Scanner(System.in);
	
	System.out.println("Introduzca su numero: ");
	numeroPar = entradaInt.nextInt();
	System.out.println("Confirme su numero: ");
	numeroPositivo = entradaInt.nextInt();
	
	if((numeroPar % 2 == 0) && (numeroPositivo >= 0)){
		System.out.println("Su numero es par");
		System.out.println("Su numero es positivo");

	}else if((numeroPar%2!=0) && (numeroPositivo<0)){
		System.out.println("Su numero es no es par");
		System.out.println("Su numero es negativo");

	}else if(numeroPositivo<0){
		System.out.println("Su numero es negativo");
		System.out.println("Su numero es par");

	}else if(numeroPar%2!=0){
		System.out.println("Su numero es no es par");
		System.out.println("Su numero es positivo");
		

		}

	}
}