/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_practica_10;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta 18550670
 */
public class Eva_Practica_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println ("introduce Matematicas");
        int MAT = input.nextInt();
        
        System.out.println ("introduce Fisica");
        int FIS = input.nextInt();
        
        System.out.println ("introduce Quimica");
        int QUI = input.nextInt();
        
        int PROM = MAT + FIS + QUI;
         if (((MAT >= 65) &&
                (QUI >= 55) && (PROM >= 180) )){
             System.out.println("Aceptado");
         }else{
             System.out.println("Intentalo despues");
         }
        
        
    }
    
}
