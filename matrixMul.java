// write a java program to make 2X3 matrix and calculate sum of  matrix and display it?

import java.util.Scanner;

public class matrixMul {
    public static void main(String[] args) {

        int max1[][] = new int[4][3];
        int max2[][] = new int[3][2];
        int mul[][] = new int[4][2];
        int i, j, k;
        Scanner obb = new Scanner(System.in);

        System.out.println("Enter Matrix1 number: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                max1[i][j] = obb.nextInt();
            }
        }
        System.out.println("Enter Matrix2 number: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                max2[i][j] = obb.nextInt();
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 2; j++) {
                mul[i][j] = 0;

                for (k = 0; k < 3; k++) {
                    mul[i][j] = max1[i][k] * max2[k][j];
                }
            }
        }

        System.err.println("result: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + mul[i][j]);
            }
            System.out.println();
        }

    }
}
