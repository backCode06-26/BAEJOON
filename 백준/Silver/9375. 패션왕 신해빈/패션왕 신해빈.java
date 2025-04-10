import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수를 받는다.
        int n = sc.nextInt();

        while (n-- > 0) {

            // 옷의 개수를 받는다.
            int m = sc.nextInt();

            // 옷의 종류와 옷의 개수를 담을 Hash를 만든다.
            HashMap<String, Integer> map = new HashMap<>();
            while(m-- > 0) {
                // 옷의 이름은 필요없다.
                sc.next();

                // 옷의 종류를 받는다.
                String clothes = sc.next();

                // 존재한다면 기존의 값을 더하고 없다면 새로운 값을 만든다.
                if(map.containsKey(clothes)) {
                    map.put(clothes, map.get(clothes) + 1);
                } else {
                    map.put(clothes, 1);
                }
            }

            // 옷의 조합을 받는다.
            int result = 1;

            // 옷의 종류한 하나만 선택해서 n+1C1이다. 입지을 수 있기 때문에 +1한다.
            for (String key : map.keySet()) {
                result *= map.get(key)+1;
            }

            // -1를 하는이유는 아무것도 입지못하는 경우를 제외하기 위함이다.
            System.out.println(result-1);
        }
    }
}