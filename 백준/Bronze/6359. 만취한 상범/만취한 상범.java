import java.util.Scanner;

public class Main {

    static public int getOpenDoor(int roomCnt) {
        boolean[] doors = new boolean[roomCnt+1];
        for (int i = 1; i <= roomCnt; i++) doors[i] = true;

        for (int i = 2; i <= roomCnt; i++) {

            if (i == 2) {
                for (int j = 1; j <= roomCnt; j++) {
                    if (j % 2 == 0) {
                        doors[j] = false;
                    }
                }
            } else if (i == 3) {
                for (int j = 1; j <= roomCnt; j++) {
                    if (j % 3 == 0) {
                        doors[j] = !doors[j];
                    }
                }
            } else {
                for (int j = 1; j <= roomCnt; j++) {
                    if (j % i == 0) {
                        doors[j] = !doors[j];
                    }
                }
            }
        }

        int reulst = 0;
        for (int i = 1; i <= roomCnt; i++) {
            if (doors[i]) reulst++;
        }

        return reulst;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int roomCnt = sc.nextInt();

            sb.append(getOpenDoor(roomCnt)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
