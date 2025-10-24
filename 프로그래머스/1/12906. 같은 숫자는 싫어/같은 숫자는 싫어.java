import java.util.*;

public class Solution {
   public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {

            if (stack.isEmpty()) {
                stack.push(num);
                continue;
            }

            int current = stack.peek();

            if (current != num) {
                stack.push(num);
            }
        }

        int[] answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}