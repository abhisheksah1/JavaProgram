
//write a java program to read any two numbers and calculate sum and display result
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input First Number:");
        num1 = ob.nextInt();
        System.out.println("Input Second Number");
        num2 = ob.nextInt();
        ob.close();
        sum = num1 + num2;
        System.out.println("Sum of two number is : " + sum);

    }
}
