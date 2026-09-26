import java.util.Scanner;

public class MaxMinMath {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maximum = Math.max(a, Math.max(b, c));
        int minimum = Math.min(a, Math.min(b, c));

        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

        sc.close();
    }
}