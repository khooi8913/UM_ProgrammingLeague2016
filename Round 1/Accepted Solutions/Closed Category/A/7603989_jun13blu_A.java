import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(keyboard.readLine());
        while(n > 0){
            String word = keyboard.readLine();
            int c = 0;
            if(word.length() == 3){
                if(word.charAt(0) == 'o'){
                    c++;
                }
                if(word.charAt(1) == 'n'){
                    c++;
                }
                if(word.charAt(2) == 'e'){
                    c++;
                }
                if(c >= 2){
                    System.out.println("1");
                }
                else{
                    System.out.println("2");
                }
            }
            else{
                System.out.println("3");
            }
            n--;
        }
    }
    
}