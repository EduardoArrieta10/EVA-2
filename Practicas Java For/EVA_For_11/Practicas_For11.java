import java.util.Scanner;

public class Practicas_For11 {
    public static void main(String[] args) {
        System.out.println("Numero para no dividir");
        Scanner sInput = new Scanner(System.in);
        int iNum= sInput.nextInt();
        for (int i=1; i<=100;i++){
            double dDiv= i%iNum;
            if (dDiv!=0){
                System.out.println(i);
            }

        }
    }
}
