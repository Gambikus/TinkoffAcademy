package Task13.components;

public class Matrix {
    double[][] matrix;
    int n;

    public Matrix(int n) {
        this.n = n;
        matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int)(Math.random() * 9 + 1);
            }
        }
    }

    public void printMatrix() {
        for (double[] row : matrix) {
            System.out.print("|");
            for (double el : row) {
                System.out.printf("%8.2f ", el);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public long calculateDeterminant() {
        double determinant = 1;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int k = -1;
            for (int j = x; j < n; j++) {
                if (matrix[j][i] != 0) {
                    k = j;
                    x++;
                    break;
                }
            }
            if (k == -1) {
                continue;
            }
            determinant *= matrix[k][i];
            secondElementaryOperetion(matrix[k], matrix[k][i]);
            for (int j = k + 1; j < n; j++) {
                if (matrix[j][i] != 0) {
                    determinant *= matrix[j][i];
                    secondElementaryOperetion(matrix[j], matrix[j][i]);
                    thirdElementaryOperation(matrix[j], matrix[k]);
                }

            }
            printMatrix();
        }
        return Math.round(determinant);
    }

    public void secondElementaryOperetion(double[] a, double x) {
        for (int i = 0; i < n; i++) {
            a[i] /= x;
        }
    }
    public void thirdElementaryOperation(double[] a, double[] b) {
        for (int i = 0; i < n; i++) {
            a[i] -= b[i];
        }
    }
}

