
//write a java program to read any two numbers and calculate sum and display result
import java.util.Scanner;

public class fibonnicSeries {
    public static void main(String[] args) {
        int num=0,num2=1,sum=0,val;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number :");
         val = obb.nextInt();
         System.out.print(" Fibonnicc Series of "+ val +" : "); 
        for (int i = 1; i <= val; i++) {
            System.out.print( " "+num);
            sum=num+num2;
            num=num2;
            num2=sum;
            

        }
        

    }
}

