import java.io.*;
import java.util.Scanner;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int num = 0b00000000000000000000;

    static void changeNum(String command, int data) throws IOException {
        switch (command) {
            case "add":
                num = num | (1 << data-1);
                break;

            case "remove":
                num = num & (~(1 << data-1));
                break;

            case "check":
                bw.write(String.valueOf((num & (1 << data-1)) != 0 ? 1 : 0) + "\n");
                break;

            case "toggle":
                num = num ^ (1 << data-1);
                break;

            case "all":
                num = 0b11111111111111111111;
                break;

            case "empty":
                num = 0b00000000000000000000;
        }
    }
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            String command = str[0];

            int data = 0;
            if (str.length > 1) {
                data = Integer.parseInt(str[1]);
            }
            changeNum(command, data);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
