package question;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/6 20:27
 * @Description: https://leetcode-cn.com/problems/sudoku-solver/
 */
public class Q37 {

    public void solveSudoku(char[][] board) {
        while (!isFinish(board)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        List<Character> numberList = findNoPossibleNumber(board, i, j);
                        if (numberList.size() == 8) {
                            board[i][j] = findOnlyPossibleNumber(numberList);
                        }
                    }

                }
            }
        }
    }

    private List<Character> findNoPossibleNumber(char[][] board, int i, int j) {
        List<Character> numberList = new ArrayList<>();
        for (int k = 0; k < 9; k++) {
            if (board[i][k] != '.') {
                numberList.add(board[i][k]);
            }
            if (board[k][j] != '.') {
                numberList.add(board[k][j]);
            }
        }
        i = i / 3 * 3;
        j = j / 3 * 3;
        for (int k = i; k < (i + 3); k++) {
           for (int l = j; l < (j + 3); l++) {
               if (board[k][l] != '.') {
                   numberList.add(board[k][l]);
               }
           }
        }
        return numberList;

    }

    private char findOnlyPossibleNumber(List<Character> numberList) {
        int j;
        int i;
        for (i = 0 ; i < 9; i++) {
            for (j = 0; j < 8; j++) {
                if ((numberList.get(j) - '0') == i) {
                    break;
                }
            }
            if (j == 8) {
                return (char)(i + '0');
            }
        }
        return '0';
    }

    private boolean isFinish(char[][] board) {
        int i, j;
        for (i = 0 ; i < 9; i++) {
            for (j = 0; j < 8; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
