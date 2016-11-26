import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0 0 0 0")) {
			StringTokenizer st=new StringTokenizer(s);
			int [] data=new int [4];
			for (int i=0;i<data.length;i++) data[i]=Integer.parseInt(st.nextToken());
			//2 full turns.
			int count=720;
			//stop at first number
			if (data[1]>data[0]) count+=(data[0]+40-data[1])*9;
			else count+=(data[0]-data[1])*9;
			//turn 1 more time.
			count+=360;
			//counter clockwise
			if (data[1]>data[2]) count+=(data[2]+40-data[1])*9;
			else count+=(data[2]-data[1])*9;
			//clockwise
			if (data[3]>data[2]) count+=(data[2]+40-data[3])*9;
			else count+=(data[2]-data[3])*9;
			
			System.out.println(count);
		}
	}
}