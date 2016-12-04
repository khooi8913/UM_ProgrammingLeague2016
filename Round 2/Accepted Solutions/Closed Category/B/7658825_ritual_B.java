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
                int max=0;
                int d = Integer.parseInt(c[0]);
                for(int j=1;j<=d;j++)
                {
                    int e = Integer.parseInt(c[j]);
                    if(e>max)
                    {
                        max=e;
                    }
                }
                System.out.println("Case "+(i+1)+": "+max);
            }
        }
        
        catch(IOException e)
        {}
    }
}
    