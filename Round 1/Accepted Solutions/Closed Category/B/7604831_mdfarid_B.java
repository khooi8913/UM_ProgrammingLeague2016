import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        char[] word = new char[15];
        String temp = "";
        int count = 1;
        
        do{
            temp = input.next();
            if(temp.length()>14){
            }
            else
            {
                if(temp.equals("HELLO")){
                System.out.println("Case " + count + ": ENGLISH");
                count++;
            }
            else if(temp.equals("HOLA")){
                System.out.println("Case " + count + ": SPANISH");
                count++;
            }
            else if(temp.equals("HALLO")){
                System.out.println("Case " + count + ": GERMAN");
                count++;
            }
            else if(temp.equals("BONJOUR")){
                System.out.println("Case " + count + ": FRENCH");
                count++;
            }
            else if(temp.equals("CIAO")){
                System.out.println("Case " + count + ": ITALIAN");
                count++;
            }
            else if(temp.equals("ZDRAVSTVUJTE")){
                System.out.println("Case " + count + ": RUSSIAN");
                count++;
            }
            else
            {
                if(!temp.equals("#")){
                    System.out.println("Case " + count + ": UNKNOWN");
                    count++;
                }
                else
                    break;
            }
            }
        }while(!temp.equals("#") || count<=2000);
    }
}