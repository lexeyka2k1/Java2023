package edu.hw1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Task9 {
    private final static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.info(knightBoardCapture(new int[][] {
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1},
        }));
        LOGGER.info(knightBoardCapture(new int[][] {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
        }));


    }
    public static boolean knightBoardCapture(int[][] board) {
        int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int newX = i + dx[k];
                        int newY = j + dy[k];

                        if (newX >= 0 && newX < 8
                            && newY >= 0 && newY < 8
                            && board[newX][newY] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
