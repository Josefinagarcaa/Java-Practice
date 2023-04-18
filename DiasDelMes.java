import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args){
        int mes;
    Scanner entradaInt = new Scanner(System.in);
        System.out.println("Ingresa el numero de el mes para saber la cantidad de dias que tiene: ");
        mes = entradaInt.nextInt();

            switch (mes){
                case 1:
                    System.out.println("Enero tiene 31 dias");
                    break;
                case 2:
                    System.out.println("Febreto tiene 28 dias");
                    break;  
                case 3:
                    System.out.println("Marzo tiene 31 dias");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 dias");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 dias");
                    break;
                case 6:
                    System.out.println("Junio tiene 30 dias");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 dias");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 dias");
                    break;
                case 9:
                    System.out.println("Septiembre tiene 30 dias");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 dias");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 31 dias");
                    break;
                case 12:
                    System.out.println("Enero tiene 31 dias");
                    break;  
                default:
                    System.out.println("Error: el numero ingresado no corresponde a ningun mes de el ano");
                    break;

            }

    }
    
}
