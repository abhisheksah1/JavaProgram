import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner obb = new Scanner(System.in);
        int num;
        int[] marks = new int[100];
        System.out.println("Enter any number: ");
        num = obb.nextInt();
        System.out.println("Enter Arrays number number");
        for (int i = 0; i < num; i++) {
            marks[i] = obb.nextInt();
        }
        for(int element:marks){
            System.out.println(element);
        }
    }
}
