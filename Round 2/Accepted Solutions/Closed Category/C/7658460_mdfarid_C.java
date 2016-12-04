import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number, sum, diff;
        int scorea, scoreb;
        
        number = input.nextInt();
        while(number>0){
            scorea = input.nextInt();
            scoreb = input.nextInt();
            
            sum = scorea + scoreb;
            diff = scorea - scoreb;
            
            if (sum<0 || diff<0 || sum%2==1 || diff%2==1){
                System.out.println("impossible");
            }
            else
            {
                System.out.println(sum/2 + " " + diff/2);
            }
            number--;
        }
    }
}
