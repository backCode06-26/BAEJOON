import java.util.*;

public class Main {
    static int range = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        for (int i=0; i<range; i++) {
            int num = sc.nextInt();

            if(num % 2 != 0) {
                nums.add(num);
            }
        }

        Collections.sort(nums);

        if(!nums.isEmpty()) {
            int sum = nums.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);

            System.out.println(nums.get(0));
        } else {
            System.out.println(-1);
        }
    }
}
