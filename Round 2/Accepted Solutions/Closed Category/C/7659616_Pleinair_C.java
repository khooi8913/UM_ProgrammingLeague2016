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
        int a=k.nextInt();
        while(a>0)
        {
            double s=k.nextDouble();
            double d=k.nextDouble();
            double e=s/2;
            double f=d/2;
            if(s<0||d<0||e<0||f<0||e+f<0||e-f<0||(int)(e+f)-(e+f)!=0||(int)(e-f)-(e-f)!=0)
                System.out.println("impossible");
            else
                System.out.println((int)(e+f)+" "+(int)(e-f));
            a--;
        }
    }
    
}