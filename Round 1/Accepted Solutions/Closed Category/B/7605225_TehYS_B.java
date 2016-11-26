import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
       
    
        Scanner input = new Scanner(System.in);
        String s;
        int i=1;
        int x=0;
           do{ 
             
             s = input.next();
             for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='#'){
                    x=1;
                }   
                }
                  if(s.equalsIgnoreCase("HELLO")){
                System.out.println("Case "+i+": ENGLISH");
            }
            else if(s.equalsIgnoreCase("HOLA")){
                System.out.println("Case "+i+": SPANISH");
            }
            else if(s.equalsIgnoreCase("HALLO")){
                System.out.println("Case "+i+": GERMAN");
            }
            else if(s.equalsIgnoreCase("BONJOUR")){
                System.out.println("Case "+i+": FRENCH");
            }
            else if(s.equalsIgnoreCase("CIAO")){
                System.out.println("Case "+i+": ITALIAN");
            }
            else if(s.equalsIgnoreCase("ZDRAVSTVUJTE")){
                System.out.println("Case "+i+": RUSSIAN");
            }
            else{
                if(x==0){
                System.out.println("Case "+i+": UNKNOWN");
            }
              
            }
            i++;
            
             
                 
        }while(x==0);
       
    }
}