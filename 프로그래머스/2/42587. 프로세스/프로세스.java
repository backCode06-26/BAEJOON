import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : priorities) {
            maxHeap.add(j);
        }

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        int cnt = 0;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();

            int priority = current[0];
            int number = current[1];

            int topPriority = maxHeap.peek();

            if (priority != topPriority) {
                queue.add(new int[]{priority, number});

            } else {
                cnt++;
                if (number == location) {
                    break;
                }
                maxHeap.poll();
            }
        }


        return cnt;
    }
}