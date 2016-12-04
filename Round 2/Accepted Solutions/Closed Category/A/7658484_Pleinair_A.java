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
        int a=1;
        Scanner k=new Scanner(System.in);
        a=k.nextInt();
        while(a>0&&a<=2000000000)
        {
            int b=0;
            while(a>0)
            {
                b+=a%10;
                a=(a-a%10)/10;
            }
            if(Integer.toString(b).length()>1)
                a=b;
            else
            {
                System.out.println(b);
                a=k.nextInt();
            }
        }
    }
    
}