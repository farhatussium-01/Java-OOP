import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers are:");

        for (int i = 0; i < N; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }

        }

        sc.close();
    }
}
