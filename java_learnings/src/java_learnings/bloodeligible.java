package java_learnings;

public class bloodeligible {

	public static void main(String[] args) {
		int age = 2;
		int weight = 60;
		
		if (age>=18) {
			if (weight>60) 
			{
				System.out.println("you are eligible to donate blood");
		     }
			else 
			{
				System.out.println("you age is met and weight is not match to donate blood");
			}
		}
		else
		{
			System.out.println("you age is less than 18");
		}

	}

}
