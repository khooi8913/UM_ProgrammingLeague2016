import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String stop = "#";
        
        int i=1;
        String S="";
            while (!S.equalsIgnoreCase(stop)) {
            S = k.next();
            if(S.equalsIgnoreCase(stop)) {
                continue;
            }
                switch(S) {
                case "HELLO" :
                    System.out.println("Case " + i + ": " + "ENGLISH");
                    break;
                case "HOLA" :
                    System.out.println("Case " + i + ": " + "SPANISH");
                    break;
                case "HALLO" :
                    System.out.println("Case " + i + ": " + "GERMAN");
                    break;
                case "BONJOUR" :
                    System.out.println("Case " + i + ": " + "FRENCH");
                    break;
                case "CIAO" :
                    System.out.println("Case " + i + ": " + "ITALIAN");
                    break;
                case "ZDRAVSTVUJTE" :
                    System.out.println("Case " + i + ": " + "RUSSIAN");
                    break;
                default :
                    System.out.println("Case " + i + ": " + "UNKNOWN");
                    break;
                }
                i++;
            }
        }

}