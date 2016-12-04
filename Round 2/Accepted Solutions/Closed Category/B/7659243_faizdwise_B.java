import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
  
     int check,count=0,ans,count2;
     int lim,num;
    
  
        Scanner k = new Scanner(System.in);
     
   do{
      check = k.nextInt();
     
          }while(check> 50);
       do{
         
     ans=0;
     lim = k.nextInt();
     
     for(count2=0;count2<lim;count2++){
        num=k.nextInt();
        if(num>ans)
         ans=num;
        
     }
  


     
           System.out.println("Case "+(count+1)+": "+ans);
     
     
          
  count++;
        }while(count<check);
        
    
    //gg
    }
    }