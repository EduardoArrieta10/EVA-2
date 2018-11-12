import java.util.Scanner;

public class Practicas_For10 {
    public static void main (String[]args){
        System.out.println("Cantidad de asteriscos?");
        Scanner sInput= new Scanner (System.in);
        int iCantidad= sInput.nextInt();
        for (int i=1; i<=iCantidad; i++){
            System.out.print("*");
        }
    }
}
