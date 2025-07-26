class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Map<Character, Integer> row = new HashMap<>();

            Map<Character, Integer> col = new HashMap<>();

            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {

                 row.put(board[i][j], row.getOrDefault(board[i][j], 0) + 1);
                    if (row.get(board[i][j]) > 1) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                col.put(board[j][i], col.getOrDefault(board[j][i], 0) + 1);
                    if (col.get(board[j][i]) > 1) {
                        return false;
                    }
                }
            }
        }
        for (int R = 0; R < 3; R++) {
            for (int C = 0; C < 3; C++) {
                Map<Character, Integer> box = new HashMap<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = R * 3 + i;
                        int col = C * 3 + j;

        if (board[row][col] != '.') {
        box.put(board[row][col], box.getOrDefault(board[row][col], 0) + 1);
            if (box.get(board[row][col]) > 1) {
                    return false;
                         }
                        }
                    }
                }
            }
        }

        return true;
    }
}