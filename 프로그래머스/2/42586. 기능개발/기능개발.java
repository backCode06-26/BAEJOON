import java.util.ArrayList;

class Solution {
public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> completionWorkCounts = new ArrayList<>();

        int before = -1;
        int value = 1;
        for (int i=0; i<progresses.length; i++) {
            int completionDate = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);

            if (before == -1) {
                before = completionDate;
                continue;
            }
            if (before >= completionDate) {
                value++;
            } else {
                completionWorkCounts.add(value);
                value = 1;
                before = completionDate;
            }
        }
        completionWorkCounts.add(value);

        return completionWorkCounts.stream().mapToInt(i -> i).toArray();
    }
}