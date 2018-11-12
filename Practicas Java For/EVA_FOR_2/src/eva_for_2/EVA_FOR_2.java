/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_for_2;

import java.util.Scanner;



/**
 *
 * @author invitado
 */
public class EVA_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa el numero de veces que deberia repetirse el nombre");
        int NOM;
        NOM= input.nextInt();
        for (int NO = 1; NO <= NOM; NO++) {
            System.out.println(NO + " Saul Eduardo Arriet Garcia");
        }
    }
    
}
