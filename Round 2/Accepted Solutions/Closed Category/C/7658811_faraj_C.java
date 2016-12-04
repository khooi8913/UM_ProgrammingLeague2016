import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int tt = scaner.nextInt();
        while(tt-->0){
            int a = scaner.nextInt();
            int b = scaner.nextInt();
            int x=(a+b)/2;
            int y=(a-b)/2;
            if(x<0||y<0||(a+b)%2!=0||(a-b)%2!=0){
                System.out.println("impossible");
            }else{
                System.out.println(x+" "+y);
            }
        }
    }
}
