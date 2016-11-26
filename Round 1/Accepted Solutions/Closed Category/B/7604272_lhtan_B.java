import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader systemInput=new BufferedReader(new InputStreamReader(System.in));
        String S;
        S = systemInput.readLine();
        int n = 1;
        while (!S.equals("#")) {

            System.out.print("Case " + n + ": ");

            switch (S) {
                case "HELLO":
                    System.out.println("ENGLISH");
                    break;

                case "HOLA":
                    System.out.println("SPANISH");
                    break;
                case "HALLO":
                    System.out.println("GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("FRENCH");
                    break;
                case "CIAO":
                    System.out.println("ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("RUSSIAN");
                    break;
                default:
                    System.out.println("UNKNOWN");
            }
            
                   S = systemInput.readLine();
            n++;
        }

    }

}
