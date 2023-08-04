import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer. parseInt(br.readLine());
        
        int honeycombCnt = 1;
        int cnt = 1;
        while (n > honeycombCnt) {
			honeycombCnt += 6 * cnt;
			cnt++;
		}
        System.out.println(cnt);
         
        br.close();
    }
}

