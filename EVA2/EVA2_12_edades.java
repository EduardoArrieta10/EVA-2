/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int uED = 0;
        
        System.out.println("Ingrese la primera edad: ");
         uED += input.nextInt();
         
         System.out.println("Ingrese la segunda edad: ");
         uED = uED + uED + input.nextInt();
         
         System.out.println("Ingrese la segunda edad: ");
         uED = uED + uED + input.nextInt();
         
         System.out.println("Ingrese la segunda edad: ");
         uED = uED + uED + input.nextInt();
         
         System.out.println("Ingrese la segunda edad: ");
         uED = uED + uED + input.nextInt();
         
         double dM = (double)uED/5;
         System.out.println("La media es " + dM);
    
    
    }
    
}
