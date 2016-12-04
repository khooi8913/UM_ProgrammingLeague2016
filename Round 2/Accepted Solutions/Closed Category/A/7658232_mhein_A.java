
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mlhein
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String count=null;
        int inum;
        do{
            int total=0,total2=0;
            inum = in.nextInt();
            int inputed=inum;
            if(inum!=0){
                while(inputed!=0){
                total+=inputed%10;
                inputed/=10;
                }
                if(total>=10){
                    while(total!=0){
                        total2+=total%10;
                        total/=10;
                    }
                    total=total2;
                }
                total2=0;
                if(total>=0){
                    while(total!=0){
                        total2+=total%10;
                        total/=10;
                    }
                    total=total2;
                }
                System.out.println(total);
            }

        }while(inum!=0);
    }
}
