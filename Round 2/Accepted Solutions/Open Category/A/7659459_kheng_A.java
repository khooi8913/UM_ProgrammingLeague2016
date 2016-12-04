import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line;
			ArrayList<Integer> array=new ArrayList<>();
			while((line=br.readLine())!=null&&line!="\n"){
				if(line.equals(" ")||line.equals("")||line.isEmpty())
					break;
				StringTokenizer st=new StringTokenizer(line," ");
				st.nextToken();
				for(int i=0;st.hasMoreElements();i++){
					array.add(Integer.parseInt(st.nextToken()));
				}
				ArrayList<Integer> diff=new ArrayList<>();
				boolean jolly=true;
				for(int i=0;i<array.size()-1;i++){
					diff.add(Math.abs(array.get(i+1)-array.get(i)));
				}
				Collections.sort(diff);
				for(int i=1;i<diff.size()+1;i++){
					if(diff.get(i-1)!=i){
						jolly=false;
						break;
					}
				}
				if(jolly){
					System.out.println("Jolly");
				}else{
					System.out.println("Not jolly");
				}
				array.clear();
			}
			
		}catch(IOException e){
			e.getMessage();
		}
		
	}

}
