
public class TestBankAccount {

	public static void main(String[] args) {
		// Create BanAccount object and test the methods
		BankAccount b = new BankAccount();
		b.promptAccountDetails();
		b.deposit(23);
		b.displayDetails();
	}

}
