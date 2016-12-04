/*
    Programming League 2016
    Closed Category Question A

    Question Title: Summing Digits

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
	Relatively simple question by just summing all the digits until the total number of digits equals to one.
	Example:
	111 --> 1 + 1 + 1 = 3
	999 --> 9 + 9 + 9 = 27 --> 2 + 7 = 9
	
	You can get the answer by treating the input as a string and looping through all the characters, OR
	you can also get the answer modding 10 and dividing 10 for each round until you get a one-digit answer.
*/

import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        
        String s;
        
        while(!(s=br.readLine()).equals("0")){
            
            if(s.length()==1){
                pr.println(s);
            }

            else{
                while(s.length()!=1){
                    int sum=0;
                    for(int i=0;i<s.length();i++){
                        sum+=Integer.parseInt(s.charAt(i)+"");
                    }
                    s=sum+"";
                }
                pr.println(s);
            }
        }
        pr.close();
    }
    
}
