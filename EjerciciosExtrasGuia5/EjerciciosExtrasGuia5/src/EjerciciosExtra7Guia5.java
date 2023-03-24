
import java.util.Scanner;

/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él.

 */

/**
 *
 * @author Usuario
 */
public class EjerciciosExtra7Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos que desea generar: ");
        int n = leer.nextInt();
        n+=1;
        int[] fibonacci = new int[n];

        // Generar los primeros dos términos de la sucesión de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generar el resto de los términos
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir la sucesión de Fibonacci generada
        System.out.print("La sucesión de Fibonacci generada es: ");
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
    
    

