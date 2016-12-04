
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        String s;

        PrintWriter pw = new PrintWriter(System.out);
        while ((s = f.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            LinkedList<StringBuilder> l = new LinkedList<>();
            boolean previousHome = false;
            for(int i=0;i<s.length();i++)
            {
                if((s.charAt(i)+"").equals("["))
                {
                    if(previousHome)
                        l.addFirst(sb);
                    else
                        l.add(sb);
                    sb = new StringBuilder();
                    previousHome = true;
                    
                }
                else if((s.charAt(i)+"").equals("]"))
                {
                    if(previousHome)
                        l.addFirst(sb);
                    else
                        l.add(sb);
                    sb = new StringBuilder();
                    previousHome = false;
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
            if(previousHome)
                l.addFirst(sb);
            else
                l.add(sb);
            displayAnswer(l, pw);
        }
        pw.close();
    }

    public static void displayAnswer(List<StringBuilder> l, PrintWriter pw) {
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: l)
            res.append(sb);
        pw.println(res);
        pw.flush();
    }

}
