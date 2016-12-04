import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
  
     int input,bil,bilt,humil,humilt,temil,temilt,mil,milt,huthou,huthout,tethou,tethout ;
     int thou,thout,hun,hunt,ten,tent,one,sum;
  
        Scanner k = new Scanner(System.in);
  
       do{
          do{
      input = k.nextInt();
     
          }while(input> 2000000000);
          if(input==0){
              break;
          }
   
     bil = input/1000000000;      
     bilt = input-(bil*1000000000); 
    humil = bilt/100000000;      
     humilt= bilt-(humil*100000000);
      temil = humilt/10000000;      
     temilt = humilt-(temil*10000000);
     mil = temilt/1000000;      
     milt = temilt-(mil*1000000);
     huthou = milt/100000;      
     huthout = milt-(huthou*100000);
     tethou = huthout/10000;      
     tethout = huthout-(tethou*10000);     
     thou = tethout/1000;      
     thout = tethout-(thou*1000);
     hun = thout/100;
     hunt = thout-(hun*100);
     ten = hunt/10;
     tent = hunt - (ten*10);
     one = tent;
    do{      
   sum = bil + humil + temil + mil + huthou + tethou + thou + hun + ten + one;
   bil = sum/1000000000;      
     bilt = sum-(bil*1000000000); 
   humil = bilt/100000000;      
     humilt= bilt-(humil*100000000);
      temil = humilt/10000000;      
     temilt = humilt-(temil*10000000);
     mil = temilt/1000000;      
     milt = temilt-(mil*1000000);
     huthou = milt/100000;      
     huthout = milt-(huthou*100000);
     tethou = huthout/10000;      
     tethout = huthout-(tethou*10000);     
     thou = tethout/1000;      
     thout = tethout-(thou*1000);
     hun = thout/100;
     hunt = thout-(hun*100);
     ten = hunt/10;
     tent = hunt - (ten*10);
     one = tent;
    }while ((sum/10) != 0);
           System.out.println(sum);
        }while(input!=0);
        
    
    //I write way too long . haha . otak blur
    }
    }