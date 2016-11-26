import java.util.*;
import java.io.*;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner (System.in);
        boolean status = true;
        int start = 0, c1 = 0, c2 = 0, c3 = 0, code = 0 , temp;
        ArrayList<Integer> answers = new ArrayList<Integer>();
        while(status)
        {        
        while(k.hasNext())
        {
            start = k.nextInt();
            c1 = k.nextInt();
            c2 = k.nextInt();
            c3 = k.nextInt();
            break;
        }
        if (start==c1||c1==c2||c2==c3)
        {
            break;
        }
        if((start+c1+c2+c3)==0)
        {
            answers.add(code);
            status = false;
            break;
        }
        if ((40 - (c1-start))>40)
        {
            temp = start - c1;
        }
        else
        {
        temp = 40 - (c1-start);
        }
        code = 720 + (temp*9);
        code += 360;
        if (((40-c1)+c2)<40)
        {
            temp = 40-c1+c2;
        }
        else
        {
            temp = c2-c1;
        }
        code += (temp*9);
        if ((40 - (c3-c2))>40)
        {
            temp = c2-c3;
        }
        else
        {
            temp = 40 - (c3-c2);
        }
        code = code + (temp*9);
        answers.add(code);        
        }
        answers.forEach(System.out::println);
    }
}