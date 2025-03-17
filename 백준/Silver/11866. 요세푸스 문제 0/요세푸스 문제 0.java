import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        int index = 0;
        System.out.print("<");
        while (!nums.isEmpty()) {
            index = (index + k-1) % nums.size();
            if(nums.size() != 1) {
                System.out.print(nums.remove(index)+", ");
            } else {
                System.out.print(nums.remove(index));
            }
        }
        System.out.print(">");
    }
}
