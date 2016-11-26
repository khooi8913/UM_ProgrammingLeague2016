import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static int matchCount (String s1, String s2) {
		int count=0;
		for (int i=0;i<Math.min(s1.length(),s2.length());i++) {
			if (s1.charAt(i)==s2.charAt(i)) count++;
		}
		return count;
	}
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		String [] matches={"one","two","three"};
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			String input=br.readLine();
			int ans=0;
			for (int i=0;i<matches.length;i++) {
				if (matchCount(input,matches[i])>=matches[i].length()-1) {
					ans=i+1;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}