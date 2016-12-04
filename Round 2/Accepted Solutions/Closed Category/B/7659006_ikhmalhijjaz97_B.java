import java.util.*;


public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jaz = new Scanner(System.in);
        int x,y,m;
        int[] hij=new int[100];
        int[]  sum=new int[100];
        x=jaz.nextInt();
        for( m=0;m<x;m++){
             y=jaz.nextInt();
             hij[0]=jaz.nextInt();
            for(int h=1;h<y;h++){
                hij[h]=jaz.nextInt();
                if(hij[0]<hij[h]){
                    hij[0]=hij[h];
                }
            }
            sum[m]=hij[0];
        }
        
        for(int k=0;k<x;k++){
            System.out.println("Case "+(k+1)+": "+sum[k]);
        }
    }
    
}
