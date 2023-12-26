    //write a java program to read length and breadth of rectangle and calculate its perimeter


import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        int length, breadth, perimeter;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input Length:");
        length = ob.nextInt();
        System.out.println("Input Breadth");
        breadth = ob.nextInt();
        ob.close();
        perimeter = 2*(length+breadth);
        System.out.println("The perimeter of rectangle is : " + perimeter);
         

    }
}



