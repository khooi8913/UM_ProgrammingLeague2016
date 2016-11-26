/*
    Programming League 2016
    Closed Category Question A
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
