import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int order = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                nums.add(i);
            }
        }
        
        System.out.println((nums.size() < order) ? 0 : nums.get(order-1));
    }
}
