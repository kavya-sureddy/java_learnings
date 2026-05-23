package oops;

class Outer {
    
    // Private class - only accessible within Outer
    private class Inner {
        void message() {
            System.out.println("I am inside Private Inner Class");
        }
    }
    
    // Outer class method using Inner class
    public void accessInner() {
        Inner obj = new Inner(); // ✅ works - same class
        obj.message();
    }
}

// Separate public class in same file
public class PrivateClassTest {
    public static void main(String[] args) {
        
        Outer outer = new Outer();
        outer.accessInner(); // ✅ works - calling via Outer method
        
        // Outer.Inner obj = new Outer().new Inner(); // ❌ COMPILE ERROR - Inner is private
    }
}