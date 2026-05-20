package Arrays;

public class ArrayD4 {

    public static void main(String[] args) {

        int[] array = new int[20];

        // Initialize values
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Enhanced for loop
        for(int kavya : array) {

            System.out.println(kavya);
        }
    }
}
