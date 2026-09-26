import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int N = sc.nextInt();

        int[] arr = new int[N];   // Creating array

        // Taking input
        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Printing array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}