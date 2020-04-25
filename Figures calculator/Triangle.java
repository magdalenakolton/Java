public class Triangle extends Figure implements Print {

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h){ //konstruktor
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    public double calculateArea() {
        return (a*h)/2;
    }

    public double calculatePerimeter(){
        return a+b+c;
    }

    public void print(){
        System.out.println();
        System.out.println("Trójkat o danych:");
        System.out.println("Podstawa ="+a);
        System.out.println("Bok a ="+b);
        System.out.println("Bok b ="+c);
        System.out.println("Wysokosc ="+h);
        System.out.println("Pole trojkata ="+calculateArea());
        System.out.println("Obwod trojkata ="+calculatePerimeter());
    }
}

