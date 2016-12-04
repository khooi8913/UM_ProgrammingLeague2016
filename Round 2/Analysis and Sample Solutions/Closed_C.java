/*
    Programming League 2016
    Closed Category Question C

    Question Title: Beat the Spread

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
    Toughest question of Round 2.
    The attention to details are vital in getting your solution accepted for this problem.

    You have to be very aware of this sentence in the question:
    For each test case, output a line giving the two final scores, largest first. If there are no such scores,
    output a line containing \impossible". Recall that football scores are always non-negative integers.

    So, what makes an INVALID score?
    1.  Score difference > Score Sum 
    2.  Score sum is an odd number (impossible to have decimals in football scores)
    3.  Score is less than 0 (football score does not have negative values)

    By taking in consideration of the above conditions, you should get your solution accepted.
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader systemInput=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        int numCases = Integer.parseInt(systemInput.readLine());
        
        int i=1;
        while(i<=numCases)
        {
            StringTokenizer st = new StringTokenizer(systemInput.readLine());
            int sum = Integer.parseInt(st.nextToken());
            int difference = Integer.parseInt(st.nextToken());

            if(difference>sum){
                pr.println("impossible");
            }
            else if((difference+sum)%2!=0){
                pr.println("impossible");
            }
            else{

                int a = (sum+difference)/2;
                int b = (sum-difference)/2;

                if(a>=0 && b>=0)
                    pr.println(a + " " + b);
                else
                    pr.println("impossible");
            }
            i++;
        }
        pr.close();
    }
    
}
