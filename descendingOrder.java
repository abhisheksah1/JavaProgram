
//write a java program to store 20 integer value and display in descending order?
import java.util.Scanner;

public class descendingOrder {
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

        for (int i = 0; i < num1; i++)
        {
            for (int j = i + 1; j < num1; j++)
            {
                if (arr[i] < arr[j])
                {
                   int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        for (int i = 0; i < num1; i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}