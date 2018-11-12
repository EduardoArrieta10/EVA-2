/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_nestead_if;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta
 */
public class Eva2_3_Nestead_If {

    /**
     * @param args the command line arguments
     * 
     * private static Scanner input = new Scanner(System.in);
     */
    

private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println("Ingresa tu calificacion");
        int cal = 0;
         cal = input.nextInt ();
        if (cal == 100) {
            System.out.println("Tu Calificacion es A");
        } else {
            if ((cal >= 90) && (cal <= 90)) {
                System.out.println("Tu calificacion es B");
            } else {
                if ((cal >= 80) && (cal <= 80)) {
                    System.out.println("Tu Calificacion es C");
                } else {
                    if ((cal >= 70) && (cal <= 70)) {
                        System.out.println("Tu Calificacion es D");
                    } else {
                        if (cal >= 60) {
                            System.out.println("Tu Calificacion es F");
                        } else {
                            System.out.println("Reprobatorio");
                        }
                    }
                        
                }
            }
        }
    }

    private static class input {

        public input() {
        }
    }
}
