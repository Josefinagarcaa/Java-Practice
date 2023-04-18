import java.util.Scanner;

public class DiaDeSemana{
        public static void main(String[] args){
            int numero;
               Scanner entradaInt = new Scanner(System.in);

            System.out.println("Introduzca un numero de el 1 al 7: ");
            numero = entradaInt.nextInt();

        switch (numero){
            case 1:
                    System.out.println("El dia correspondiente es Lunes");
                    break;
            case 2:
                    System.out.println("El dia correspondiente es Martes");
                    break;        
            case 3:
                    System.out.println("El dia correspondiente es Miercoles");
                    break;
            case 4:
                    System.out.println("El dia correspondiente es Jueves");
                    break; 
            case 5:
                    System.out.println("El dia correspondiente es Viernes");
                    break;  
            case 6:
                    System.out.println("El dia correspondiente es Sabado");
                    break;     
            case 7:
                    System.out.println("El dia correspondiente es Domingo");
                    break; 
            default:
                    System.out.println("Error: el numero introducido esta de fuera el rango de el 1 al 7");           

        }

    }
}