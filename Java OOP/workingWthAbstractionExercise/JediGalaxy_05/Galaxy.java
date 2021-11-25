package workingWthAbstractionExercise.JediGalaxy_05;

public class Galaxy {

    private Field field;

    Galaxy(Field field){
        this.field = field;
    }

    public void moveEvil(int row, int col){
        while (col >= 0 && row >= 0) {
            if (this.field.isInBound(row, col)) {
                this.field.setValue(row, col, 0);
            }
            row--;
            col--;
        }
    }

    public long moveJedi(int row, int col){
        long collectedStars = 0;
        while (row >= 0 && col < this.field.getColLength(1)) {
            if (field.isInBound(row, col)) {
                collectedStars += this.field.getValue(row, col);;
            }

            col++;
            row--;
        }
        return collectedStars;
    }

}
