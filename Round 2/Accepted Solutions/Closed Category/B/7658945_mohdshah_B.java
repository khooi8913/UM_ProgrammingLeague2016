import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int cases=Integer.parseInt(br.readLine());
    String ans;
    for (int i = 1; i <= cases; i++) {
        String s=br.readLine();
        System.out.println("Case "+i+": "+findMax(s));
        }
    }
    
    public static String findMax(String st){
        
        String t[]=st.split(" ");
        if(t.length==2){return t[1];}
        String ans;
        int max=0;
        int size=t.length;
        int d[]=new int[size];
        for (int i = 0; i <t.length; i++) {
            d[i]=Integer.parseInt(t[i]);
        }
        for (int i = 2; i <= d[0]; i++) {
            if(d[i-1]>d[i]){
                d[i]=d[i-1];
                max=d[i];
            }
            else{max=d[i];}
        }
        ans=Integer.toString(max);
        return ans;
    }
}
