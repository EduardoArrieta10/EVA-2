/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_practica_4;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta 18550670
 */
public class Eva_Practica_4 {
    private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa un Numero");
        int num1;
        
        num1 = input.nextInt();
        if (num1 > 0) {
            System.out.println("1");
        } else {
            if (num1 == 0) {
                System.out.println("0");
            } else {
                if (num1 < 0) {
                    System.out.println("-1");
                }
            }
        }
    }
}
