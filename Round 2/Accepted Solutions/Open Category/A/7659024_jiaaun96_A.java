import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=input.readLine())!=null&&!s.trim().equals("\n")&&!s.trim().equals("")&&s.length()!=0){
            String[] seq = s.split(" ");
            int nInput = Integer.parseInt(seq[0]);
            int[] jolly = new int[nInput-1];
            boolean check = true;
            for(int i=1;i<seq.length-1;i++){
                int diff= Math.abs(Integer.parseInt(seq[i])-Integer.parseInt(seq[i+1]));
                jolly[i-1] = diff;
            }
            Arrays.sort(jolly);
            for(int i=1;i<nInput;i++){
                if(jolly[i-1]!=i){
                    System.out.println("Not jolly");
                    check=false;
                    break;
                }
            }
            if(check) System.out.println("Jolly");
        }
    }
}