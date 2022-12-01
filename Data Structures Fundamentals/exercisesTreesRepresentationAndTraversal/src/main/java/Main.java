import implementations.TheMatrix;

public class Main {
    public static void main(String[] args) {
        char[][] matrix = {
                {'a', 'a', 'a',},
                {'a', 'a', 'a',},
                {'a', 'b', 'a',},
                {'a', 'b', 'a',},
                {'a', 'b', 'a',}

        };
        char fillChar = 'x';
        int startRow = 2;
        int startCol = 1;

        TheMatrix theMatrix = new TheMatrix(matrix, fillChar, startRow, startCol);

        theMatrix.solve();
    }
}
