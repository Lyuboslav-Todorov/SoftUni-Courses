package implementations;

public class TheMatrix {
    private char[][] matrix;
    private char fillChar;
    private char toBeReplaced;
    private int startRow;
    private int startCol;

    public TheMatrix(char[][] matrix, char fillChar, int startRow, int startCol) {
        this.matrix = matrix;
        this.fillChar = fillChar;
        this.startRow = startRow;
        this.startCol = startCol;
        this.toBeReplaced = this.matrix[this.startRow][this.startCol];
    }

    public void solve() {
        fillMatrix(this.startRow, this.startCol);
    }

    private void fillMatrix(int row, int col) {
        if (isOutOfBound(row, col) || this.matrix[row][col] != this.toBeReplaced) {
            return;
        }

        this.matrix[row][col] = this.fillChar;

        fillMatrix(row + 1, col);
        fillMatrix(row, col +1);
        fillMatrix(row - 1, col);
        fillMatrix(row, col -1);

    }

    private boolean isOutOfBound(int row, int col) {
        return row < 0 || row >= this.matrix.length || col < 0 || col >= this.matrix[row].length;
    }

    public String toOutputString() {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < this.matrix.length; row++) {
            for (int col = 0; col < this.matrix[row].length; col++) {
                builder.append(this.matrix[row][col]);
            }
            builder.append(System.lineSeparator());
        }
        return builder.toString().trim();
    }
}
