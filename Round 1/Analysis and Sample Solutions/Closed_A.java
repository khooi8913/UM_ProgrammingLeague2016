/*
    Programming League 2016
    Closed Category Question A

    Question Title: One-Two-Three

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.
    
    Question Analysis:
    For this question, it is given to us that for each word, there would be at most ONE mistake and the word length is always correct.

    one > length = 3
    two > length = 3
    three > length = 5

    Hence, as we can see that only "three" is having a different wordlength.
    Always process the odd case out FIRST in your if else statements, which is "3".
    
    Then only you proceed to deal with "one" and "two" by using the .chartAt() method.

    Common mistake made:
        if(..)
            System.out.println("1");
        else if(..)
            System.out.println("2");
        else
            System.out.println("3");
    
    If you are not looking at the word length initially, 
    imagine you are using x.contains('o') && x.contains('e'), what if "ote" (one) or "throe" (three), which should be the correct answer?
    
    If you are using .charAt(), majority of you who got it wrong, only cover 2 out of 3 of the conditions, whereby you should cover all three possible conditions.
    Example:
        >> for "one"
        if(x.charAt(0)=='o'&&x.charAt(1)=='n' || x.charAt(0)=='o'&&x.charAt(2)=='e' || x.charAt(1)=='n'&&x.charAt(2)=='e')

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        //BufferedReader and PrintWriter are known Fast IOs in Java
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        int numCases = Integer.parseInteger(br.readLine());

        for(int i=0;i<numCases;i++){

            String a = br.readLine();
            
            if(a.length()==5)   pr.println("3");
            else{
                int count=0;

                if(a.charAt(0)=='o')    count++;
                if(a.charAt(1)=='n')    count++;
                if(a.charAt(2)=='e')    count++;

                if(count>=2)
                    pr.println("1");
                else
                    pr.println("2");
            }
        }
        pr.close();
    }
    
}
