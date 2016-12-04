import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int probs = scn.nextInt();
        for(int i = 0; i < probs;i++){
            int cargo = scn.nextInt();
            int pos[] = new int[cargo];
            for(int j = 0; j < cargo;j++){
                pos[j] = scn.nextInt();
            }
            solve(pos);
        }
    }

    public static void solve(int[] pos){
        int swps = 0;
        for(int i = 0; i <  pos.length - 1;i++){
            for(int j = i + 1;j < pos.length;j++){
                if(pos[i] > pos[j]){
                    int temp = pos[i];
                    pos[i] = pos[j];
                    pos[j] = temp;
                    swps++;
                }
            }
        }
        System.out.println("Optimal train swapping takes " + swps + " swaps.");
    }
}