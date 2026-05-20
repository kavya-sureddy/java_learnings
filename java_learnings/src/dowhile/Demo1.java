package dowhile;

public class Demo1 {

    public static void main(String[] args) {

        int PhoneBattery = 40;

        do {

            PhoneBattery += 5;

            if (PhoneBattery == 80)
                continue;

            System.out.println("Current battery : " + PhoneBattery);

        } while (PhoneBattery < 100);

        System.out.println("Battery level outside while loop : " + PhoneBattery);
    }
}
