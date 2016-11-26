
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String words = input.readLine();
            String language;
            int a = 1;
            while(!words.equals("#"))
            {
                switch (words)
                {
                    case "HELLO":
                        language = "ENGLISH";
                        break;
                    case "HOLA":
                        language = "SPANISH";
                        break;
                    case "HALLO":
                        language = "GERMAN";
                        break;
                    case "BONJOUR":
                        language = "FRENCH";
                        break;
                    case "CIAO":
                        language = "ITALIAN";
                        break;
                    case "ZDRAVSTVUJTE":
                        language = "RUSSIAN";
                        break;
                    default:
                        language = "UNKNOWN";
                }
                System.out.println("Case "+a+": "+language);
                words = input.readLine();
                a++;
            }
        }
        
        catch(IOException e)
        {}
        
    }
    
}