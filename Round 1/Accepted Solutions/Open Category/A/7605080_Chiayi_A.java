import java.util.Scanner;

public class Main {
/**

 * @param args

 */

 public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

      while (true) {

    int begin = in.nextInt();

    int one = in.nextInt();

    int two = in.nextInt();

    int three = in.nextInt();

    if ((begin | one | two | three) == 0)

    break;

    int result = 1080;

    result += begin < one ? (begin + 40 - one) * 9 : (begin - one) * 9;

    result += one < two ? (two - one) * 9 : (40 + two - one) * 9;

    result += two < three ? (two + 40 - three) * 9 : (two - three) * 9;

    System.out.println(result);

    }

  }

 

}
