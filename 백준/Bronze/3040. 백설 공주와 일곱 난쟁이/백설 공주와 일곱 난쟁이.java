import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarfHeights = new int[9];

        int total = 0;
        for (int i=0; i<9; i++) {
            int dwarfHeight = sc.nextInt();

            dwarfHeights[i] = dwarfHeight;
            total += dwarfHeight;
        }

        int firstExcludedIndex = 0;
        int secondExcludedIndex = 0;

        outerLoop:
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if ((total - (dwarfHeights[i] + dwarfHeights[j])) == 100) {
                    firstExcludedIndex = i;
                    secondExcludedIndex = j;
                    break outerLoop;
                }
            }
        }

        for (int i=0; i<9; i++) {
            if (i != firstExcludedIndex && i != secondExcludedIndex) {
                System.out.println(dwarfHeights[i]);
            }
        }
    }
}
