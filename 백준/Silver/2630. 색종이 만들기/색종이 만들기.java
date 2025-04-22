import java.util.Scanner;

public class Main {
    static int uncoloredCount = 0; // 색이 없는 개수
    static int coloredCount = 0; // 색이 있는 개수

    static int n;
    static int[][] map;

    public static boolean checkColor(int[][] arr, int x, int y, int size) {

        // 첫번째 색상을 채크하여 다르면 false 같으면 색상에 맞는 변수의 값을 올리고 true를 반환합니다.
        int color = arr[x][y];
        for(int i = x; i < x+size; i++) {
            for(int j = y; j < y+size; j++) {
                if(color != arr[i][j]) {
                    return false;
                }
            }
        }
        if(arr[x][y] == 0) uncoloredCount++;
        else coloredCount++;

        return true;
    }

    public static void isColorCount(int[][] map, int  x, int y, int size) {
        if(checkColor(map, x, y, size)) {
            return;
        }

        // 현재 길이를 반으로 줄입니다.
        int newSize = size/2;

        // 네 방햡를 전부 돌립니다.
        isColorCount(map, x, y, newSize);
        isColorCount(map, x+newSize, y, newSize);
        isColorCount(map, x, y+newSize, newSize);
        isColorCount(map, x+newSize, y+newSize, newSize);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        isColorCount(map, 0, 0, n);
        System.out.println(uncoloredCount);
        System.out.println(coloredCount);
    }
}
