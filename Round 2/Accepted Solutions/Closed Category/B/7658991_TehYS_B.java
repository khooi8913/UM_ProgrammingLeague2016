import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        for (int i = 1; i <= testcase; i++) 
        {
            int max=0;
            int students = input.nextInt();
            for (int j = 1; j <= students; j++)
            {
                int speed = input.nextInt();
                max = Math.max(max, speed);
            }
            System.out.print("Case " + i + ":");
            System.out.print(" " + max);
            System.out.println("");
        }
            
    }
        

    }