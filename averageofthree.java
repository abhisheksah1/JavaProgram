import java.util.*;

public class averageofthree {
    float num1, num2, num3;
    Scanner obb1 = new Scanner(System.in);

    void getVal() {
        System.out.println("Enter 1st number:  ");
        num1 = obb1.nextInt();
        System.out.println("Enter 2nd number:  ");
        num2 = obb1.nextInt();
        System.out.println("Enter 3rd number:  ");
        num3 = obb1.nextInt();
    }

    void getResult() {
        System.out.println("the average os three number is :  " + ((num1 + num2 + num3) / 3));
    }

    public static void main(String[] args) {
        averageofthree ob1 = new averageofthree();
        ob1.getVal();
        ob1.getResult();

        System.out.println("For object 2: ");
        averageofthree ob2 = new averageofthree();
        ob2.getVal();
        ob2.getResult();

        System.out.println("For object 3:  ");
        averageofthree ob3 = new averageofthree();
        ob3.getVal();
        ob3.getResult();

        System.out.println("For object 4");
        averageofthree ob4 = new averageofthree();
        ob4.getVal();
        ob4.getResult();

    }
}
