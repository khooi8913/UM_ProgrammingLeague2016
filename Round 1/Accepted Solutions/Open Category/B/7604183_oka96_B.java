
import java.util.*;
import java.io.*;

public class Main {
  
    public static void main(String[] args)throws IOException{   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        String s;
        while(!(s=br.readLine()).equals("0")){
            int n = Integer.parseInt(s);
            int arr[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());                
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                pr.print(arr[i]);
                if(i!=n-1){
                    pr.print(" ");
                }
            }
            pr.println();
        }
        pr.close();
             
    }
}
