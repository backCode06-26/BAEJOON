import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
        }

        int total = 0;
        for (int i = 0; i < m; i++) {
            if(set.contains(sc.nextLine())) {
                total++;
            } else if(total >= set.size()) {
                break;
            }
        }
        System.out.println(total);
    }
}
