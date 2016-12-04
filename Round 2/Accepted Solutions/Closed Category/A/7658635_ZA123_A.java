import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num,add;
    int flag = 0;
    
    
    do{
       int ans=0;

        num = input.nextInt();
      
        if(num == 0){
                flag =1;
            }
            else{
                do{
                    if(ans >= 10){
                        num = ans;
                        ans = 0;
                    }
                    while(num > 0){
                        add = num % 10;
                        ans += add;
                        num = num / 10; 
                    }
                }while(ans >= 10);
            }
     
        if(flag ==0){
            System.out.println(ans);
        }
        
        
    }while(flag == 0);
       
    }
}