import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int L = input.nextInt();
            int[] arr = new int[L];
            for(int j=0;j<L;j++){
                arr[j] = input.nextInt();
            }
            int S = 0;
            for (int x = 0; x < arr.length; x++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                        S++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes "+S+" swaps.");
        }
    }
}
