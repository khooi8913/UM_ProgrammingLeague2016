import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int t = k.nextInt();
        int max =0;
        
        for(int i=1; i<=t; i++) {
            int c = k.nextInt();
            int[] arr = new int[c];
            arr[0] = k.nextInt();
            max = arr[0];
            for(int j=1; j<c; j++) {
                arr[j] = k.nextInt();
                if(arr[j]>max) {
                    max = arr[j];
                }
            }
            System.out.println("Case " + i + ": " + max);
        }
    }
    
}