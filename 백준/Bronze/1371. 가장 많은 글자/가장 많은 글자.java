import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
 
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }
 
        int total = Arrays.stream(alphabet).max().getAsInt();
 
        for (int i = 0; i < 26; i++) {
            if (total == alphabet[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}