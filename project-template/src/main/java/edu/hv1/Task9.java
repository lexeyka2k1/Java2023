package edu.hv1;

public class Task9 {
    public boolean knightBoardCapture(int[][] board) {
        int[][] moves = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {

                    for (int k = 0; k < 8; k++) {
                        int x = i + moves[k][0];
                        int y = j + moves[k][1];
                        if (x >= 0 && x < 8 && y >= 0 && y < 8 && board[x][y] == 1) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
