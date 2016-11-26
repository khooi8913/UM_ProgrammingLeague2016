/*
    Programming League 2016
    Open Category Question A
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        //BufferedReader and PrintWriter are known Fast IOs in Java
        BufferedReader systemInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        String s;
        while(!(s=systemInput.readLine()).equals("0 0 0 0")){

            int angleRotated=0;

            StringTokenizer st = new StringTokenizer(s);
            int initialPost = Integer.parseInt(st.nextToken());
            int pass1 = Integer.parseInt(st.nextToken());
            int pass2 = Integer.parseInt(st.nextToken());
            int pass3 = Integer.parseInt(st.nextToken());
            
            //turn the dial clockwise 2 full turns
            angleRotated+=720;
            
            //stop at the first number of the combination
            int angleNeeded = initialPost - pass1;
            if(angleNeeded<0)   angleNeeded+=40;
            
            angleRotated+=(angleNeeded*9);            
            
            //turn the dial counter-clockwise 1 full turn
            angleRotated+=360;
            
            //continue turning counter-clockwise until the 2nd number is reached
            angleNeeded = pass2-pass1;
            if(angleNeeded<0)   angleNeeded+=40;
            
            angleRotated+=(angleNeeded*9);            
            
            //turn the dial clockwise again until the 3rd number is reached
            angleNeeded = pass2-pass3;
            if(angleNeeded<0)   angleNeeded+=40;
            
            angleRotated+=(angleNeeded*9);
            
            pr.println(angleRotated);
            
        }
        pr.close();
    }
}
