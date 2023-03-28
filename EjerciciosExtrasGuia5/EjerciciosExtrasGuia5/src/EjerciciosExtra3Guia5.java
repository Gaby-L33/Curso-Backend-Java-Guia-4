/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 */

/**
 *
 * @author Usuario
 */
public class EjerciciosExtra3Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        relleno(vector);
        imprimir(vector);
    }

    public static void relleno(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 5);

        }
    }

    public static void imprimir(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }

    }

}
    
    

