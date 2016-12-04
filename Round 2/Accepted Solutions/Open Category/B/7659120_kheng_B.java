import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			PrintWriter p=new PrintWriter(System.out);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int numOfCase=Integer.parseInt(br.readLine());
			String line;
			for(int i=0;i<numOfCase;i++){
				int size=Integer.parseInt(br.readLine());
				line=br.readLine();
				String [] temp=line.split(" ");
				int [] array=new int[size];
				for(int j=0;j<size;j++){
					array[j]=Integer.parseInt(temp[j]);
				}
				System.out.println("Optimal train swapping takes "+bubbleSort(array)+" swaps.");
			}
				
		}catch(IOException e){
			e.getMessage();
		}
	}
	
	private static int bubbleSort(int[] intArray) {
		int count=0;
        int n = intArray.length;
        int temp = 0;
       
        for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                       
                        if(intArray[j-1] > intArray[j]){
                                //swap the elements!
                                temp = intArray[j-1];
                                intArray[j-1] = intArray[j];
                                intArray[j] = temp;
                                count++;
                        }
                       
                }
        }
        return count;

	}
}
