import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> value = new Stack<>();

        int[] answer = new int[num];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<num; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        for(int i=0; i<num; i++) {
            while (!value.isEmpty() && answer[value.peek()] < answer[i]) {
                answer[value.pop()] = answer[i];
            }
            value.push(i);
        }

        while (!value.isEmpty()) {
            answer[value.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int j : answer) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}
