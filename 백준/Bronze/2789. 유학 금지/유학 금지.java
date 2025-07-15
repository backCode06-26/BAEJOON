import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static Set<Character> set = new HashSet<Character>();
    static {
        set.add('C');
        set.add('A');
        set.add('M');
        set.add('B');
        set.add('R');
        set.add('I');
        set.add('D');
        set.add('G');
        set.add('E');
    }

    static String redactedText(String text) {

        for (int i = 0; i < text.length(); i++) {
            if (!set.contains(text.charAt(i))) {
                sb.append(text.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(redactedText(sc.nextLine()));
    }
}
