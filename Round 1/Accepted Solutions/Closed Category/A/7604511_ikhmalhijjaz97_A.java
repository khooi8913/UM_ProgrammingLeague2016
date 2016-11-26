import java.util.*;

public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jaz = new Scanner(System.in);
        int max=10;
        int x=jaz.nextInt(max);
        String[] j=new String[x]; 
        for(int i=0;i<x;i++){
            j[i]=jaz.next(); 
           
        }
        for(int hi=0;hi<j.length;hi++){
        if(j[hi].length()==3){
             for(int m=0;m<1;m++){
                 char c=j[hi].charAt(m);
                 char d=j[hi].charAt(m+1);
                 char q=j[hi].charAt( m+2);
              if(c=='o'){
                  System.out.println("1");}
              else if(c=='t'){
                      System.out.println("2");
                  }
               else if(d=='n'){
                      System.out.println("1");
                  }
               else if(d=='w'){
                      System.out.println("2");
                  }
              else if(q=='o'){
                      System.out.println("2");
                  }
              else {
                  System.out.println("1");
              }
              
          }}
          else System.out.println("3");   
    }
    }
}
