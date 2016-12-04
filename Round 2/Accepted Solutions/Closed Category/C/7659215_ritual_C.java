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
            int a = Integer.parseInt(words);
            for(int i=0;i<a;i++)
            {
                String b = input.readLine();
                String[] c = b.split(" ");
                int i1 = Integer.parseInt(c[0]);
                int i2 = Integer.parseInt(c[1]);
                
                int a2=((i1-i2)/2);
                int a1=i1-a2;
                int h,l;
                if(a1>a2)
                {
                    h=a1;
                    l=a2;
                }
                else
                {
                    l=a1;
                    h=a2;
                }
                
                
                if(h+l==i1&&h-l==i2&&h>=0&&l>=0)
                {
                    System.out.println(h+" "+l);
                }
                else
                {
                    System.out.println("impossible");
                }
            }
        }
        
        catch(IOException e)
        {}
    }
}
    