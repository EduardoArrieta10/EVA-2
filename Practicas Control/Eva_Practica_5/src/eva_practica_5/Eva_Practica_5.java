/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_practica_5;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta 18550670
 */
public class Eva_Practica_5 {
    private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingresa el primer Numero");
        int num1;
        
        num1 = input.nextInt();
        System.out.println("Ingresa el segundo Numero");
        int num2;
        
        num2 = input.nextInt();
        System.out.println("Ingresa el tercer Numero");
        int num3;
        
        num3 = input.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
            }
            System.out.println("El Primer numero es mayor");
        } else {
            if (num2 > num3) {
                if (num2 > num1) {
                }
                System.out.println("El Segundo numero es mayor");
            } else {
                if (num1 > num2) {
                    if (num1 > num3) {
                    }
                    System.out.println("El Primer numero es mayor");
                } else {
                    System.out.println("El tercer numero es mayor");
                }
            }
        }
    }
}


