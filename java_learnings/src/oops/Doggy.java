package oops;

class Anim {

	    protected void makeSound() {
	        System.out.println("Animal makes sound");
	    }
	}
public class Doggy extends Anim {

	    public static void main(String[] args) {

	        Doggy d = new Doggy();

	        d.makeSound();   // accessing protected method
	    }
	}

