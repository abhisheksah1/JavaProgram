// write a java prograqm to read any number and calculate sum of digit
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int num,digit,rev=0;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = obb.nextInt();
        while (num!=0) {
            digit=num%10;
            rev =(rev*10)+digit;
            num=num/10;
            
        }
        System.out.println("the sum of digit is : "+rev);
    }
}
