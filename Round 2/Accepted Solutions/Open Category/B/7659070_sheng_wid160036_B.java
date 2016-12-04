import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n0 = Integer.parseInt(br.readLine()); 
		for (int c = 0; c < n0; c++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
			boolean sorted = false;
			int count = 0;
			int temp;
			while (!sorted) {
				sorted = true;
				for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i]) {
                        sorted = false;
                        count++;
                        temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                    }
				}
			}
			pw.println("Optimal train swapping takes " + count + " swaps.");
		}
		pw.close();	
	}
}
