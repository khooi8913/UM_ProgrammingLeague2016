import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=0;
        String words;
        String[] str=null;
        Scanner in= new Scanner (new InputStreamReader(System.in));
        while(in.hasNextLine()){
            words=in.nextLine();
            num++;
            if(words.equals("#"))
                break;
            else{
                switch(words){
                    case "HELLO":
                        System.out.println("Case "+num+": ENGLISH");
                        break;
                    case "HOLA":
                        System.out.println("Case "+num+": SPANISH");
                        break;
                    case "HALLO":
                        System.out.println("Case "+num+": GERMAN");
                        break;
                    case "BONJOUR":
                        System.out.println("Case "+num+": FRENCH");
                        break;
                    case "CIAO":
                        System.out.println("Case "+num+": ITALIAN");
                        break;
                    case "ZDRAVSTVUJTE":
                        System.out.println("Case "+num+": RUSSIAN");
                        break;
                    default : 
                        System.out.println("Case "+num+": UNKNOWN");
                        break;
                }
            }
        }
    }
    
}