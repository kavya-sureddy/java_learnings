package oops;
//
//What this does:
//
//Two interfaces Camera and Musicplayer each declare one abstract method
//smartPhone class implements both interfaces, providing concrete implementations for both methods
//In main, a smartPhone object is created and both methods are called
//
//This is a classic example of multiple interface implementation in Java — the way Java achieves multiple inheritance behavior.
//
//In Java, interface methods are implicitly abstract by default — you don't need to write the abstract keyword explicitly.
//
//Why?
//Because in an interface:
//
//Every method is public and abstract by default
//Every variable is public, static and final by default
//
//So Java automatically treats void takePhoto(); as public abstract void takePhoto(); behind the scenes.
//
//Simple rule to remember:
//
//If a method has no body (no { }), it is abstract — keyword or not.
//
//That's why when smartPhone implements Camera, it must provide the body — otherwise compiler throws an error.

interface Camera{
    void takePhoto();
}

interface Musicplayer{
    void playMusic();
}

class smartPhone implements Camera, Musicplayer {

    public void takePhoto() {
        System.out.println("Capture the photo");
    }

    public void playMusic() {
        System.out.println("Play Music");
    }
}

public class InterfaceDemo{

    public static void main(String[] args) {

        smartPhone myPhone = new smartPhone();

        myPhone.takePhoto();
        myPhone.playMusic();
    }
}