import java.io.*; 
import java.util.*;

class StringBuffer
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        StringBuffer str=new StringBuffer("India");     System.out.println("\n1.Length\n2.Capacity\n3.Setlength\n4.Charatin\n5.Setcharat\n6.Appendin\n7.Deletecharat\n8.Substring\n9.Substring\n10.Insertin\n11. Reverse");
        int ch=0;
        while(ch!=12){
            System.out.println("Enter ur choice");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("The length of the string is:" +str.length());
                    break;
                case 2:
                    System.out.println("The capacity of String:" + str.capacity());
                    break;
                case 3:
                    str.setLength(15);
                    System.out.println("Set length of String:" + str.length());
                    break;
                case 4:
                    System.out.println("The character at 2nd position:" + str.charAt(2));
                    break;
                case 5:
                    str.setCharAt(2, 'u');
                    System.out.println("The string after setting position is:" +str);
                    break;
                case 6:
                    System.out.println("The string after appending:" + str.append("Sohn"));
                    break;
                case 7:
                    System.out.println("The string after deletion:" + str.deleteCharAt(1)); 
                    break;
                case 8:
                    System.out.println("The substring1 is:" + str.substring(2)); 
                    break;
                case 9: 
                    System.out.println("The subsstring2 is:" +str.substring(2,4));
                    break;
                case 10:
                    System.out.println(" The string after insertion is:" + str.insert(1,'m')); 
                    break;
                case 11:
                    System.out.println("The string after reverse is:"+ str.reverse()); 
                    break;
                default:
                    System.out.println("You have Entered wrong choice"); 
            }
            ch++;
        }
    }
}
