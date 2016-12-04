import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = (a+b)/2;
            int diff = (a-b)/2;
            if(sum<0||diff<0||(a+b)%2!=0||(a-b)%2!=0){
                System.out.println("impossible");
            }else{
                System.out.println(sum+" "+diff);
            }
        }
    }
}