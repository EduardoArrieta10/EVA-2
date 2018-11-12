public class Practicas_For14 {
    public static void main (String[]args){
        String sAst="";
        for (int i=1; i<=10; i++){
            sAst+="*";
            System.out.println(sAst);
        }
        for (int i=9;i>=1;i--){
            for (int inicio=1; inicio<=i;inicio++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
