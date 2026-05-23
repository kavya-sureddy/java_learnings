package oops;

class Animal {

    void makeSound() {
        System.out.println("Animal make sound");
    }

    void legs() {
        System.out.println("4 leg animals");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("The Dog barks");
    }

    void dogInfo() {
        System.out.println("Dogs are pet animals");
    }
}

public class polyOverriding {

    public static void main(String[] args) {
//    	ClassName objectName = new ClassName();
        Dog myDog = new Dog();
        myDog.dogInfo();
        myDog.legs();
        myDog.makeSound();  // calls Dog's makeSound (overridden)
    }
}