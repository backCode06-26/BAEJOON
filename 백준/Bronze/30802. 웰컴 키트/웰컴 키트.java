import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사람수
        int people = sc.nextInt();

        // 사이즈 수
        int[] shirt_sizes = new int[6];
        for(int i = 0; i< shirt_sizes.length; i++) {
            shirt_sizes[i] = sc.nextInt();
        }

        // 묶음 수, 옷, 펜
        int shirt = sc.nextInt();
        int pen = sc.nextInt();


        int shirt_total = 0;
        for(double size : shirt_sizes) {
            shirt_total += Math.ceil(size / shirt);
        }

        int pen_count = people / pen;
        int last_pen = people % pen;

        System.out.println(shirt_total);
        System.out.println(pen_count + " " + last_pen);

    }
}
