
// write a java program to read any string and display either palindrome or not
import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = obb.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str+" is a Palindrome");

        } else {
            System.out.println(str+" is Not Palindrome");
        }
    }
}
