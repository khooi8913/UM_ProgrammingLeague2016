/*
	Programming League 2016
	Open Category Question B

	Question Title: Age Sort

	**Disclaimer**
	In the world of programming, there exists various ways to solve a problem.
	The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

	Question Analysis:
	Fairly simple sorting question, however, given the input enourmous 25MB input size, the use of fast and efficient IO and sorting algorithm
	must be used in order to meet time limits. Hence, using bubble sort (time complexity O(N^2)) would definitely receive a Time Limit Exceeded Error.

	There are built in sorting algorithms in Java's Collection Framework and Java's Arrays (also Python sort() and C++ std::sort()).
	E.g. in Java, Collections.sort() or Arrays.sort() are both having a time complexity of O(N*log(N)) which is highly efficient.
	
	Apart from that, you can try comparing the speed of outputting the elements in an Array one by one;
	OR, constructing the answer string using the array before printing the array. Which would be faster?
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
