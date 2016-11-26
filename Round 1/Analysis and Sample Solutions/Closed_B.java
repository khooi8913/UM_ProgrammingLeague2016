/*
    Programming League 2016
    Closed Category Question B
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        HashMap<String, String> a = new HashMap<String, String>();
        a.put("HELLO", "ENGLISH");
        a.put("HOLA", "SPANISH");
        a.put("HALLO", "GERMAN");
        a.put("BONJOUR", "FRENCH");
        a.put("CIAO", "ITALIAN");
        a.put("ZDRAVSTVUJTE", "RUSSIAN");
        
        //BufferedReader and PrintWriter are known Fast IOs in Java
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        String s;
        int i=1;

        while(!(s=br.readLine()).equals("#")){
            if(a.containsKey(s)){
                pr.println("Case "+i+": "+a.get(s));
            }
            else{
                pr.println("Case "+i+": UNKNOWN");
            }
            i++;
        }
        pr.close();
    }
    
}
