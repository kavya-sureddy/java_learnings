package oops;

//final class - cannot be extended
final class Vehicle {
 
 String brand = "Toyota";
 
 // final method - cannot be overridden
 public final void start() {
     System.out.println("Vehicle is starting...");
 }
 
 public void stop() {
     System.out.println("Vehicle is stopping...");
 }
}

//class Car extends Vehicle { // ❌ COMPILE ERROR - Vehicle is final, cannot extend
//}

class Engine {
 
 public void show() {
     Vehicle obj = new Vehicle(); // ✅ can create object
     obj.start();
     obj.stop();
     System.out.println("Brand: " + obj.brand);
 }
}

public class finalDemo {
 public static void main(String[] args) {
     
     Engine e = new Engine();
     e.show();
     
     
 }
}

//final class → cannot be extended (no inheritance)
//final method → cannot be overridden in subclass
//final variable → cannot be reassigned (constant)
