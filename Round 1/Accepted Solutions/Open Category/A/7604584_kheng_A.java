import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		while(true){
			
			int degree=720;
			int d0,d1,d2,d3;
			d0=kb.nextInt();
			d1=kb.nextInt();
			d2=kb.nextInt();
			d3=kb.nextInt();
			if(d1==0 && d1==0 && d2==0 && d3==0){
				break;
			}
			if(d0>d1){
				degree+=((d0-d1)*9);
			}else if(d0<d1){
				degree+=((d0-d1+40)*9);
			}
			degree+=360;
			
			if(d2>d1){
				degree+=((d2-d1)*9);
			}else if(d2<d1){
				degree+=((d2-d1+40)*9);
			}
			
			if(d2>d3){
				degree+=((d2-d3)*9);
			}else if(d2<d3){
				degree+=((d2-d3+40)*9);
			}
			
			System.out.println(degree);
			
		}
	}

}
