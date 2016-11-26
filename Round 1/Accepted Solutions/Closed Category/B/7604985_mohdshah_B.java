/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Shah
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input;
        boolean flag=true;
        int cases=1;
        String a[]=new String[6];
        a[0]="HELLO";
        a[1]="HOLA";
        a[2]="HALLO";
        a[3]="BONJOUR";
        a[4]="CIAO";
        a[5]="ZDRAVSTVUJTE";
        
        String b[]=new String[6];
        b[0]="ENGLISH";
        b[1]="SPANISH";
        b[2]="GERMAN";
        b[3]="FRENCH";
        b[4]="ITALIAN";
        b[5]="RUSSIAN";
        
        while(flag==true){
        input=br.readLine();
            int flag2=0;
            for(int i=0;i<6;i++){
                if(input.equals(a[i])){System.out.println("Case "+cases+": "+b[i]);}
                else if(input.equals("#")){flag=false;}
                else{flag2++;}
            }
            if(flag2==6)System.out.println("Case "+cases+": "+"UNKNOWN");
            cases++;
        }
        
    }
}
