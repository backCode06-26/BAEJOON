import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] nums = br.readLine().split(" "); 
    	
    	int S = Integer.parseInt(nums[0]);
    	int K = Integer.parseInt(nums[1]);
    	int H = Integer.parseInt(nums[2]);
    	
    	int sum = S + K + H;
    	int min = Math.min(S, Math.min(K, H));
    	
    	if(sum >= 100) {
    		System.out.println("OK");
    	} else if(min == S) {
    		System.out.println("Soongsil");
    	} else if(min == K) {
    		System.out.println("Korea");
    	} else if(min == H) {
    		System.out.println("Hanyang");
    	}
    	
    }
}
