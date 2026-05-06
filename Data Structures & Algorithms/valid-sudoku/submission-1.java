class Solution {
    public boolean isValidSudoku(char[][] board) {
        // create subBoxes
        for (int square = 0; square < 9; square++) {
            char[] subBox = new char[9];
            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    subBox[index] = board[row][col];
                    index++;
                }
            }
            if (checkLine(subBox) == false)
                return false;
        }
        // check rows + columns
        for (int i = 0; i < board.length; i++) {
            char[] column = new char[board.length];
            char[] subBox = new char[board.length];
            for (int j = 0; j < column.length; j++) {
                column[j] = board[j][i]; // column created
            }
            if (checkLine(board[i]) == false) {
                return false;
            }
            if (checkLine(column) == false) {
                return false;
            }
        }
        return true;
    }

    public boolean checkLine(char[] line) {
        HashSet<Character> counter = new HashSet<>();
        for (char c : line) {
            if (c == '.') {
                continue;
            }
            if (counter.contains(c)) {
                return false;
            }
            counter.add(c);
        }
        return true;
    }
}
