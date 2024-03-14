import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cnt = new int[1_000_001];
        int[] index = new int[num];
        for(int i=0; i<num; i++) {
            index[i] = Integer.parseInt(st.nextToken());
            cnt[index[i]]++;
        }

        Stack<Integer> data = new Stack<>();
        for(int i=0; i<index.length; i++) {
            while (!data.empty() && cnt[index[data.peek()]] < cnt[index[i]]) {
                index[data.pop()] = index[i];
            }
            data.push(i);
        }

        while (!data.empty()) {
            index[data.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int number : index) {
            sb.append(number).append(" ");
        }
        System.out.println(sb);
    }
}
