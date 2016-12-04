import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner k = new Scanner(System.in);
       int n = k.nextInt();
       while(n > 0){
           int sum = k.nextInt();
           int diff = k.nextInt();
           boolean flag = false;
           boolean found = false;
           for(int a = 0; a <= sum; a++){
               for(int b = 0; b <= sum; b++){
                   if(a + b == sum && a - b == diff){
                        if(b > a){
                            System.out.println(b + " " + a);
                        }
                        else{
                            System.out.println(a + " " + b);
                        }
                        found = true;
                        flag = true;
                   }
               }
           }
           if(!found){
               System.out.println("impossible");
           }
           n--;
       }
    }
}