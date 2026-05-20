package Arrays;

public class arrayD3 {

	public static void main(String[] args) {
		// Create array with size 100
        int[] arr = new int[10];

        // Initialize values
//        1. initialization
//        2. condition check
//        3. loop body/code executes
//        4. update
//        5. condition check again
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i - 10;
        }
        

        // Print values
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

	}

	}
}
