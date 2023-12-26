// write a java program to mak it?

import java.util.Scanner;

public class transposeOfmatrix {
    public static void main(String[] args) {

        int arr1[][] = new int[4][3];        
         int i, j;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter arrays1 number: ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                arr1[i][j] = obb.nextInt();
            }
        }
       System.out.println("Transpose is: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(" "+arr1[j][i]);
            }
            System.out.println();
        }     
    }
}
