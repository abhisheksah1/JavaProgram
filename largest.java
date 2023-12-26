
//write a java program to read any three number 

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input First Number:");
        num1 = ob.nextInt();
        System.out.println("Input Second Number");
        num2 = ob.nextInt();
        System.out.println("Input Third Number");
        num3 = ob.nextInt();
        ob.close();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest  number is:- " + num1);
            } else {
                System.out.println("Largest  number is:- " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Largest  number is:- " + num2);
            } else {
                System.out.println("Largest  number is:- " + num3);
            }
        }
    }
}
