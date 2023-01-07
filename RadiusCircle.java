import java.util.Scanner;

public class Circle {

    double p;
    double a;

    void area(double r){
        a=3.14*r*r;
        System.out.println("Area of circle: "+a);
    }

    void perimeter(double r){
        p=2*3.14*r;
        System.out.println("Perimeter of circle: "+p);
    }

}


public class RadiusCircle {
    public static void main(String[] args) {

        double r;
        Scanner scanner=new Scanner(System.in);

        Circle circle=new Circle();

        System.out.println("Enter radius: ");
        r=scanner.nextDouble();

        circle.area(r);
        circle.perimeter(r);
    }
}
