import java.util.*;
/**
 *
 * @author Owner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String[] s2=new String[2000];
        s2[0]="go";
        int a;
        for(a=0;a<s2.length;a++)
        {
            s2[a]=s.nextLine();
            if(s2[a].charAt(0)=='#')
                break;
        }
        for(int b=1;b<a+1;b++)
        {
                            char[] c=new char[s2[b-1].length()];
                for(int d=0;d<c.length&&d<14;d++)
                {
                    c[d]=s2[b-1].charAt(d);
                }
                String s1=new String(c);
                switch (s1){
                    case "HELLO":    System.out.println("Case "+b+": ENGLISH");
                    break;
                    case "HOLA": System.out.println("Case "+b+": SPANISH");
                    break;
                    case "HALLO": System.out.println("Case "+b+": GERMAN");
                    break;
                    case "BONJOUR": System.out.println("Case "+b+": FRENCH");
                    break;
                    case "CIAO": System.out.println("Case "+b+": ITALIAN");
                    break;
                    case "ZDRAVSTVUJTE": System.out.println("Case "+b+": RUSSIAN");
                    break;
                    default: System.out.println("Case "+b+": UNKNOWN");
                }
        }
    }
    
}