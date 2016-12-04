/*
    Programming League 2016
    Open Category Question B

    Question Title: Train Swapping

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
    Relatively simple question.
    Execute bubble sort, when a swap occurs, increment the counter.
*/

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner br = new Scanner(System.in);
        PrintWriter pr = new PrintWriter(System.out);

        int testCase = Integer.parseInt(br.nextLine());
        
        for(int i=0;i<testCase;i++){
            int swapCount=0;
            int numCarriage = Integer.parseInt(br.nextLine());
            if(numCarriage==0){
                pr.println("Optimal train swapping takes 0 swaps.");
                br.nextLine();
            }
            else{
                String carriages = br.nextLine();
                String[] _carriages = carriages.split(" ");
                int[] _IntCarriages = new int[_carriages.length];

                for(int j=0;j<_IntCarriages.length;j++){
                    _IntCarriages[j]= Integer.parseInt(_carriages[j]);
                }

                for(int k=0;k<_IntCarriages.length;k++){
                    for(int j=0;j<_IntCarriages.length-1;j++){
                        if(_IntCarriages[j]>_IntCarriages[j+1]){
                            int temp = _IntCarriages[j+1];
                            _IntCarriages[j+1] = _IntCarriages[j];
                            _IntCarriages[j]=temp;
                            swapCount++;
                        }    
                    }
                }

                pr.println("Optimal train swapping takes "+swapCount+" swaps.");
            }
        }
        pr.close();
    }
    
}

