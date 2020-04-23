import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {

        int[] sorted = new int[10000];
        int[] backwards_sorted = new int[10000];
        int[] rnd = new int[10000];

        int tmp2 = backwards_sorted.length-1;
        Random r = new Random();

        for (int i = 0; i < sorted.length; i++) { sorted[i] = i; } //dla optymistycznego
        for(int i = 0; i < backwards_sorted.length; i++){  backwards_sorted[i] = tmp2; tmp2--; } //pesymistycznego
        for(int i=0; i<rnd.length; i++){ rnd[i] = r.nextInt(); } //realnego

////////////////////////////////////////////////////////////////////////////////


        System.out.println("Wybierz opcje obliczen czasow: \n" +
                "1. Rzeczywisty \n" +
                "2. Optymistyczny \n" +
                "3. Pesymistyczny \n");
        int c = scanner.nextInt();


////////////////////////////////////////////////////////////////////////////////

    switch(c){
        case 1:

            long tStart6 = System.currentTimeMillis();
            BubbleSort ob6 = new BubbleSort();
            ob6.bubbleSort(rnd);
            long tEnd6 = System.currentTimeMillis();
            long tDelta6 = tEnd6 - tStart6;
            double elapsedSeconds6 = tDelta6 / 1000.0;
            System.out.println("Wersja rzeczywista bubble: " + elapsedSeconds6);

/////////////////////////////////////////////////////////////
            for(int i=0; i<rnd.length; i++){ rnd[i] = r.nextInt(); }
            long tStart7 = System.currentTimeMillis();
            HeapSort ob7 = new HeapSort();
            ob7.sort(rnd);
            long tEnd7 = System.currentTimeMillis();
            long tDelta7 = tEnd7 - tStart7;
            double elapsedSeconds7 = tDelta7 / 1000.0;
            System.out.println("Wersja rzeczywista HeapSort: " + elapsedSeconds7);

/////////////////////////////////////////////////////////////
            for(int i=0; i<rnd.length; i++){ rnd[i] = r.nextInt(); }
            long tStart8 = System.currentTimeMillis();
            Select ob8 = new Select();
            ob8.sort(rnd);
            long tEnd8 = System.currentTimeMillis();
            long tDelta8 = tEnd8 - tStart8;
            double elapsedSeconds8 = tDelta8 / 1000.0;
            System.out.println("Wersja rzeczywista SelectionSort: " + elapsedSeconds8);

/////////////////////////////////////////////////////////////
            for(int i=0; i<rnd.length; i++){ rnd[i] = r.nextInt(); }
            long tStart9 = System.currentTimeMillis();
            InsertionSort ob9 = new InsertionSort();
            ob9.sort(rnd);
            long tEnd9 = System.currentTimeMillis();
            long tDelta9 = tEnd9 - tStart9;
            double elapsedSeconds9 = tDelta9 / 1000.0;
            System.out.println("Wersja rzeczywista InsertionSort: " + elapsedSeconds9);

/////////////////////////////////////////////////////////////
            for(int i=0; i<rnd.length; i++){ rnd[i] = r.nextInt(); }
            long tStart10 = System.currentTimeMillis();
            CocktailSort ob10 = new CocktailSort();
            ob10.cocktailSort(rnd);
            long tEnd10 = System.currentTimeMillis();
            long tDelta10 = tEnd10 - tStart10;
            double elapsedSeconds10 = tDelta10 / 1000.0;
            System.out.println("Wersja rzeczywista CocktailSort: " + elapsedSeconds10);
            break;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        case 2:

            long tStart1 = System.currentTimeMillis();
            BubbleSort ob1 = new BubbleSort();
            ob1.bubbleSort(sorted);
            long tEnd1 = System.currentTimeMillis();
            long tDelta1 = tEnd1 - tStart1;
            double elapsedSeconds1 = tDelta1 / 1000.0;
            System.out.println("Wersja optymistyczna bubble: " + elapsedSeconds1);

/////////////////////////////////////////////////////////////

            long tStart2 = System.currentTimeMillis();
            HeapSort ob2 = new HeapSort();
            ob2.sort(sorted);
            long tEnd2 = System.currentTimeMillis();
            long tDelta2 = tEnd2 - tStart2;
            double elapsedSeconds2 = tDelta2 / 1000.0;
            System.out.println("Wersja optymistyczna HeapSort: " + elapsedSeconds2);

/////////////////////////////////////////////////////////////

            long tStart3 = System.currentTimeMillis();
            Select ob3 = new Select();
            ob3.sort(sorted);
            long tEnd3 = System.currentTimeMillis();
            long tDelta3 = tEnd3 - tStart3;
            double elapsedSeconds3 = tDelta3 / 1000.0;
            System.out.println("Wersja optymistyczna SelectionSort: " + elapsedSeconds3);

/////////////////////////////////////////////////////////////

            long tStart4 = System.currentTimeMillis();
            InsertionSort ob4 = new InsertionSort();
            ob4.sort(sorted);
            long tEnd4 = System.currentTimeMillis();
            long tDelta4 = tEnd4 - tStart4;
            double elapsedSeconds4 = tDelta4 / 1000.0;
            System.out.println("Wersja optymistyczna InsertionSort: " + elapsedSeconds4);

/////////////////////////////////////////////////////////////

            long tStart5 = System.currentTimeMillis();
            CocktailSort ob5 = new CocktailSort();
            ob5.cocktailSort(sorted);
            long tEnd5 = System.currentTimeMillis();
            long tDelta5 = tEnd5 - tStart5;
            double elapsedSeconds5 = tDelta5 / 1000.0;
            System.out.println("Wersja optymistyczna CocktailSort: " + elapsedSeconds5);
            break;


        case 3:

            long tStart11 = System.currentTimeMillis();
            BubbleSort ob11 = new BubbleSort();
            ob11.bubbleSort(rnd);
            long tEnd11 = System.currentTimeMillis();
            long tDelta11 = tEnd11 - tStart11;
            double elapsedSeconds11 = tDelta11 / 1000.0;
            System.out.println("Wersja pesymistyczna bubble: " + elapsedSeconds11);

/////////////////////////////////////////////////////////////
            for(int i = 0; i < backwards_sorted.length; i++){  backwards_sorted[i] = tmp2; tmp2--; }
            long tStart12 = System.currentTimeMillis();
            HeapSort ob12 = new HeapSort();
            ob12.sort(rnd);
            long tEnd12 = System.currentTimeMillis();
            long tDelta12 = tEnd12 - tStart12;
            double elapsedSeconds12 = tDelta12 / 1000.0;
            System.out.println("Wersja pesymistyczna HeapSort: " + elapsedSeconds12);

/////////////////////////////////////////////////////////////
            for(int i = 0; i < backwards_sorted.length; i++){  backwards_sorted[i] = tmp2; tmp2--; }
            long tStart13 = System.currentTimeMillis();
            Select ob13 = new Select();
            ob13.sort(backwards_sorted);
            long tEnd13 = System.currentTimeMillis();
            long tDelta13 = tEnd13 - tStart13;
            double elapsedSeconds13 = tDelta13 / 1000.0;
            System.out.println("Wersja pesymistyczna SelectionSort: " + elapsedSeconds13);

/////////////////////////////////////////////////////////////
            for(int i = 0; i < backwards_sorted.length; i++){  backwards_sorted[i] = tmp2; tmp2--; }
            long tStart14 = System.currentTimeMillis();
            InsertionSort ob14 = new InsertionSort();
            ob14.sort(backwards_sorted);
            long tEnd14 = System.currentTimeMillis();
            long tDelta14 = tEnd14 - tStart14;
            double elapsedSeconds14 = tDelta14 / 1000.0;
            System.out.println("Wersja pesymistyczna InsertionSort: " + elapsedSeconds14);

/////////////////////////////////////////////////////////////
            for(int i = 0; i < backwards_sorted.length; i++){  backwards_sorted[i] = tmp2; tmp2--; }
            long tStart15 = System.currentTimeMillis();
            CocktailSort ob15 = new CocktailSort();
            ob15.cocktailSort(backwards_sorted);
            long tEnd15 = System.currentTimeMillis();
            long tDelta15 = tEnd15 - tStart15;
            double elapsedSeconds15 = tDelta15 / 1000.0;
            System.out.println("Wersja pesymistyczna CocktailSort: " + elapsedSeconds15);
            break;

        default:
            System.err.println("Wprowadz poprawne dane.");
            break;

    }

    }
}
