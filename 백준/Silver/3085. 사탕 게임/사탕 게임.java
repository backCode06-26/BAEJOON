import java.util.Scanner;

public class Main {

    static int max = 0;
    static int n;
    static String[][] candys;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        candys = new String[n][n];

        for (int i = 0; i < n; i++) {
            String candy = sc.next();
            for (int j = 0; j < n; j++) {
                candys[i][j] = String.valueOf(candy.charAt(j));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                swap(i, j, i, j+1);
                search();
                swap(i, j, i, j+1);
            }
        }

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n; j++) {
                swap(i, j, i+1, j);
                search();
                swap(i, j, i+1, j);
            }
        }
        System.out.println(max);
    }

    public static void swap(int x1, int y1, int x2, int y2) {
        String temp = candys[x1][y1];
        candys[x1][y1] = candys[x2][y2];
        candys[x2][y2] = temp;
    }

    public static void search() {
        for(int i=0; i<n; i++) {
            int cnt = 1;

            for(int j=0; j<n-1; j++) {
                if(candys[i][j].equals(candys[i][j+1])) {
                    cnt++;
                    max = Math.max(cnt, max);
                } else {
                    cnt = 1;
                }
            }
        }

        for(int i=0; i<n; i++) {
            int cnt = 1;

            for(int j=0; j<n-1; j++) {
                if(candys[j][i].equals(candys[j+1][i])) {
                    cnt++;
                    max = Math.max(cnt, max);
                } else {
                    cnt = 1;
                }
            }
        }
    }

}
