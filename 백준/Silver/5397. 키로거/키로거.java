import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            Stack<String> leftStack = new Stack<String>();
            Stack<String> rightStack = new Stack<String>();

            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == '<') {
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }

                } else if (ch == '>') {
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }

                } else if (ch == '-') {
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }

                } else {
                    leftStack.push(String.valueOf(ch));
                }
            }
            while (!rightStack.isEmpty()) {
                leftStack.push(rightStack.pop());
            }
            sb.append(String.join("", leftStack)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
