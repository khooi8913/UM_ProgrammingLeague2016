import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c,d;
        do{
            a = scn.nextInt();
            while(a > 39 || a < 0){
                a = scn.nextInt();
            }
            b = scn.nextInt();
            while(b > 39 || b < 0){
                b = scn.nextInt();
            }
            c = scn.nextInt();
            while(c > 39 || c < 0){
                c = scn.nextInt();
            }
            d = scn.nextInt();
            while(d > 39 || d < 0){
                d = scn.nextInt();
            }
            if(a ==0 && b == 0 && c ==0 && d ==0)
                break;
            answer(a, b, c, d);
        }while( a != 0 || b != 0 || c != 0 || d != 0);
    }

    public static void answer(int a,int b,int c,int d){
        int answer = 720 + 360;
        if(b > a)
            answer+=Math.abs((b - a - 40) * 9);
        else
            answer+=Math.abs((a - b) * 9);
        if(b > c)
            answer+=Math.abs((c - b + 40) * 9);
        else
            answer+=Math.abs((b - c) * 9);
        if(d > c)
            answer+=Math.abs((d - c - 40) * 9);
        else
            answer+=Math.abs((c - d) * 9);
        System.out.println(answer);
    }
}