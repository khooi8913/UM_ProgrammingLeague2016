/*
    Programming League 2016
    Closed Category Question B

    Question Title: Language Detection

    **Disclaimer**
    In the world of programming, there exists various ways to solve a problem.
    The sample solution as discussed here might just be one of the solutions and there may exist even better solutions.

    Question Analysis:
    Faily simple question. 

    >>Simplest solution:
    Write if else/ switch statements to check all the words to get the answer. Make sure that you get the output format correct.
    Many careless mistakes are made during the contest because of not taking the "UNKNOWN" seriously,
    whereby it should be formatted the same as the others as well.

    >>Slightly more advanced and efficient solution:
    Using HashMap to store all the WORDS + LANGUAGES, then for every input, it does not need to go through the conditions checking process.
    Instead, you retrieve the LANGUAGE directly by using the WORD for each input.

    Concept of a HashMap,
        Imagine Ali lives in 1, Jalan Satu, 12345 Bandar Satu.
        If we want to find Ali, where should we go and find him? 
        Ali is the LANGUAGE while his address is the WORD in this case.
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String t, word = "";
        int c = 1;
        
        do{
            word = keyboard.readLine();
            if(!word.equals("#")){
                switch(word){
                    case "HELLO":
                        t = "ENGLISH";
                        break;
                    case "HOLA":
                        t = "SPANISH";
                        break;
                    case "HALLO":
                        t = "GERMAN";
                        break;
                    case "BONJOUR":
                        t = "FRENCH";
                        break;
                    case "CIAO":
                        t = "ITALIAN";
                        break;
                    case "ZDRAVSTVUJTE":
                        t = "RUSSIAN";
                        break;
                    default:
                        t = "UNKNOWN";
                        break;
                }
                System.out.println("Case " + c + ": " + t);
                c++;
            }
        }while(!word.equals("#"));
    }
    
}

/*

MORE ADVANCED SOLUTION

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
*/