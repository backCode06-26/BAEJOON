import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] nums = new int[26];
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
                nums[ch-'a']++;
        }

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}