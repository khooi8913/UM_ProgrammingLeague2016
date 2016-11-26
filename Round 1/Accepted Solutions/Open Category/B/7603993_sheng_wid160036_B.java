import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			String[] numbers = br.readLine().split(" ");
			int[] num = new int[n];
			for (int i = 0; i < n; i++) num[i] = Integer.parseInt(numbers[i]);
			Arrays.sort(num);
			pw.print(num[0]);
			for (int i = 1; i < n; i++) {
				pw.print(" " + num[i]);
			}
			pw.println();
		}
		pw.close();
	}
}