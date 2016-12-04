

import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int s,d,c,ans1,ans2;
       
        
        c=input.nextInt();
        
        for(int i=0; i<c; i++){
           s= input.nextInt();
           d=input.nextInt();
         
           if(s<d){
               System.out.println("impossible");
           } 
           
           else{
            
                ans1=(s+d)/2;
                ans2=s-ans1;
                if((ans1-ans2)!=d){
                    System.out.println("impossible");
                }
                else{
                    System.out.println(ans1+" "+ans2);
                }
           
           }
            
            
        }
        
    }
}