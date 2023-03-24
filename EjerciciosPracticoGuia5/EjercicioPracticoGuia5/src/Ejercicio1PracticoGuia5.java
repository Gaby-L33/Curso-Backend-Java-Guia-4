/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio1PracticoGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.*/
        int[] vector = new int[100];
        //Llenamos vector
        for (int i = 0; i<100;i++){
            vector[i]=i+1;
        }
        //Imprimimos vector
        for (int i = 99; i >= 0;i--){
            System.out.println(vector[i]);
        }
    }
}
    
    

