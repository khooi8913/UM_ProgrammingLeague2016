import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner k = new Scanner(System.in);
       String n;
 
       do{
           n = k.next();
           if(!n.equals("0")){
           int a, c;
           do{
           c = 0;
            for(int i = 0; i < n.length(); i++){
                c += n.charAt(i) - '0';
            }
            n = Integer.toString(c);
            a = Integer.parseInt(n);
           }while(a > 9);
           System.out.println(c);
           }
       }while(!n.equals("0"));
    }
    
}