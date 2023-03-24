
import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 */

/**
 *
 * @author Usuario
 */
public class EjerciciosExtra1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int suma=0;
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
       int[] vector = new int [n];
       System.out.println("Ingrese " + n + " valores para el vector");
        for (int i = 0; i < n; i++) {
            vector[i]= leer.nextInt();
            suma += vector[i];
        }
        System.out.println("El resultado de la sumas es: "+ suma);
    } 
}
    
    

