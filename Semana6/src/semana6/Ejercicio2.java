/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        int edad;
        int contador = 0;
        int suma = 0;
        String cadenafinal = String.format("%s\t%s\n", "EDAD", "SUMA");

        while (contador <= 5) {
            System.out.println("Ingrese el valor de la edad:");
            Scanner entrada = new Scanner(System.in);
            edad = entrada.nextInt();
            //System.out.printf("%d\t%d\n", edad, suma);
            cadenafinal = String.format("%s%d\t%d\n", cadenafinal, edad, suma);
            suma = suma + edad;
            contador = contador + 1;
        }

        System.out.printf("%s", cadenafinal);

    }

}
