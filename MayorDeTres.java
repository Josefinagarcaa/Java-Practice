import java.util.Scanner;

public class MayorDeTres{

	public static void main(String[] args){

		Scanner entradaInt = new Scanner(System.in);
		int a1, a2, a3;

		System.out.println("Introduzca Primer Numero: ");
		a1 = entradaInt.nextInt();
		System.out.println("Introduzca Segundo Numero: ");
		a2 = entradaInt.nextInt();
		System.out.println("Introduzca Tercer Numero: ");
		a3 = entradaInt.nextInt();

		if(a1 > a2){
			if(a1 > a3){
				System.out.println("El numero mayor es: " + a1);
			}else{
				System.out.println("EL numero Mayor es: " + a3);

}

	}else if (a2 > a3){
		System.out.println("El numero mayor es: " + a2);
	}else{
		System.out.println("El numero mayor es: " + a3);

} 
}

}