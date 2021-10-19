package Basic;

public class SavingsAccount extends Account{

	boolean withdrawBalance(double amt) {
		if(amt <= this.balance)
		{
			this.balance -= amt;
			return true;
		}
		return false;
	}
}
