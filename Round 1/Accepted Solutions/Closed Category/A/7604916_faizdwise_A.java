import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
  
        int input,count=0,length,i;
        String word;
        char letter[] = new char[5];
        
        Scanner k = new Scanner(System.in);
  
        do{
        input = k.nextInt();
        }while(input>10);
        
       while(count<=input){ 
        word = k.nextLine();   
        length = word.length();
          
         if(length==3){
             for(i=0;i<length-1;i++){
            letter[i]=word.charAt(i);
        }
           
             if(letter[0]=='o'|| letter[1]=='n' )
                 System.out.println("1");
             else if(letter[0]=='t' || letter[1]=='w')
                 System.out.println("2");
         }
         else if(length==5) {
             System.out.println("3");
         }
         
      count++;
    }
    }
    
}