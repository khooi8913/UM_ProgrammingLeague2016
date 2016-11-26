import java.util.Scanner;



public class Main {

    
    
    public static void main(String[] args){
       
        
        Scanner input = new Scanner(System.in);
        int t;
        String s;
        t=input.nextInt();
      
        for(int i=0;i<t;i++){
            int f=0;
             s=input.next();
           if(s.length()==3){
            if(s.charAt(0)=='o'){
                f +=1;
               
                }
             if(s.charAt(1)=='n'){
                    f +=1;
                    
            }
             if(s.charAt(2)=='e'){
                 f +=1;
             }
             
            if(f>=2){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
           }
           else{
               System.out.println("3");
                }
            }
    }
} 