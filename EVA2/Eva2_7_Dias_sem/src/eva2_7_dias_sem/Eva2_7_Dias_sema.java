/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_dias_sem;

import java.util.Scanner;

/**
 *
 * @author Eduardo Arrieta
 */
public class Eva2_7_Dias_sema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa Un numero del 1 al 7");
        int NoD = input.nextInt();
        
        switch (NoD) {
            case 1: 
                System.out.println("Lunes");
                break;
                
             case 2: 
                System.out.println("Martes");
                break;    
            
             case 3: 
                System.out.println("Miercoles");
                break;    
             case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Viernes");
                break;
             case 6: 
                System.out.println("Sabado");
                break;  
             case 7: 
                System.out.println("Domingo");
                break;    
           default:
                System.out.println("Fuera de rango");
        }
        
        
        
        
    }
    
}
