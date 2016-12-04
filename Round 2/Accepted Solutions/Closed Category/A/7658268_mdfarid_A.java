import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        
        number = input.nextInt();
        
        while(number!=0){
            int temp = number;
            while((temp/10)>0){
                int sum = 0;
                while(number>0){
                    sum += number%10;
                    number/=10;
                }
                temp = sum;
                number = temp;
            }
            System.out.println(temp);
            number = input.nextInt();
        }
    }
}
