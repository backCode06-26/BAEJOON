import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                list.add(i);
            }
        }
        Collections.sort(list);

        int start = 0, end = 0, count = 0, sum = 0;
        while (end <= list.size()) {
            if(sum < n) {
                // 마지막으로 나오는 값은 list.size()라서 그거를 막기 위해서 사용
                if(end == list.size()) break;
                sum += list.get(end++);
            } else {
                // 값이 맞는 경우에 올림
                if(sum == n) count++;
                // 다른 값이 있는 경우를 위해 아래의 값을 지운다.
                sum -= list.get(start++);
            }
        }
        System.out.println(count);
    }
}
