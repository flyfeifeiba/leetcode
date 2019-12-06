package question;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/6 19:51
 * @Description: https://leetcode-cn.com/problems/valid-sudoku/
 */
public class Q36 {

    public boolean isValidSudoku(char[][] board) {
        return validHor(board) && validVer(board) && validNine(board);
    }

    private boolean validHor(char[][] board) {
        List<Character> numberList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            numberList.clear();
            for (int j = 0; j < 9; j ++) {
                if (board[i][j] != '.') {
                    if (numberList.contains(board[i][j]) ) {
                        return false;
                    }
                    numberList.add(board[i][j]);
                }

            }
        }
        return true;
    }

    private boolean validVer(char[][] board) {
        List<Character> numberList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            numberList.clear();
            for (int j = 0; j < 9; j ++) {
                if (board[j][i] != '.') {
                    if (numberList.contains(board[j][i]) ) {
                        return false;
                    }
                    numberList.add(board[j][i]);
                }

            }
        }
        return true;
    }

    private boolean validNine(char[][] board) {
        List<Character> numberList = new ArrayList<>();
        for (int iIndex = 0; iIndex < 9; iIndex = iIndex + 3) {
            for (int jIndex = 0; jIndex < 9; jIndex = jIndex + 3) {
                numberList.clear();
                for (int i = iIndex; i < iIndex + 3; i++) {
                    for (int j = jIndex; j < jIndex + 3; j ++) {
                        if (board[j][i] != '.') {
                            if (numberList.contains(board[j][i]) ) {
                                return false;
                            }
                            numberList.add(board[j][i]);
                        }

                    }
                }
            }
        }

        return true;
    }
}
