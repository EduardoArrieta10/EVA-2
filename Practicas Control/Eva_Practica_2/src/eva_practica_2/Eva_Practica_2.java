/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_practica_2;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta 18550670
 */
public class Eva_Practica_2 {
    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Ingresa El numero");
        int num1;
        
        num1 = input.nextInt();
        double numD;
        
        numD = num1 % 2;
        if (numD == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
    }
    
}
