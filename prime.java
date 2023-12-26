
//write a java program to read any two numbers and calculate sum and display result
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int count = 0;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num1 = obb.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num1 + " is a prime number");
        } else {
            System.out.println(num1 + " is a composite number");
        }

    }
}
