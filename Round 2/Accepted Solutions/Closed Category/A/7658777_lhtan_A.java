import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
       int x;
      Scanner input = new Scanner (System.in);
      x=input.nextInt();
      while(x!=0){
          int y,z=0;
          while(x>0){
              y=x%10;
              z=z+y;
              x=x/10;
              if(x==0 &&z>=10){
                  x=z;
                  z=0;
              }
          }
          
          if(z<10){
              System.out.println(z);
          }
          x=input.nextInt();
      }
    }

}
