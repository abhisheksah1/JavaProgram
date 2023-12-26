
//write a java program to store 20 integer value and display the largest number?
import java.util.Scanner;

public class arrayLargest {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[100];
        int num1;

        Scanner obb = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        num1 = obb.nextInt();
        System.out.println("Enter arrays number: ");
        for (int i = 0; i < num1; i++) {
            arr[i] = obb.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < num1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("the largest number is : " + max);
    }
}