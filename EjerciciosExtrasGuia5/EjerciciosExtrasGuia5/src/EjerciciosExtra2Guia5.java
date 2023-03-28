
import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros 
son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */

/**
 *
 * @author Usuario
 */
public class EjerciciosExtra2Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores: ");
        int n = leer.nextInt();

        int[] vector1 = new int[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 2);
            System.out.print("[" + vector1[i] + "}");
        }
        System.out.println("");
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            vector2[i] = (int) (Math.random() * 2);
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
       
        for (int i = 0; i < n; i++) {
            if(vector1[i]!=vector2[i]){ 
             System.out.println("Los vectores son diferentes. ");
                break;
            }   else{   
                System.out.println("Los vectores son iguales. ");
            }
        }

    }
}
    
    

