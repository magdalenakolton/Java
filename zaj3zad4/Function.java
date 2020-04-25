public class Function {

    static int[] solution(float[] arr, float target) {
        int[] result = new int[2];
        for(int i=0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("Brak rozwiazania!");

    }

}
