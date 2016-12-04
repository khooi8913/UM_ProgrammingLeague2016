import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input;
        String holder;
        while(true){
        String ans="11";
        input=br.readLine();
        if("0".equals(input)){break;}
        while(ans.length()!=1){
            ans=compute(input);
            input=ans;
        }
            System.out.println(input);
        }
        
    }
    
    public static String compute(String input){
        int total=0;
        String output;
        String num[]=input.split("");
        for (int i = 0; i < num.length; i++) {
            total=total+Integer.parseInt(num[i]);
        }
        output=Integer.toString(total);
        return output;
    }
}
