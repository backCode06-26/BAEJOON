import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] nums = sc.nextLine().split(" ");

            String command = nums[0];
            switch (command) {
                case "1": {
                    int value = Integer.parseInt(nums[1]);
                    stack.push(value);
                    break;
                }
                case "2": {
                    try {
                        sb.append(stack.pop()).append("\n");
                    } catch (EmptyStackException e) {
                        sb.append(-1).append("\n");
                    }
                    break;
                }
                case "3": {
                    sb.append(stack.size()).append("\n");
                    break;
                }
                case "4": {
                    sb.append((stack.isEmpty()) ? 1 : 0).append("\n");
                    break;
                }
                default: {
                    try {
                        sb.append(stack.peek()).append("\n");
                    } catch (EmptyStackException e) {
                        sb.append(-1).append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}