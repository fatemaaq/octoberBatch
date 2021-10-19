package Basic;

public class CurrentAccount extends Account{

	boolean withdrawBalance(double amt) {
		if(amt <= this.balance)
		{
			this.balance -= (amt + (0.1 * amt));
			return true;
		}
		return false;
	}

}
