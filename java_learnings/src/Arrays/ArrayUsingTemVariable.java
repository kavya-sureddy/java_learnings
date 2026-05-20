package Arrays;

public class ArrayUsingTemVariable {
	
	public static void main(String[] args) {
	    int[] Grades = new int[3];
			
			Grades[0]=30;
			Grades[1]=70;
			Grades[2]=30;
			
			//temporary variable name can be anything as we like 
			
			for(int i:Grades) {
			
			System.out.println("Value of " + i);	
			}
			
		}

	}


