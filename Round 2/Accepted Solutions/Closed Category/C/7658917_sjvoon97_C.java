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
        int numCase=in.nextInt();
        for(int i=0;i<numCase;i++){
            int num1=in.nextInt();
            int num2=in.nextInt();
            for(int j=0;j<=num1;j++){
                int num3=j;
                int num4=num1-j;
                int dif=num4-num3;
                if(dif==num2){
                    System.out.println(num4+" "+num3);
                    break;
                }
                if(j==(num1))
                    System.out.println("impossible");
            }
        }
    }
    
}