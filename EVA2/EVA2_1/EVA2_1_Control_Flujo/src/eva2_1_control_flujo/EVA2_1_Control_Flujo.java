/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_control_flujo;
   

import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;

/**
 *
 * @author temporal2
 */
public class EVA2_1_Control_Flujo {
    
      private static final Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa tu Calificacion...");
        double aluCal;
        
        aluCal = input.nextDouble();
        System.out.println("Tu Calificacion es...");
        if (aluCal >= 70) {
            System.out.println("Aprovatoria");
        } else {
            System.out.println("Reproatoria");
        }
   
    }
    
}
