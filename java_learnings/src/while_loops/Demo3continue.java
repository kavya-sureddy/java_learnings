package while_loops;

public class Demo3continue {

	public static void main(String[] args) {
		int PhoneBattery=40;
		while(PhoneBattery <100)
		{
			PhoneBattery +=5;
			if (PhoneBattery==80)
			continue;
			System.out.println("current battery :" +PhoneBattery);
		}
		System.out.println("Battery LVL out side while loop :" +PhoneBattery);
		}

	}
