import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Roll No.: ");

        int rollno=scanner.nextInt();

        System.out.println("Enter your name: ");

        String name=scanner.next();

        System.out.println("Enter your percentage: ");

        float percentage=scanner.nextFloat();

        System.out.println("Roll no: "+rollno+"\nName: "+name+"\nPercentage: "+percentage);

    }
}
