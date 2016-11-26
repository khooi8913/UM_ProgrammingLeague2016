/*
	Programming League 2016
	Open Category Question B
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

    	//BufferedReader and PrintWriter are known Fast IOs in Java
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        int X=0;

        while((X=Integer.parseInt(br.readLine()))!=0){

        	//Read age data input as one String
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            //You can either use an Arraylist or a normal Array
            ArrayList<Integer> age = new ArrayList();
            for(int i=0;i<X;i++){
                age.add(Integer.parseInt(st.nextToken()));
            }

            //Sorts the age data with Java Collection Framework's built in sort function with a time complexity of O(N*log(N))
            //If a normal Integer array is used, Arrays.sort(age) then will be used
            Collections.sort(age);

            //Generate the final answer's string, then print it out
            StringBuilder sb = new StringBuilder();
            String z = age.toString();
            for(int i=0;i<z.length();i++){
                if(Character.isDigit(z.charAt(i))||Character.isSpaceChar(z.charAt(i))){
                    sb.append(z.charAt(i));
                }
            }

            pr.println(sb.toString());
        }
        pr.close();
    }
    
}
