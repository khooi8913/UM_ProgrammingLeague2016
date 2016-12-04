import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count, number, speed;
        int i = 0;
        int max = 0;
        
        count = input.nextInt();
        
        if(count<=50){
            while(count>0){
                number = input.nextInt();
                max = 0;
                while(number>0){
                    speed = input.nextInt();
                    if(speed>max)
                        max = speed;
                    number--;
                }
                i++;
                count--;
                System.out.println("Case " + i + ": " + max);
            }
        }
    }
}
