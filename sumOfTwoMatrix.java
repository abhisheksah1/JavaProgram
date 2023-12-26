// write a java program to make 2X3 matrix and calculate sum of  matrix and display it?

import java.util.Scanner;

public class sumOfTwoMatrix {
    public static void main(String[] args) {

        int arr1[][] = new int[3][4];
        int arr2[][] = new int[3][4];
        int sum[][] = new int[3][4];
        int i, j;
        Scanner obb = new Scanner(System.in);

        System.out.println("Enter arrays1 number: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arr1[i][j] = obb.nextInt();
            }
        }
        System.out.println("Enter arrays2 number: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arr2[i][j] = obb.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.err.println("result: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(" " + sum[i][j]);
            }
            System.out.println();
        }

    }
}
