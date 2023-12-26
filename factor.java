
//write a java program to read any two numbers and calculate sum and display result
import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        int factor = 0;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num1 = obb.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                factor++;
            }
        }
       System.out.println("the factor of a given number is : "+factor);

    }
}
