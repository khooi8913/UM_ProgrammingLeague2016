import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lim
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        int ans = 0;
        for (int i = 0; i < testcase; i++) {
            int counter1 = 0, counter2 = 0;
            String word = input.next().toLowerCase();
            char[] ch = new char[word.length()];
            for (int j = 0; j < word.length(); j++) {
                ch[j] = word.charAt(j);
            }
            if (ch.length == 3) {
                if(ch[0]=='o'){
                    counter1++;
                }
                else if(ch[0]=='t'){
                    counter2++;
                }
                if(ch[1]=='n'){
                    counter1++;
                }
                else if(ch[1]=='w'){
                    counter2++;
                }
                if(ch[2]=='e'){
                    counter1++;
                }
                else if(ch[2]=='o'){
                    counter2++;
                }
                //System.out.println(counter1);
                //System.out.println(counter2);
                //System.out.println();
                if (counter1 > counter2) {
                    ans = 1;
                } else if (counter1 < counter2) {
                    ans = 2;
                }
            } else if (ch.length == 5) {
                ans = 3;
            }

            System.out.println(ans);
        }
    }
}
