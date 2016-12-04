import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        int numCase=in.nextInt();
        int num;
        int[] arr;
        for(int i=0;i<numCase;i++){
            num=in.nextInt();
            arr=new int[num];
            for(int j=0;j<num;j++){
                arr[j]=in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Case "+(i+1)+": "+arr[num-1]);
        }
    }
    
}