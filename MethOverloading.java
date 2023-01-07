import java.util.Scanner;


public class Meth {
    int rarea;
    double carea;
    void area(int l,int b){
        rarea=l*b;
        System.out.println("Area of Rectangle: "+rarea);
    }
    void area(double r){
        carea=3.14*r*r;
        System.out.println("Area of Circle: "+carea); 
    }
}

public class MethOverloading {
    public static void main(String[] args) {
        int l,b;
        double r;
        Scanner scanner=new Scanner(System.in);
        Meth meth=new Meth();
        System.out.println("Enter length & breadth: ");
        l=scanner.nextInt();
        b=scanner.nextInt();
        meth.area(l,b);
        System.out.println("Enter radius: ");
        r=scanner.nextDouble();
        meth.area(r); 
    }

}
