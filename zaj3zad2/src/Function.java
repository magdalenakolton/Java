import java.util.List;

public class Function {

    static int solution(List<Integer> a) {

        int min = 0;
        try {
            for (int i = 0; i < a.size(); i++) {
                if ((a.get(i) < -1000000) || (a.get(i) > 1000000)) {
                    throw new Exception();
                }

                for (i = 0; i < a.size(); i++) { //wyszukuje najmniejsza wartosc na liscie
                    if (a.get(i) < min && a.get(i) > 0) {
                        min = a.get(i);
                    }
                }

                for (i = 0; i < a.size(); i++) { //wyszukuje wartosci o 1 wiekszej niz min
                    if (a.get(i) == min + 1) { //jesli min+1 istnieje to szukam min+2
                        min++;
                    }

                }
                return (min + 1);

            }
        }
        catch(Exception e){
            System.err.println("Dane nie spelniaja warunkow!");
        }
        return 0;
    }
}
