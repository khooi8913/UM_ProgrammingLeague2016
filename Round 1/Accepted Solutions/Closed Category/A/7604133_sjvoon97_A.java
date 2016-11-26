import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Voon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int[] value;
        String words;
        try{
            BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
            num=Integer.parseInt(in.readLine());
            value=new int[num];
            for(int i=0;i<num;i++){
                words=in.readLine();
                if(words.length()==3){
                    if(words.contains("on")||words.contains("ne"))
                        value[i]=1;
                    else if(words.charAt(0)=='o'&&words.charAt(2)=='e')
                        value[i]=1;
                    else
                        value[i]=2;
                }
                else
                    value[i]=3;
            }
            for(int i=0;i<num;i++)
                System.out.println(value[i]);
        }
        catch(IOException e){}
    }
    
}