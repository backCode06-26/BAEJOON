import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split(" ");
        int defense = Integer.parseInt(nums[0]);
        int defensivePecent = Integer.parseInt(nums[1]);
        
        double value = defense -(defense * (defensivePecent / 100.0));
        
        int result = (value >= 100) ? 0 : 1;
        System.out.println(result);

    }
}
