class Solution {
    static int[] px = {1, 0, -1, -1, 1, 1, 0, -1};
    static int[] py = {-1, -1, -1, 0, 0, 1, 1, 1};
    
    public int solution(int[][] board) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 1) {
                    visited[i][j] = true;

                    for (int k = 0; k < 8; k++) {
                        int iIdx = i + px[k];
                        int jIdx = j + py[k];

                        if (0 <= iIdx && iIdx < board.length && 0 <= jIdx && jIdx < board[0].length && !visited[iIdx][jIdx]) {
                            visited[iIdx][jIdx] = true;
                        }
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!visited[i][j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}