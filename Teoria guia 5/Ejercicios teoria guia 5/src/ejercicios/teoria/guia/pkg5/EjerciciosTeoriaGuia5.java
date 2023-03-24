/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
 y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package ejercicios.teoria.guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosTeoriaGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] Equipo = new String [7];
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres de los integrantes de su grupo");
        
        for (int i = 0; i < 6; i++) {
            
            Equipo[i] = leer.nextLine();
            
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println(Equipo[i]);
        }
    }
    
}
