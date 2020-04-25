import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, h;
        int wybor;

        do {
            System.out.println("Wybierz figure:");
            System.out.println("1. Trojkat");
            System.out.println("2. Kwadrat");
            System.out.println("3. Kolo");
            System.out.println("4. Zakoncz dzialanie programu. ");

            System.out.println("Wybor: ");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:

                    System.out.print("Podaj dlugosc podstawy trojkata:");
                    a = scanner.nextDouble();

                    System.out.print("Podaj dlugosc pierwszego boku trojkata:");
                    b = scanner.nextDouble();

                    System.out.print("Podaj dlugosc drugiego boku trojkata:");
                    c = scanner.nextDouble();

                    System.out.print("Podaj wysokosc trojkata:");
                    h = scanner.nextDouble();

                    try {
                        if(a+b < c || a + c < b || b + c <a || b <=0 || a<= 0 || c<= 0)
                            throw new Exception();
                        Triangle Tr = new Triangle(a, b, c, h);
                        Tr.print();
                        System.out.println();

                    }catch(Exception e){
                        System.err.println("Nieprawidlowe dane!");
                    }

                    break;

                case 2:

                    System.out.println("Podaj bok kwadratu:");
                    a = scanner.nextDouble();

                    try{
                        if(a<=0) throw new Exception();

                        Square Sq = new Square(a);
                        Sq.print();
                        System.out.println();
                        break;

                        }catch(Exception e) {
                        System.err.println("Nieprawidlowe dane!");
                    }
                    break;

                case 3:
                    System.out.println("Podaj promien:");
                    a = scanner.nextDouble();

                    try{
                        if(a<=0) throw new Exception();
                            Circle Ci = new Circle(a);
                            Ci.print();
                            System.out.println();
                            break;

                    }catch(Exception e){
                        System.err.println("Nieprawidlowe dane!");
                    }
                    break;

                case 4:
                    System.out.println("Wyjscie z programu.");
                    System.exit(0);

                default:
                    System.err.println("Nieprawidłowe dane!");
                    break;
            }

        } while (wybor==1 || wybor ==2 || wybor ==3);
    }
}