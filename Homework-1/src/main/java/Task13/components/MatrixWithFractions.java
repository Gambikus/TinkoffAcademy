package Task13.components;

public class MatrixWithFractions {
    Fraction[][] matrix;
    int n;

    public MatrixWithFractions(int n) {
        this.n = n;
        matrix = new Fraction[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Fraction((long)(Math.random() * 9 + 1), 1L);
            }
        }
    }

    public void printMatrix() {
        for (Fraction[] row : matrix) {
            System.out.print("|");
            for (Fraction el : row) {
                System.out.printf("%10d/%d ", el.numerator, el.denominator);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public long calculateDeterminant() {
        Fraction determinant = new Fraction(1, 1);
        int x = 0;
        for (int i = 0; i < n; i++) {
            int k = -1;
            for (int j = x; j < n; j++) {
                if (matrix[j][i].numerator != 0) {
                    k = j;
                    x++;
                    break;
                }
            }
            if (k == -1) {
                continue;
            }
            determinant.mult(matrix[k][i]);
            determinant.simplify();
            secondElementaryOperetion(matrix[k], new Fraction(matrix[k][i]));
            for (int j = k + 1; j < n; j++) {
                if (matrix[j][i].numerator != 0) {
                    determinant.mult(matrix[j][i]);
                    determinant.simplify();
                    secondElementaryOperetion(matrix[j], new Fraction(matrix[j][i]));
                    thirdElementaryOperation(matrix[j], matrix[k]);
                }
            }
            printMatrix();
        }
        return determinant.getInt();
    }

    public void secondElementaryOperetion(Fraction[] a, Fraction x) {
        for (int i = 0; i < n; i++) {
            a[i].divide(x);
            a[i].simplify();
        }
    }
    public void thirdElementaryOperation(Fraction[] a, Fraction[] b) {
        for (int i = 0; i < n; i++) {
            a[i].subtract(b[i]);
            a[i].simplify();
        }
    }
}
