import java.util.*;
public class Main {
public static void main(String[] args){
Scanner k = new Scanner (System.in);
int i,max;
int array[]=new int [50];
String b;
String split[];
i = k.nextInt();
if (i<=50){
for (int p = 1;p<=i;p++){
    if (p==1){
        k.nextLine();
    }
    b = k.nextLine();
    split = b.split(" ");
    max = Integer.parseInt(split[1]);
    for (int q = 1;q<split.length;q++){
       if (Integer.parseInt(split[q])>max){
           max = Integer.parseInt(split[q]); 
       }array[p] = max;
       if (max<1||max>10000){
           break;
       }
    }
}
for (int m = 1;m<=i;m++){
System.out.println("Case "+m+": "+array[m]);

}    
}    
}
}