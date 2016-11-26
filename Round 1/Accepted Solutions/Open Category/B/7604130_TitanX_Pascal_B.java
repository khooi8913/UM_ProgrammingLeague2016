import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int [] data=new int [Integer.parseInt(s)];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int i=0;i<data.length;i++) {
				data[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(data);
			
			StringBuilder sb=new StringBuilder();
			for (int i=0;i<data.length;i++) {
				sb.append(data[i]);
				if (i<data.length-1) sb.append(' ');
			}
			System.out.println(sb.toString());
		}
	}
}