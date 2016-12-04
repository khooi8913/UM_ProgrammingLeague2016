import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner k = new Scanner(System.in);
       int n = k.nextInt();
       int c = 1;
       while(n > 0){
           int x = k.nextInt();
           int max = 0;
           for(int i = 0; i < x; i++){
               int s = k.nextInt();
               if(s > max){
                   max = s;
               }
           }
           System.out.println("Case " + c + ": " + max);
           c++;
           n--;
       }
    }
}