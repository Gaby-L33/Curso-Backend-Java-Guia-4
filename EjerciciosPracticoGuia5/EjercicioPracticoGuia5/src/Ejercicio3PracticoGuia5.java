/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3PracticoGuia5 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese dimension del vector");
        
        int n = leer.nextInt();
        int vector[] = new int[n];
        int aux[] = new int[n];
        int opc = 0;
        int cont1, cont2, cont3, cont4, cont5;
        
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
        }
        for (int i = 0; i < aux.length; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                cont1++;
            }
            if (vector[i] >= 10 && vector[i] < 100) {
                cont2++;
            }
            if (vector[i] >= 100 && vector[i] < 1000) {
                cont3++;
            }
            if (vector[i] >= 1000 && vector[i] < 10000) {
                cont4++;
            }
            if (vector[i] >= 10000 && vector[i] < 100000) {
                cont5++;
            }

        }
        System.out.println("de 1 digito tenemos " + cont1 + " numeros");
        System.out.println("de 2 digitos tenemos " + cont2 + " numeros");
        System.out.println("de 3 digitos tenemos " + cont3 + " numeros");
        System.out.println("de 4 digitos tenemos " + cont4 + " numeros");
        System.out.println("de 5 digitos tenemos " + cont5 + " numeros");
    }
    
}
