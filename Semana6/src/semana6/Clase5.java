/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

/**
 *
 * @author Usuario
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int suma = 1;
       
        System.out.printf("%s\t%S\n","CONTADOR","SUMA");
        while (contador <= 4){
            suma = suma + contador;
            System.out.printf("%d\t%d\n", contador, suma);
            contador = contador + 1;
        }
    }
    
}
