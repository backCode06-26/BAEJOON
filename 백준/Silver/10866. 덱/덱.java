import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Integer> integers = new LinkedList<>();
        for(int i=0; i<num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front" : {
                    integers.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back" : {
                    integers.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front" : {
                    if(!integers.isEmpty()) {
                        sb.append(integers.removeFirst()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                }
                case "pop_back" : {
                    if(!integers.isEmpty()) {
                        sb.append(integers.removeLast()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                }
                case "size" : {
                    sb.append(integers.size()).append("\n");
                    break;
                }
                case "empty" : {
                    if(integers.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                }
                case "front" : {
                    if(!integers.isEmpty()) {
                        sb.append(integers.getFirst()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                }
                case "back" : {
                    if(!integers.isEmpty()) {
                        sb.append(integers.getLast()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}