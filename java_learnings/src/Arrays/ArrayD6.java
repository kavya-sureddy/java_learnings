package Arrays;

public class ArrayD6 {

	public static void main(String[] args) {
		
		int[] array=new int[20];
		
	for(int i=0; i<array.length ; i++) {
		array[i] = i + 1;
	}
			
			//for( int kavya:array)
			
		for(int i = 0; i < array.length; i++) {
		
		    System.out.println("Value of : " + i + "\tindex " + array[i]);
		}
		
		
	}

}

