//write a program in java to read any three number and calculate their average ?


import java.util.*;
public class average {
    public static void main(String [] args){
float num1,num2,num3, sum,avg;

Scanner ob = new Scanner(System.in);
System.out.println("Enter 1st number: ");
num1 = ob.nextInt();
System.out.println("Enter 2nd number: ");
num2 = ob.nextInt();
System.out.println("Enter 3rd number: ");
num3 = ob.nextInt();
ob.close();
 sum = num1+num2+num3;
System.out.println("the sum of three number is :"+sum);
 avg = (sum/3);
System.out.println("the average of three number is:"+avg);
    }
}
