
//write a java program to read any two numbers and calculate sum and display result
import java.util.Scanner;

public class nested  {
    public static void main(String[] args) {
        
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num1 = obb.nextInt();
        for (int i = num1; i >= 1; i--) {
           for(int j=1;j<=i;j++){
            System.out.print(j+" ");
           }
           System.out.println();
        }       
    }
}
