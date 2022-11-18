package Hw1_5.Entity;


// Implement SavingsAccount class
public class SavingsAccount extends Account {

	
	/** Construct a default CheckingAccount object */
	public SavingsAccount(int balance) {
		super(balance);
	}

	/** Construct a SavingsAccount with specified id, balance */
	public SavingsAccount(String name, int balance) {
		super(name, balance);
	}

	/** Decrease balance by amount */
	public void withdraw(int amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}

}