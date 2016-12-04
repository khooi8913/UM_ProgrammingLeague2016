import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input;
        while (sc.hasNext()) {
            input = sc.nextInt();
        if (input == 0)
            break;
        input = f(Integer.toString(input), Integer.toString(input).length());
        while (input >= 10)
        {
            input = f(Integer.toString(input), Integer.toString(input).length());
        }
      System.out.println(input);
    }
  }
  static int f(String input, int n) {
    int single_digit_number = 0;
    for (int i = 0; i < n; i++) {
      single_digit_number += Integer.parseInt(input.substring(i, i + 1));
    }
    return single_digit_number;
  }
}