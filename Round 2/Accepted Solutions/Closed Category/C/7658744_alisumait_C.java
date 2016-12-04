import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while(c-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
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
