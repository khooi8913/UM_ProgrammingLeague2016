import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashMap<String,String> map=new HashMap<>();
		map.put("HELLO", "ENGLISH");
		map.put("HOLA", "SPANISH");
		map.put("HALLO", "GERMAN");
		map.put("BONJOUR", "FRENCH");
		map.put("CIAO", "ITALIAN");
		map.put("ZDRAVSTVUJTE", "RUSSIAN");
		
		String s;
		for (int testCase=1;!(s=br.readLine()).equals("#");testCase++)
			if (map.containsKey(s)) System.out.println("Case "+testCase+": "+map.get(s));
			else System.out.println("Case "+testCase+": UNKNOWN");
	}
}