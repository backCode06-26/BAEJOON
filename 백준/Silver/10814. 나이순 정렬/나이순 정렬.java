import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        // 데이터 입력
        List<String[]> peoples = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] person = sc.nextLine().split(" ");
            peoples.add(new String[]{
                    person[0],
                    person[1],
                    String.valueOf(i)
            });
        }

        // 정렬
        peoples.sort(Comparator.comparingInt((String[] p) -> Integer.parseInt(p[0])));

        // 출력
        for (String[] person : peoples) {
            System.out.println(person[0] + " " + person[1]);
        }
    }
}