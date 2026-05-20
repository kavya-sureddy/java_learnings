package java_learnings;

public class Students {

    String Name;
    int Rollnum;

    public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students();

        s1.Name = "Kavya";
        s1.Rollnum = 1;

        s2.Name = "Sunny";
        s2.Rollnum = 2;

        System.out.println("Value of Obj1 s1: " + s1.Name + " " + s1.Rollnum);

        System.out.println("Value of Obj2 s2: " + s2.Name + " " + s2.Rollnum);
    }
}