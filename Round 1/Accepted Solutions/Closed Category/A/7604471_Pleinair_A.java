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
                int b=k.nextInt();
                int a=0;
                if(b>10)
                    b=10;
        for(int c=0;c<=b;c++){
        String s=k.nextLine();
        if(s.length()==3)
        {
            if((s.charAt(0)=='o'&&s.charAt(1)=='n')||(s.charAt(0)=='o'&&s.charAt(2)=='e')||(s.charAt(1)=='n'&&s.charAt(2)=='e'))
                System.out.println("1");            
            else if((s.charAt(0)=='t'&&s.charAt(1)=='w')||(s.charAt(0)=='t'&&s.charAt(2)=='o')||(s.charAt(1)=='w')&&s.charAt(2)=='o')
                System.out.println("2");
        }else if(s.length()==5)
        {
            if(s.charAt(0)=='t')
                a++;
            if(s.charAt(1)=='h')
                a++;
            if(s.charAt(2)=='r')
                a++;
            if(s.charAt(3)=='e')
                a++;
            if(s.charAt(4)=='e')
                a++;
            if(a>=4)
                System.out.println("3");
        }
        }
    }
    
}