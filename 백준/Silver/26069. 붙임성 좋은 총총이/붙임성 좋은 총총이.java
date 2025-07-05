import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<String> danceHuman = new HashSet<>();
        danceHuman.add("ChongChong");

        for (int i = 0; i < n; i++) {

            String[] names = sc.nextLine().split(" ");
            String name1 = names[0];
            String name2 = names[1];

            if (danceHuman.contains(name1) || danceHuman.contains(name2)) {

                danceHuman.add(name1);
                danceHuman.add(name2);
            }
        }
        System.out.println(danceHuman.size());
    }
}