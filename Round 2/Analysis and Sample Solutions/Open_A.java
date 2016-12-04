/*
    Programming League 2016
    Open Category Question A

    Question Title: Jolly Jumpers

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
    Simple data structure problem, array will be sufficient to solve the problem.
    Needs you to check whether all integers before N are utilized in the sequence.

    Looking at the Sample Input1:
    4 1 4 2 3
    N = 4
    
    1-4 = 3
    4-2 = 2
    2-3 = 1

    Since N = 4, so the absolute differences calculated must take on 1 until N-1, 3.
    It means that 1, 2, 3 must exist. All 1, 2, 3 is taken.
    Hence it is JOLLY.
    
    Looking at Sample Input2:
    5 1 4 2 -1 6
    N=5

    1-4 = 3
    4-2 = 2
    2-(-1)=3
    -1-6 = 7
    Since N=5, so the absolute differences calculated must take on 1 until N-1, 4.
    It means that 1, 2, 3, 4 must exist. However, in this case, only 2 and 3 is taken. 1 and 4 is not.
    Hence it is NOT JOLLY.
*/

import java.io.*;

public class Main {

    public static void main (String [] args) throws IOException  {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        String s;
        while ((s=br.readLine())!=null) {
            String [] _s =s.split(" ");
            int n = Integer.parseInt(_s[0]);
            
            int [] num=new int [n];
            for (int i=0;i<num.length;i++) {
                    num[i]=Integer.parseInt(_s[i+1]);
                }

            int [] difference = new int[n-1];
            for (int i=0;i<num.length-1;i++) {
                difference[i] =Math.abs(num[i]-num[i+1]);
            }
            
            boolean[] check = new boolean[difference.length];
            for(int i=1;i<=difference.length;i++){
                for(int j=0;j<difference.length;j++){
                    if(i==difference[j])    check[i-1]=true;
                }
            }
            
            boolean status=true;
            for(int i=0;i<check.length;i++){
                if(check[i]==false)
                    status = false;
            }
            
            if(status){
                pr.println("Jolly");
            }
            else{
                pr.println("Not jolly");
            }
	   }
       pr.close();
    }
}
    