import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int n = 1;
        while (true) {

            for (int i = 0; i < n; i++) {
                list.add(n);
            }
            if(list.size() > end) break;

            n++;
        }

        int answer = 0;
        for (int i = start-1; i < end; i++) {
            answer += list.get(i);
        }
        System.out.println(answer);


    }
}
