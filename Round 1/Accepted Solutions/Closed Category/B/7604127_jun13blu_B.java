import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String t, word = "";
        int c = 1;
        do{
            word = keyboard.readLine();
            if(!word.equals("#")){
                switch(word){
                    case "HELLO":
                        t = "ENGLISH";
                        break;
                    case "HOLA":
                        t = "SPANISH";
                        break;
                    case "HALLO":
                        t = "GERMAN";
                        break;
                    case "BONJOUR":
                        t = "FRENCH";
                        break;
                    case "CIAO":
                        t = "ITALIAN";
                        break;
                    case "ZDRAVSTVUJTE":
                        t = "RUSSIAN";
                        break;
                    default:
                        t = "UNKNOWN";
                        break;
                }
                System.out.println("Case " + c + ": " + t);
                c++;
            }
        }while(!word.equals("#"));
    }
    
}