import mathematics.Mathmethods;
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("the given number is: ");
        int a=m.nextInt();
        Mathmethods mm=new Mathmethods();
        int b=Mathmethods.Cube(a);
        System.out.println("cube is: "+b);
    }	
}
package mathematics;
public class Mathmethods{
    public static float Cube(float n){
        return (n*n*n);
    }
    public static int Cube(int n){
        return (n*n*n);
    }
    public static double Cube(double n){
        return (n*n*n);
    }
    public static long Cube(long n){
        return (n*n*n);
    }
}
