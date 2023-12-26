import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int num1;
        Scanner ob = new Scanner(System.in);
        System.out.println("Input First Number:");
        num1 = ob.nextInt();
        ob.close();
        for( int i=1;i<=num1;i++){
        int res = num1*i;
        System.out.println(num1+" X "+i+" = "+res);
        }
        
    }
}

