import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int range = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<range; i++) {
            String input = sc.nextLine();

            long count = Arrays.stream(
                    input.split(" "))
                    .filter(s -> s.equals("0"))
                    .count();

            sb.append(
                    count == 4 ? "D" :
                            count == 3 ? "C" :
                                    count == 2 ? "B" :
                                            count == 1 ? "A" : "E").append("\n");
        }

        System.out.println(sb);
    }
}
