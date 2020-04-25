public class Main {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdaaaaabcdabcd";
        int result = 0;

        result = Function.substring(a,b);
        System.out.println("Liczba powtorzen: " + result);

    }

}