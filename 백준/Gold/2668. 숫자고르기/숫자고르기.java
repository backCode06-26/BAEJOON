import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean[] visited;
    static int[] nums;
    static ArrayList<Integer> result;

    public static void dfs(int start, int target) {
        // 방문하지 않는 숫자 중에
        if(!visited[nums[start]]) {
            visited[nums[start]] = true;
            dfs(nums[start], target);
            visited[nums[start]] = false;
        }
        // target과 같은지 확인하기 위해서 검증
        if(nums[start] == target) result.add(target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // 숫자 받기
        nums = new int[n+1];
        visited = new boolean[n+1];
        for (int i=1; i<=n; i++) {
            nums[i] = sc.nextInt();
        }

        // dfs 돌리기
        result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            // true, false를 주는 이유는 한 검산을 한다음에 다른 검산에 영향을 주지 않기 위함과
            // 방문했던 값을 다시 만나는 경우에는 사이클이 멈추는 것으로
            // 값이 같다면 조건 부합, 아니라면 조건이 부합하지 않음을 의미함
            visited[i] = true;
            // target를 주는 이유는 검증해야하는 값을 기억하기 위해서임
            dfs(i, i);
            visited[i] = false;
        }

        // 값 출력
        System.out.println(result.size());
        for (int num : result) {
            System.out.println(num);
        }


    }
}
