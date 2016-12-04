import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
       int x,y=1;
       String z;
       String[]j;
       
      
        Scanner input = new Scanner (System.in);
        x=input.nextInt();
         z=input.nextLine();
        while(x>0){
         int max =0;   
            z=input.nextLine();
           j = z.split(" ");
           int []num=new int [j.length];
            for(int i=1;i<j.length;i++){
                num[i]=Integer.parseInt(j[i]);
              }
            for(int i=1;i<num.length;i++){
                if(num[i]>max){
                    max=num[i];
                }
                
            }
            System.out.println("Case "+y+": "+max);
                y++;
            x--;
        }
    }
    

}
