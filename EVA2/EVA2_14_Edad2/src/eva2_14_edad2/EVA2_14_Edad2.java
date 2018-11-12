/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_edad2;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta  
 */
public class EVA2_14_Edad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
       
       
         int uED = 0;
       for (int pED = 1; pED <= 5; pED++){
         System.out.println("Ingrese la edad " + pED);
       uED = uED + uED + input.nextInt();
    }
       double dM = (double)uED/5;
         System.out.println("La media es " + dM);
    }   
}
