import java.util.*;

public class text1 {

    Scanner obb1 = new Scanner(System.in);
    int length, breadth;

    void getValue() {
        System.out.println("Enter Length :  ");
        length = obb1.nextInt();
        System.out.println("Enter Breadth:  ");
        breadth = obb1.nextInt();

    }
    void getValue1() {
        System.out.println("Enter Length :  ");
        length = obb1.nextInt();
        System.out.println("Enter Breadth:  ");
        breadth = obb1.nextInt();

    }

    void displayResult() {
        System.out.println("Perimeter os rectangle is :  " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {
        text1 obb = new text1();
        obb.getValue();
        obb.getValue1();

        obb.displayResult();
    }
}
