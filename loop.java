//write a program to read any number and display all natural number up given number

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int num1;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input any Number:");
        num1 = ob.nextInt();
        ob.close();
        for( int i=1;i<=num1;i++){
            System.out.print(i+ "  ");
        }
    }
}
