package MenthodsFunctions;

//<returntype> < method name> <parameters>
//{
//   1.basic method
//   2.parameterized menthod(return type)
//   3. aruguments and return type
//}

public class mtds {
	
          public void displayname() 
		{
			
			System.out.println("=========Student Details=======-");

		}
		
		
		public void printStudentDetails(String name, int rollNo)
		{
			
			System.out.println("Student Name: " + name);
			System.out.println("Student Roll No: " + rollNo);
			
		}
		
		public double calPercentage(int obtainedMarks, int totalMarks)
		
		{
			double percentage = ((double)obtainedMarks/totalMarks) * 100;
			
			return percentage;
			
		}
	  
	  public static void main(String[] args)
	  {	  
		  
		  mtds asst = new mtds();
		  
		  asst.displayname();
		  
		  System.out.println("after first method call");
		  
		  asst.printStudentDetails("kavya", 123456);
		  
		  System.out.println("after second method call");
		  
		double perc =  asst.calPercentage(543, 600);
		  
		  System.out.println ("Final Marks: " + perc );
	}
	}
