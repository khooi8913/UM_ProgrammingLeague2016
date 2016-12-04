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
            while(!words.equals("0"))
            {
                System.out.println(cal(words));
                words = input.readLine();
            }
            input.close();
        }
        
        catch(IOException e)
        {}
        
    }
    
    public static String cal(String a)
    {
        char b;
        while(a.length()!=1)
        {
            int total=0;
            for(int i=0;i<a.length();i++)
            {
                b = a.charAt(i);
                int c = Character.getNumericValue(b) ;
                total+=c;
            }
            a = Integer.toString(total);
        }
        return a;
    }
    
}