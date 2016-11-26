import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lang;
        int counter =1;
        lang=input.nextLine().toUpperCase();
        while(!(lang.equals("#"))){
            switch(lang){
                case "HELLO" : 
                    System.out.println("Case "+counter+": ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("Case "+counter+": SPANISH");
                    break;
                case "HALLO":
                    System.out.println("Case "+counter+": GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("Case "+counter+": FRENCH");
                    break;
                case "CIAO":
                    System.out.println("Case "+counter+": ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case "+counter+": RUSSIAN");
                    break;
                default:
                    System.out.println("Case "+counter+": UNKNOWN");
                    break;
            }
            counter++;
            lang=input.nextLine();
        }
    }
}