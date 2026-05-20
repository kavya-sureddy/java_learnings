
package java_learnings;

import java.util.Scanner;

class Person {
    String Name;
    int Rollnum;
}

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person s1 = new Person();
        Person s2 = new Person();

        System.out.println("Enter Name of S1: ");
        s1.Name = sc.nextLine();
        System.out.println("Enter Rollnum of S1: ");
        s1.Rollnum = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name of S2: ");
        s2.Name = sc.nextLine();
        System.out.println("Enter Rollnum of S2: ");
        s2.Rollnum = sc.nextInt();

        System.out.println("Value of Obj1 s1: " + s1.Name + " " + s1.Rollnum);
        System.out.println("Value of Obj2 s2: " + s2.Name + " " + s2.Rollnum);

        sc.close();
    }
}
