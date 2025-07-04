import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int answer = 0;

        Set<String> names = null;
        for (int i=0; i<n; i++) {
            String name = sc.nextLine();

            if (name.equals("ENTER")) {

                if(names != null) {
                    answer += names.size();
                }

                names = new HashSet<>();
                continue;
            }


            if (names != null) {
                names.add(name);
            }
        }

        if (names != null) {
            answer += names.size();
        }

        System.out.println(answer);
    }
}