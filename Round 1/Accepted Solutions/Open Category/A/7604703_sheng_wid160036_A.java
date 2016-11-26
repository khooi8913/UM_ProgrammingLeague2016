import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		while (true) {
			String n = br.readLine();
			if (n.equals("0 0 0 0")) break;
			String[] numbers = n.split(" ");
			int[] num = new int[numbers.length];
			for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(numbers[i]);
			int ans = 0;
			ans += num[0] - num[1];
			if (num[1] > num[0]) ans += 40;
			ans += num[2] - num[1];
			if (num[2] < num[1]) ans += 40;
			ans += num[2] - num[3];
			if (num[3] > num[2]) ans += 40;
			ans += 120;
			ans *= 9;
			pw.println(ans);
		}
		pw.close();
	}
}