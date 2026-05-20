package Javaoperates;

public class op5increment {

	public static void main(String[] args) {
		
	
		int a = 5;
		int b=6;

		a++;
		b--;

		System.out.println(a); // 6
		System.out.println(b);
		
		int c = 10;

		System.out.println(-c); // -10 // Unary operators
		
		int age = 20;
		
		//condition ? true_value : false_value

		String result = (age >= 18) ? "Eligible" : "Not Eligible"; // Ternary operator

		System.out.println(result);
		
		//| Type  | Action                    |
		//| ----- | ------------------------- |
		//| `++a` | Increase first, use later |
		//| `a++` | Use first, increase later |

		
		int x = 10;

		System.out.println(++x); // 11
		System.out.println(x++); // 11
		System.out.println(x);   // 12

	}

}
