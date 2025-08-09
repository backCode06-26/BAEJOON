import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String answer = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true) {
            String[] words = sc.nextLine().split("");

            if (words[0].equals("*")) break;

            String[] filterArray =
                    Arrays.stream(words)
                            .filter(word -> !word.equals(" "))
                            .distinct()
                            .toArray(String[]::new);

            Arrays.sort(filterArray);
            String result = String.join("", filterArray);

            sb.append(result.equals(answer) ? "Y" : "N").append("\n");

        }

        System.out.println(sb);
    }
}
