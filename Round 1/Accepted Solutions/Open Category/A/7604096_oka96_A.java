import java.util.*;
import java.io.*;

public class Main {
  
    public static void main(String[] args)throws IOException{   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("0 0 0 0")){
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            int total = 360*3;
            total += (360-(b-a)*9)%360;
            total += (360-(b-c)*9)%360;
            total += (360-(d-c)*9)%360;
            System.out.println(total);
        }
             
    }
}
