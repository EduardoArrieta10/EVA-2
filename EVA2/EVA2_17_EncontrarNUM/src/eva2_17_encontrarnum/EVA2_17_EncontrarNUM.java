/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_encontrarnum;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta
 */
public class EVA2_17_EncontrarNUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner input = new Scanner(System.in);
        
        int NOA = (int)(Math.random() * 10) + 1;
        for (int NO = 1; NO <3; NO++){
            System.out.println("Adivina el numero");
            int NOM = input.nextInt();
            if (NOM == NOA){
           
            
                break;
            }
            if (NO == 2){
            System.out.println("Acertaste");
            }
    }
    }
    
}
