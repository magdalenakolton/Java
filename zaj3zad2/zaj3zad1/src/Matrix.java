import java.util.Iterator;

public class Matrix<T> implements Iterable<T>  {

        public int rows, columns;
        public T[][] matrix;

        public Matrix(int rows, int columns) {
            this.rows = rows;
            this.columns = columns;

            matrix = (T[][]) new String[rows][columns];
        }

    public void addMatrix(Matrix matrix1, Matrix matrix2) {

        try {
            if (matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns)
                throw new Exception(); //warunek, by moc dodac dwie macierze

            int M = matrix1.rows;
            int N = matrix1.columns;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    matrix1.matrix[i][j] += matrix2.matrix[i][j];
                }
            }

        } catch (Exception e) {
            System.err.println("Macierze mają rozny wymiar!");
        }

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
