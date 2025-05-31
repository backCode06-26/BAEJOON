import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] blocks = input.split("(?<=(.))(?!\\1)");
        Arrays.sort(blocks);

        int zeroSize = 0;

        int oneSize = 0;

        for (int i=0; i<blocks.length; i++) {
            if (blocks[i].startsWith("1")) {
                break;
            }
            zeroSize += 1;
        }
        oneSize += blocks.length - zeroSize;

        System.out.println(Math.min(zeroSize, oneSize));

    }
}
