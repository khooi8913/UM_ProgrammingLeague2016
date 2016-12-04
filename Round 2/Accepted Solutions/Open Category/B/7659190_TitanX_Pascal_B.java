
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(System.in);
        int nCase = read.nextInt();
        for(int c=0;c<nCase;c++)
        {
            int n = read.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = read.nextInt();
            }
            System.out.println("Optimal train swapping takes "+bubbleSort(arr)+" swaps.");
        }
    }
    
    public static int bubbleSort(int[] arr)
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count += 1;
                }
            }
        }
        return count;
    }
}
