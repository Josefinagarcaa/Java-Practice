import java.util.Scanner;

public class MultiploDeTresYCinco{
	public static void main(String[] args){
	int numero;
	Scanner entradaInt = new Scanner(System.in);

	System.out.println("Introduzca su numero: ");
	numero = entradaInt.nextInt();

	if(numero % 3 == 0 || numero % 5 == 0){
		System.out.println("Numero es multiplo de 3 y de 5");
	
	}else{
		System.out.println("Numero no es multiplo de 3 ni de 5");

		}
	

	}

}