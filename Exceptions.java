import java.io.*;
import java.util.*;
class MyExceptions{
    void dzero(int a,int b){
        try{
            int d=a/b;
            System.out.println("\nDivision= "+d);
        }
        catch(Exception e){
            System.out.println("Sorry Division by zero not possible");}}
}
class Exceptions{
    public static void main(String args[]){
        MyExceptions e=new MyExceptions();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter first number: ");
        int n1=sc.nextInt();
        System.out.println("\nEnter second number: ");
        int n2=sc.nextInt();
        e.dzero(n1, n2);
    }
}
