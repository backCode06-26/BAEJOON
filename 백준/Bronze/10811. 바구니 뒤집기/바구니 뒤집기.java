import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니의 개수
        int M = sc.nextInt(); // 순서를 역순으로 만들 횟수
        int cnt = 0;
        
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1; // 바구니에 순서대로 번호 부여
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt(); // 역순으로 만들 범위의 시작 인덱스
            int end = sc.nextInt(); // 역순으로 만들 범위의 끝 인덱스

            // 범위 내의 바구니 순서를 역순으로 변경
            for (int j = start - 1, k = end - 1; j < k; j++, k--) {
                int temp = baskets[j];
                baskets[j] = baskets[k];
                baskets[k] = temp;
            }
            
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
        
    }
}
