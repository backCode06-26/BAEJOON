import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int right = sc.nextInt();
        int left = sc.nextInt();
        int playerCnt = sc.nextInt();

        // 전체 합을 구합니다.
        int sum = right + left + playerCnt;

        // 왼쪽 오른쪽 선수의 차와 남은 선수의 차로 어느쪽에 값을 줘야하는지 구합니다.
        int diff = playerCnt - Math.abs(left - right);


        // 양수에는 모든 선수를 매꾼 다음의 선수이기 때문에 딱떨어지지 않는 선수는 제거합니다.
        // 음수에서는 전체에서는 차이를 뺍니다.
        int result = (diff >= 0 ? sum - (diff % 2) : sum - (Math.abs(diff)));
        System.out.println(result);



    }
}
