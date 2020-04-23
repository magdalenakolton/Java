import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {

      float[] arr = {2, 7, 11, 15, 44, 1, 6, 9};
      float target = 7;

      int[] result = Function.solution(arr, target);

      System.out.println("Wynik = ");
      for(int i=0; i<2; i++) {
          System.out.println((i+1) + " indeks tablicy: " + result[i]);
      }
    }

}