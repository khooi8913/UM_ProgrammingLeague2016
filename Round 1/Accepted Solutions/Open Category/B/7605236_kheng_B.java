import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try{
			PrintWriter p=new PrintWriter(System.out);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int numOfCase;
			String line;
			ArrayList<Integer> array=new ArrayList<>();
			while(!(line=br.readLine()).equals("0")){
				numOfCase=Integer.parseInt(line);
				StringTokenizer st= new StringTokenizer(br.readLine());
				
				for(int i=0;i<numOfCase;i++){
					array.add(Integer.parseInt(st.nextToken()));
				}
				Collections.sort(array);
				for(int i=0;i<array.size();i++){
					p.print(array.get(i));
					if(i!=array.size()-1){
						p.print(" ");
					}
				}
				p.println();
				array.clear();
			}
			p.close();
		}catch(IOException e){
			e.getMessage();
		}
	}
		

}
