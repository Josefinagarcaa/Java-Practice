import java.util.Scanner;

public class VocalOConsonante{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        char letra = input.next().charAt(0);

        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("Es una vocal");
            break;
        default:
        System.out.println("Es una consonante");  
        break;

        }

    }

}