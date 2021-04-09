package lesson13;

public class Matrix implements IMatrix {
    private double numbers[][];

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix numbers1 = new Matrix(5, 5);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers1.setValueAt(i, j, this.numbers[i][j] + otherMatrix.getValueAt(i, j));

            }
        }
        return numbers1;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix numbers1 = new Matrix(5, 5);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers1.setValueAt(i, j, this.numbers[i][j] - otherMatrix.getValueAt(i, j));

            }
        }
        return numbers1;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//            int value;
//
//        if (otherMatrix.getColumns() != this.getRows()) {
//            System.out.println("Умножение не возможно");
//        }
//        Matrix results = new Matrix(this.getRows(), this.getColumns());
//        for (int i = 0; i < this.getRows(); i++) {
//            for (int j = 0; j < otherMatrix.getColumns(); j++) {
//                value + value;
//
//                for (int k = 0; k < value; k++) {
//                   value += otherMatrix.getValueAt (i, k) + this.getValueAt(k, j);
//                    results.setValueAt(i, j, value);
//                }
//            }
//        }
//        return results;

        Matrix mtr = new Matrix(getRows(), getColumns());

        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.numbers[i][j] * otherMatrix.getValueAt(j, i));
            }
        }
        return mtr;
    }


    @Override
    public IMatrix mul(double value) {
        Matrix mtr = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.numbers[i][j] * value);
            }
        }
        return mtr;
    }

    @Override
    public IMatrix transpose() {
        Matrix mtr = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                mtr.setValueAt(i, j, this.numbers[j][i]);
            }
        }
        return mtr;
    }

    @Override
    public IMatrix fillMatrix(double value) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = value;

            }
        }
        return null;
    }


    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (i == j && getValueAt(i, j) != 1) {
                    return false;
                }
                if (i != j && getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (getRows() == getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }


}
