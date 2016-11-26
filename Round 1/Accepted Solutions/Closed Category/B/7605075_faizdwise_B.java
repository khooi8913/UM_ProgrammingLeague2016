import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
  
        String input;
        int i=1,check=1,length;
        
        Scanner k = new Scanner(System.in);
  
       do{
          do{
        input = k.nextLine();
        length = input.length();
          }while(length>14);
          
          if(input.equals("#")){
            check=0;
            break;
           
        }
            
        System.out.print("Case "+i+": ");
        if(input.equals("HELLO"))
               System.out.println("ENGLISH");
       else if(input.equals("HOLA"))
               System.out.println("SPANISH");
        else if(input.equals("HALLO"))
               System.out.println("GERMAN");
        else if(input.equals("BONJOUR"))
               System.out.println("FRENCH");
        else if(input.equals("CIAO"))
               System.out.println("ITALIAN");
        else if(input.equals("ZDRAVSTVUJTE"))
               System.out.println("RUSSIAN");
        else
               System.out.println("UNKNOWN");
          i++;
        }while(check!=0 && i<=2000);
        
    

    }
    }
    

