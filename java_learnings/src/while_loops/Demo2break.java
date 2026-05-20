package while_loops;

public class Demo2break {

	public static void main(String[] args) {
		int PhoneBattery=80;
		while(PhoneBattery <190)
		{
			PhoneBattery +=5;
			System.out.println("current battery :" +PhoneBattery);
			if (PhoneBattery==120)
			break;
		}
		System.out.println("Battery LVL out side while loop :" +PhoneBattery);
		}

	}

