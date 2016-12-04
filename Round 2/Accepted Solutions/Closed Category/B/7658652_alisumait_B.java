import java.util.*;

public class Main{

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            int nump = s.nextInt();
            int max = 0;
            for(int j=1;j<=nump;j++)
            {
               max = Math.max(max,s.nextInt());
            }
            System.out.println("Case "+i+": " +max);
        }
    }


}
