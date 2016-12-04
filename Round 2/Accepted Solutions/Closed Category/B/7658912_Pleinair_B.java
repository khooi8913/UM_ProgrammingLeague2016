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
        Scanner k=new Scanner(System.in);
        int k1=k.nextInt();
        if(k1>50)
            k1=50;
        k.next();
        int a=0;
        String s;
        while(a<k1)
        {int b=0;
         int c=0;
            s=k.nextLine();
            for(String s1: s.split(" "))
            {
                if(b==0)
                {b++;
                    continue;}
                if(Integer.parseInt(s1)>c)
                    c=Integer.parseInt(s1);
                b++;
            }
            System.out.println("Case "+(a+1)+": "+c);
         a++;
        }
    }
    
}