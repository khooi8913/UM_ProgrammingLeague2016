
import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
           
            if(n==1){
                st.nextToken();
                System.out.println("Jolly");
            }else{
                int first = Integer.parseInt(st.nextToken());
                int last;
                boolean g[] = new boolean[n-1];
                boolean jolly = true;
                for(int i=0;i<n-1;i++){
                    last = Integer.parseInt(st.nextToken());
                    if(Math.abs(first-last)<n&&Math.abs(first-last)>0){
                        g[Math.abs(first-last)-1] = true;
                    }else{
                        jolly = false;
                        break;
                    }
                    first = last;
                }
                if(jolly){
                    for(int i=0;i<n-1;i++){
                        if(!g[i]){
                            jolly = false;
                            break;
                        }
                    }
                }
                if(jolly){
                    System.out.println("Jolly");
                }else{
                    System.out.println("Not jolly");
                }
            }
        }
    }
   
}
