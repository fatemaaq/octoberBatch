package Basic;

public class EntryAccount {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		CurrentAccount a = new CurrentAccount();
		s.addBalance(10);
		a.addBalance(100);
		
		System.out.println(s.balance);
		System.out.println(a.balance);
		
		s.withdrawBalance(20);
		a.withdrawBalance(1);

		System.out.println(s.balance);
		System.out.println(a.balance);
	}
}
