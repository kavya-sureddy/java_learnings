package MenthodsFunctions;
//Example program for abstract class and method

abstract class Vehicle {

    abstract void startEngine();

    static void industryInfo() {
        System.out.println("Industry: Transport Ind");
    }

    void fuelStatus(String model, int level) {
        System.out.println("Model : " + model + "Fuel Status:" + level);
    }
}

class car extends Vehicle {

    void startEngine() {
        System.out.println(" car: Start the car using a push button");
    }
}

public class MethodComparion {

    public static void main(String[] args) {

        Vehicle.industryInfo();

        car myCar = new car();

        myCar.fuelStatus("Tata Harrier", 70);

        myCar.startEngine();
    }
}
