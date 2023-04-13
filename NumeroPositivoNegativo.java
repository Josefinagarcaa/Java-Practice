import java.util.Scanner;

public class NumeroPositivoNegativo{
	public static void main(String[] args){
	int numero;
	Scanner entradaInt = new Scanner(System.in);

	System.out.println("Introduzca su numero: ");
	numero = entradaInt.nextInt();

	if(!(numero < 0)){
		System.out.println("Su numero es positivo");

		}else{
		System.out.println("Su numero es negativo");


		}

	}
}