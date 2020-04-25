public class Function {

    static int substring(String a, String b){

        int counter = 1;
        int length = 0;
        String tmp = a;

        try {
            if (a.isEmpty() == true || b.isEmpty() == true || length > b.length()) throw new Exception();

            while((a.contains(b)) != true){
                a += tmp;
                counter++;
                length++;
            }
            return counter;

        } catch(Exception e){
            System.err.println("Podany ciag znakow jest pusty!");

        }
        return -1;
    }

}
