import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    
    	for(int i=0; i<n; i++) {
    		String[] strs = br.readLine().split(" ");
    		int X = Integer.parseInt(strs[0]);
    		int Y = Integer.parseInt(strs[1]);
    	
    		if(Y <= X) {
    			bw.write("MMM BRAINS\n");
    		} else {
    			bw.write("NO BRAINS\n");
    		}
    	}
    	bw.flush();
    	bw.close();
    	br.close();
    }
}

