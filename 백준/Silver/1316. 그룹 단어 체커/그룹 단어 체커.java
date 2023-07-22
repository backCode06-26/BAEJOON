import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            boolean isGroupWord = true;
            boolean[] abc = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int letter = ch - 'a';

                if (j > 0 && ch != str.charAt(j - 1) && abc[letter]) {
                    isGroupWord = false;
                    break;
                }
                abc[letter] = true;
            }

            if (isGroupWord) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}