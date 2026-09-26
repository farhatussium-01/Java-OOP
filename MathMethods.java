import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.println("Absolute value: " + Math.abs(num));
        System.out.println("Floor value: " + Math.floor(num));
        System.out.println("Ceil value: " + Math.ceil(num));
        System.out.println("Round value: " + Math.round(num));
        System.out.println("Square root: " + Math.sqrt(num));

        sc.close();
    }
}