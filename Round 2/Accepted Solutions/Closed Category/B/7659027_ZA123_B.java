import java.util.Scanner;

public class Main {

    
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int line, ans,c;
      
      line=input.nextInt();
      
      for(int i=1;i<=line;i++){
          int max = 0;
          c=input.nextInt();
          int[] arr = new int[c];
          
          for(int j=0;j<c;j++){
              arr[j]=input.nextInt();
              if(arr[j]>max){
                  max=arr[j];
              }
          }
          System.out.println("Case "+i+": "+max);
      }
        
    }
}