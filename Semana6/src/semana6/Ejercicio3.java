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
public class Ejercicio3 {

    public static void main(String[] args) {

        String cadenafinal = String.format("%s\n", "Estatura Estudiante");

        boolean verdad = true;
        int contador = 1;
        double promedio;
        double suma = 0;

        System.out.println("Ingrese la estatura de sus estudiantes");
        
        Scanner entrada = new Scanner(System.in);

        while (verdad) {

                        System.out.printf("Ingrese la estatura del estudiante número %d:\n", contador);
            double estatura = entrada.nextDouble();

            if (estatura <= 1.20) {
                estatura = 1.20;
            }

            suma = suma + estatura;

            cadenafinal = String.format("%s%f\n", cadenafinal, estatura);

            contador = contador + 1;
            
            entrada.nextLine();
            
            System.out.println("Desea ingresar otra estatura(si(salir)- no(seguir)):");
            String temporal = entrada.nextLine();

            if (temporal.equals("si")) {
                verdad = false;
            }
        }
        promedio = suma / (contador-1);

        System.out.printf("%s", cadenafinal);
        System.out.printf("Promedio de estaturas: %f", promedio);
    }
}
