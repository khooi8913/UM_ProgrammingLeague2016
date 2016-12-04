import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=input.readLine())!=null&&s.length()!=0){
            boolean home = false;
            char[] chars = s.toCharArray();
            StringBuilder out = new StringBuilder();
            LinkedList<Character> text = new LinkedList<>();
            int pointer = 0;
            for(char c:chars){
                if(c=='['){
                    home = true;
                    pointer = 0;
                    continue;
                }else if(c==']'){
                    home = false;
                    continue;
                }
                if(!home){
                    text.add(c);
                }else{
                    text.add(pointer++, c);
                }
            }
            text.stream().forEach((c) -> {
                out.append(c);
            });
            System.out.println(out);
        }
    }
}