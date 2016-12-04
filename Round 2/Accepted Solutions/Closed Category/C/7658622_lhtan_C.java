import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s,d,num,x,y;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        while(num>0){
            s=input.nextInt();
            d=input.nextInt();
            if(s<d){
                System.out.println("impossible");
            }
            else{
                x=(s+d)/2;
                y=s-x;
                if(x-y!=d){
                    System.out.println("impossible");
                }
                else{
                    System.out.println(x+" "+y);
                }
            }
            num--;
        }
    }

}
