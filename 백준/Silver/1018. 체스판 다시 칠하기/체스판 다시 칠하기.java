import java.util.Scanner;

public class Main {
    static int chessSize = 8;

    // 체스판 점검 함수
    public static int is_false_count(String[][] chess) {
        String before = chess[7][7];

        int total = 0;
        for (String[] strings : chess) {
            for (String string : strings) {
                if (!(string.equals(before))) {
                    total++;
                }
                // 색을 변경하여 체스판 점검하기
                before = (before.equals("W")) ? "B" : "W";
            }
            // 줄이 바뀌면 바뀔때 색과 같은 색으로 시작함
            before = (before.equals("W")) ? "B" : "W";
        }
        return Math.min(total, 64-total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chessX = sc.nextInt();
        int chessY = sc.nextInt();
        sc.nextLine();

        int result = Integer.MAX_VALUE;

        // 체스판 만들기
        String[][] chess = new String[chessX][chessY];
        for(int i = 0; i < chess.length; i++) {

            String[] row = sc.nextLine().split("");
            for(int j = 0; j < chess[i].length; j++) {
                chess[i][j] = row[j];
            }
        }

        // 8*8 체스판 나누기
        for(int i = 0; i < chessX - chessSize + 1; i++) {
            for(int j = 0; j < chessY - chessSize + 1; j++) {
                String[][] checkChess = new String[chessSize][chessSize];
                for(int x = 0; x < chessSize; x++) {
                    for(int y = 0; y < chessSize; y++) {
                        checkChess[x][y] = chess[i+x][j+y];
                    }
                }
                int check_result = is_false_count(checkChess);
                if(result > check_result) {
                    result = check_result;
                }
            }
        }

        System.out.println(result);
    }
}
