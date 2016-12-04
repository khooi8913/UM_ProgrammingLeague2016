import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        while(in.hasNextInt()){
            int num=in.nextInt();
            if(num==0)
                break;
            else{
            String a=Integer.toString(num);
            while(Integer.parseInt(a)>9){
                String[] arr=a.split("");
                int temp=0;
                for(int i=0;i<arr.length;i++){
                    temp+=Integer.parseInt(arr[i]);
                }
                a=Integer.toString(temp);
            }
                System.out.println(a);
            }
        }
    }
    
}
