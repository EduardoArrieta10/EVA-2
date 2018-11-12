/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_practica_1;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta 18550670
 */
public class Eva_Practica_1 {
    private static Scanner input = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                System.out.println("Ingresa El primer numero");
        int num1;
        
        num1 = input.nextInt();
        System.out.println("Ingresa El segundo numero");
        int num2;
        
        num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("Son numeros iguales");
        } else {
            System.out.println("No son numeros iguales");
        }
        
       
    }
    
}
