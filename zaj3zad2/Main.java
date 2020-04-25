import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String args[]) {

        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(10);


// gdy wartosci są ujemne:
        list1.add(-1);
        list1.add(-2);

        int counter;

        try {
            if (list1.size() == 0 || list1.size() > 100000) {
                throw new Exception();
            }

            int result = Function.solution(list1);
            System.out.println("Wynik = " + result);

        }
        catch(Exception e){
            System.err.println("Lista ma nieprawidlowy rozmiar!");
        }

    }


}