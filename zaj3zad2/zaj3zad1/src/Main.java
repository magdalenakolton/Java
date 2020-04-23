public class Main {
    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix(10, 10);
        Matrix<Integer> matrix2 = new Matrix(10, 10);
        Matrix<Integer> result = new Matrix(10, 10);

        int a = 1;

        for(int i=0; i<matrix1.columns; i++){
            for(int j=0; j<matrix2.rows; i++){
                matrix1.matrix[i][j] = a;
                matrix2.matrix[i][j] = a;
                a+=3;
            }
        }

        result = matrix1.addMatrix(matrix1, matrix2);
    }
}
