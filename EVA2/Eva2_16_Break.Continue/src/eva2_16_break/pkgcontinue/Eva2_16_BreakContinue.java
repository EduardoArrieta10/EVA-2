/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_break.pkgcontinue;

/**
 *
 * @author Eduardo Arrieta
 */
public class Eva2_16_BreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //break
        for (int NO = 1; NO <10; NO++){
            System.out.println(NO);
            int NRE = NO % 5;
            if (NRE == 0)
                break;
    }
       //continue 
        for (int NO = 1; NO <10; NO++){
        int NRE = NO % 5;
            if (NRE == 0)
                continue;
        System.out.println(NO);
    }
    
}
}