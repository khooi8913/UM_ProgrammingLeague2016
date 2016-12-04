import java.util.*;

public class Main {

    public static void main(String args[] ) throws Exception {

        Scanner sss = new Scanner(System.in);
        int tests = sss.nextInt();
        for(int i=1;i<=tests;i++){
            int participants = sss.nextInt();
            int max = 0;
            for(int j=1;j<=participants;j++)
            {
               max = Math.max(max,sss.nextInt());
            }
            System.out.println("Case "+i+": " +max);
        }
    }


}