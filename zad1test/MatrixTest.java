package zad1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    public void testStringMatrix() {
        String[][] matrix1=new String[4][4];
        String[][] matrix2=new String[4][4];
        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = "te";
                matrix2[i][j] = "sting";
            }
        }

        Matrix<String> generic1=new Matrix<String>(String.class, 4,4,matrix1);
        Matrix<String> generic2=new Matrix<String>(String.class,4,4,matrix2);
        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                Assert.assertEquals("testing", (generic1.add(generic2, String.class)).matrix[i][j]);
            }
        }
    }

    @Test
    public void testIntegersMatrix() {

        Integer[][] matrix1=new Integer[4][4];
        Integer[][] matrix2=new Integer[4][4];
        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = 1;
                matrix2[i][j] = 10;
            }
        }

        Matrix<Integer> generic1=new Matrix<Integer>(Integer.class, 4,4,matrix1);
        Matrix<Integer> generic2=new Matrix<Integer>(Integer.class,4,4,matrix2);

        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                Assert.assertEquals(11, (generic1.add(generic2, Integer.class)).matrix[i][j]);
            }
        }
    }

    @Test(timeout = 100)
    public void testIntegerTime(){
        Integer[][] matrix1=new Integer[4][4];
        Integer[][] matrix2=new Integer[4][4];
        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = 1;
                matrix2[i][j] = 10;
            }
        }

        Matrix<Integer> generic1=new Matrix<Integer>(Integer.class, 4,4,matrix1);
        Matrix<Integer> generic2=new Matrix<Integer>(Integer.class,4,4,matrix2);

        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                Assert.assertEquals(11, (generic1.add(generic2, Integer.class)).matrix[i][j]);
            }
        }
    }

    @Test(timeout = 100)
    public void testStringTime(){
        String[][] matrix1=new String[4][4];
        String[][] matrix2=new String[4][4];
        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = "te";
                matrix2[i][j] = "sting";
            }
        }

        Matrix<String> generic1=new Matrix<String>(String.class, 4,4,matrix1);
        Matrix<String> generic2=new Matrix<String>(String.class,4,4,matrix2);
        for(int i =0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                Assert.assertEquals("testing", (generic1.add(generic2, String.class)).matrix[i][j]);
            }
        }

    }
}