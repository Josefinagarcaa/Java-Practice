import java.util.Scanner;
public class DeterminaNumero{
    public static void main(String[] args){

        try (Scanner entradaInt = new Scanner(System.in)) {
            int numero;
            System.out.println("Cual es tu numero?");
            numero = entradaInt.nextInt();

            if(numero==0){
                System.out.println("Su numero es 0");
            }else if(numero<0){
                System.out.println("Su numero es negativo");
            }else if(numero>0){
                System.out.println("Su Numero es positivo");
            }
        }
    }

}