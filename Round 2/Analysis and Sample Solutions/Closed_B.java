/*
    Programming League 2016
    Closed Category Question B

    Question Title: Horror Dash

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
	Lengthy problem statement, however, the solution is straight forward.
	Find out the maximum value of the speed of the scary creature, then you get the answer.
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
            int numStudent = Integer.parseInt(st.nextToken());
            int max=0;
            while(st.hasMoreTokens()){
                max=Math.max(max, Integer.parseInt(st.nextToken()));
            }
            pr.println("Case "+ i+": "+max);
            i++;
        }
        pr.close();
        
    }
    
}
