
//write a java program to read three number and find the middle number among three?
import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input First Number:");
        num1 = ob.nextInt();
        System.out.println("Input Second Number");
        num2 = ob.nextInt();
        System.out.println("Input third Number");
        num3 = ob.nextInt();
        ob.close();
        if (num1 < num2 && num1 > num3) {
            System.out.println("The midddle number is :- " + num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println("The midddle number is :- " + num2);
        } else {
            System.out.println("The midddle number is :- " + num3);
        }
    }
}
