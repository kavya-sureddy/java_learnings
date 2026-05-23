package oops;



class ATM {
    private double balance;
 // Constructor - set initial amount //// CONSTRUCTOR - same name as class, no return type
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
 // Setter - Deposit //METHOD - different name, has return type
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Invalid deposit amount");
        }
    }

    // Setter - Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Error: Invalid or Insufficient balance");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

public class ATMTest {
    public static void main(String[] args) {

        ATM myATM = new ATM(10000);
        
     // print before deposit
        System.out.println("Balance before deposit: " + myATM.getBalance());


        myATM.deposit(5000);
        System.out.println("Current Balance: " + myATM.getBalance());

        myATM.withdraw(2000);
        System.out.println("Current Balance: " + myATM.getBalance());

        myATM.withdraw(9000);  // invalid
        System.out.println("Current Balance: " + myATM.getBalance());

        myATM.deposit(-500);   // invalid
        System.out.println("Current Balance: " + myATM.getBalance());
    }
}