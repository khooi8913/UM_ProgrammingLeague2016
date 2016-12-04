import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int a, num, b, c;
        a = k.nextInt();
        
        while (a != 0) {
            num = a;
            int sum = 0;

            while(num>0) {                   
                        sum += num % 10;
                        num = num / 10;  
                        while (sum>9) {
                            b = sum % 10;
                            c = sum / 10;
                            sum = b+c;
                        }                  
            }
            System.out.println(sum);
            a = k.nextInt();
        }
    }
    
}
