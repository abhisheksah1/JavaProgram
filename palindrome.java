
// write a java prograqm to read any number and calculate sum of digit
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int num, digit, rev = 0;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = obb.nextInt();
        int temp = num;
        while (num != 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("the given number is palindrome : " + temp);
        } else {
            System.out.println("the given number is not palindrome:" + temp);
        }

    }
}
