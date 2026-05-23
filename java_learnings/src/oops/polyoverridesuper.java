package oops;

class Animals {

    void makeSound() {
        System.out.println("Animal make sound");
    }

    void legs() {
        System.out.println("4 leg animals");
    }
}

class Cat extends Animals {

    void makeSound() {
    	
    	super.makeSound(); 
    	
        System.out.println("The Cat Mewos");
    }

    void CatInfo() {
        System.out.println("Cats are pet animals");
    }
}

public class polyoverridesuper {

    public static void main(String[] args) {
        Cat myCat = new Cat();
       
        myCat.CatInfo();
        myCat.makeSound();  // calls Cat's makeSound (overridden)
        myCat.legs();
    }
}