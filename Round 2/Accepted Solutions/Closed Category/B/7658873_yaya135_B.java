import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int T = input.nextInt();
	for (int i = 1; i <= T; i++) {
		int max = 0;
		int N = input.nextInt();
		int speeds[] = new int[N];
		for (int j = 0; j < N; j++) {
		speeds[j] = input.nextInt();
		if (speeds[j] > max)
		max = speeds[j];
		}
		System.out.println("Case " + i + ": " + max);
        }
    }
}
    