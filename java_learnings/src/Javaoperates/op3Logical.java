package Javaoperates;

public class op3Logical {

	public static void main(String[] args) {
		int age = 25;

		System.out.println(age > 30 && age < 60); // false
		System.out.println(age > 30 || age < 60); // true
		System.out.println(!(age > 18));          // false

	}

}
