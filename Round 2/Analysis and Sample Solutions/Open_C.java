/*
    Programming League 2016
    Open Category Question C

    Question Title: Broken Keyboard

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
    A very rare simulation problem. For easier understanding, try opening up your notepad and simulating the scenario as stated in the question.
    For this question, it is recommended to solve by using Stack/ LinkedList for easy implementation.
    For Java especially, TLE can be easily triggered.
    When generating the Output, DO NOT traverse through the whole List. 
    .toString() and StringBuilder is highly recommended.
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        String s;
        
        while((s=br.readLine())!=null){
            LinkedList a = new LinkedList();
            StringBuilder st = new StringBuilder();
            
            boolean homeKey = false;
            int homePressed=0;
            boolean endKey = true;
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='['){
                    homeKey = true;
                    homePressed=0;
                    endKey = false;
                }else if(s.charAt(i)==']'){
                    endKey = true;
                    homeKey = false;
                }else{
                    if(homeKey){
                        if(homePressed==0){
                            a.addFirst(s.charAt(i));
                            homePressed+=1;
                        }else if(homePressed!=0){
                            a.add(homePressed, s.charAt(i));
                            homePressed+=1;
                        }
                    }else{
                        a.addLast(s.charAt(i));
                    }
                }
            }
            
            String b = a.toString();
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)!='['&&b.charAt(i)!=']'&&b.charAt(i)!=','&&b.charAt(i)!=' ')
                    st.append(b.charAt(i));
            }
            
            pr.println(st.toString());
        }
        pr.close();    
    }
}
