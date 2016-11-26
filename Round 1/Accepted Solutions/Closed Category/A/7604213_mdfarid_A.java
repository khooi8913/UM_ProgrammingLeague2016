import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int number;
        
        number = input.nextInt();
        String[] word = new String[number];
        
        for(int i=0; i<word.length; i++){
            word[i] = input.next().toLowerCase();
        }
        
        for (int i=0;i<word.length;i++){
        if(word[i].length()>3){
            System.out.println("3");
        }
        else{
            if((word[i].charAt(0)=='o'&& word[i].charAt(1)=='n')||(word[i].charAt(0)=='o'&&word[i].charAt(2)=='e')||(word[i].charAt(1)=='n' && word[i].charAt(2)=='e')){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }
        }
    }
}