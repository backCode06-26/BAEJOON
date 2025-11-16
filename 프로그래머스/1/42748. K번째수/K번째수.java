import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] results = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start =  commands[i][0]-1;
            int end = commands[i][1];
            int idx = commands[i][2]-1;

            int[] nums = Arrays.copyOfRange(array, start, end);
            Arrays.sort(nums);

            results[i] = nums[idx];
        }
        return results;
    }
}