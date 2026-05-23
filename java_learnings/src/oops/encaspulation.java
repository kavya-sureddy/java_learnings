package oops;

 class Thermostat {

    private double temperature;

    public void setTemperature(double newTemp) {
        if (newTemp >= 15.0 && newTemp <= 30) {
            this.temperature = newTemp;
            System.out.println("Temperature set to: " + newTemp);
        } else {
            System.out.println("Error: Temp is out of range (15 - 30)");
        }
    }

    public double getTemperature() {
        return temperature;
    }
}

public class encaspulation {

    public static void main(String[] args) {
        Thermostat myRoom = new Thermostat();

        myRoom.setTemperature(22.5);
        System.out.println("current Reading: " + myRoom.getTemperature());

        myRoom.setTemperature(80);
        System.out.println("current Reading after invalid input " + myRoom.getTemperature());
    }
}