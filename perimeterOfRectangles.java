import java.util.*;

public class perimeterOfRectangles {

    int length, breadth;

    void getValue(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    void displayResult() {
        System.out.println("Perimeter os rectangle is :  " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {
        perimeterOfRectangles obb = new perimeterOfRectangles();
        obb.getValue(2, 2);
        obb.displayResult();
    }
}
