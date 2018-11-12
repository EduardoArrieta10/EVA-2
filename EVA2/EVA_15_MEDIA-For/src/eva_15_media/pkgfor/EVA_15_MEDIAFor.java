/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_15_media.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA_15_MEDIAFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
       int SED = 0;
       for (int Eda = 1; Eda <= 5; Eda++){
           System.out.println("Ingreesa la edad " + Eda + ":");
           SED = SED + input.nextInt();
       }
           double EMED = (float)SED / 5;
           System.out.println("La media es " + EMED);
       
    }
    
}
