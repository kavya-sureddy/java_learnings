package java_learnings;

class Student {
    String Name;
    int Rollnum;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.Name = "Kavya";
        s1.Rollnum = 1;

        s2.Name = "Sunny";
        s2.Rollnum = 2;

        System.out.println("Value of Obj1 s1: " + s1.Name + " " + s1.Rollnum);
        System.out.println("Value of Obj2 s2: " + s2.Name + " " + s2.Rollnum);
    }
}