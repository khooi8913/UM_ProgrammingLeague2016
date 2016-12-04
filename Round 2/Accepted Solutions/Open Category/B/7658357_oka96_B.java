
import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            int arr[] = new int[x];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<x;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int swap = bubblesort(arr);
            System.out.printf("Optimal train swapping takes %d swaps.\n",swap);
        }
        
    }
   
    public static int bubblesort(int []arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    count++;
                }
            }
        }
        return count;
    }
}
