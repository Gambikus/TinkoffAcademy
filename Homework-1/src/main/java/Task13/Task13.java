package Task13;

import Task13.components.Matrix;
import Task13.components.MatrixWithFractions;

public class Task13 {
    public static void main(String[] args) {
        //Matrix m = new Matrix(10);
        MatrixWithFractions m = new MatrixWithFractions(7);
        m.printMatrix();
        System.out.println(m.calculateDeterminant());
    }
}
