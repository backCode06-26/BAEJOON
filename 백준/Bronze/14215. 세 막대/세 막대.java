import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = {A,B,C};
        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]){
            System.out.println(A+B+C);
        }else {
            System.out.println((arr[0]+arr[1]) * 2 - 1);
        }

    }
}