import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader systemInput=new BufferedReader(new InputStreamReader(System.in));
       String s;
        int numLines = Integer.parseInt(systemInput.readLine());
        
       while(numLines>0){
           int n=0;
           s=systemInput.readLine();
           if(s.length()==3){
               if(s.charAt(0)=='o'){
                   n++;
               }
              if(s.charAt(1)=='n'){
                   n++;
               }
               if(s.charAt(2)=='e'){
                   n++;
               }
               if(n>=2){
                   System.out.println("1");
               }
               else{
                   System.out.println("2");
               }
       
               
           }
           else{
               System.out.println("3");
           }
           numLines--;
       }

    }

}
