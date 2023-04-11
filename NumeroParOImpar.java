import java.util.Scanner;

public class NumeroParOImpar{
    public static void main(String [] args){
        int numero;
        Scanner entradaInt = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        numero = entradaInt.nextInt();

        if(numero % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }

    }
}