import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 반복하는 값
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            // 중첩되는 공간, 0초기화
            long sum = 0;
            
            // 값의 개수
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int j = 0; j < arr.length; j++) {
                // 값의 개수만큼 값 입력
                arr[j] = sc.nextInt();
            }

            // GCD의 함 구하기
            for (int k = 0; k < arr.length - 1; k++) {
                for (int s = k + 1; s < arr.length; s++) {
                    sum += GCD(arr[k], arr[s]);
                }
            }

            System.out.println(sum);
        }
    }
    public static long GCD(int a,int b){
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}