
//write a java program to store any ten integer value and display this array value
import java.util.Scanner;

public class arr {
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
        System.out.println("Array Values");
        for (int i = 0; i < num1; i++) {
            System.out.println("array: " + i + "    " + arr[i]);
        }

    }
}
