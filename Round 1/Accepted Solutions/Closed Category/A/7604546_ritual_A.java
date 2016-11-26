import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int wordsnum = Integer.parseInt(input.readLine());
            String[] words = {"one","two","three","four","five","six","seven","eight","nine","ten"};
            int[] num = {1,2,3,4,5,6,7,8,9,10};
            int error = 0;
            for(int i=1;i<=wordsnum;i++)
            {
                String a = input.readLine();
                for(int j=0;j<words.length;j++)
                {
                    if(a.length()==words[j].length())
                    {
                        for(int k=0;k<a.length();k++)
                        {
                            char b = a.charAt(k);
                            char c = words[j].charAt(k);
                            if(b!=c)
                            {
                                error++;
                            }
                        }
                        if(error<0||error<2)
                        {
                            System.out.println(num[j]);
                        }
                        error = 0;
                    }
                }
                
            }
        }
        
        catch(IOException e)
        {}
        
    }
    
}