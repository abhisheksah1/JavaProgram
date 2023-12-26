// write a java prograqm to read any number and calculate sum of digit
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        int num,digit,sum=0;
        Scanner obb = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = obb.nextInt();
        while (num!=0) {
            digit=num%10;
            sum=sum+digit;
            num=num/10;
            
        }
        System.out.println("the sum of digit is : "+sum);
    }
}
