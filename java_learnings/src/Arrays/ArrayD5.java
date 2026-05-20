package Arrays;
import java.util.Scanner;

public class ArrayD5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking input
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Printing array
        System.out.println("Array elements are:");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}