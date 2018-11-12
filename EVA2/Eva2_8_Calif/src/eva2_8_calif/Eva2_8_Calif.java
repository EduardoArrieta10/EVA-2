/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_calif;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_8_Calif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in);
       System.out.println("Ingresa Un numero del 100 al 60");
        int Cali = input.nextInt();
        
        switch (Cali) {
            case 100: 
                System.out.println("La Calificacion es A");
                break;
                
             case 90: 
                System.out.println("La Calificacion es B");
                break;    
            
             case 80: 
                System.out.println("La Calificacion es C");
                break;    
             case 70: 
                System.out.println("La Calificacion es D");
                break;
            case 60: 
                System.out.println("La Calificacion es F");
                break;
             default:
                System.out.println("Calificacion fuera de rango");
        }
       
    }
    
}
