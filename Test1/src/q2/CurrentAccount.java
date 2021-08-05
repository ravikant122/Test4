package q2;

public class CurrentAccount extends Account{
	private float minimumBalance;

	public CurrentAccount() {
		System.out.println("SavingAccount Default Constructor");
	}

	public CurrentAccount(CurrentAccount currentAccount) {
		super(currentAccount);
		this.minimumBalance=currentAccount.minimumBalance;
	}
	
	public void input() {
		System.out.println("This is CurrentAccount input");		
	}
	
	public void print() {
		System.out.println("This is CurrentAccount print");		
	}
	
	public float getCharges() {
		if(super.getBalance()<minimumBalance)
			return 1000;
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder s=new StringBuilder(super.toString());
		s.append("CurrentAccount [minimumBalance = ");
		s.append(minimumBalance+"] ");
		
		return s.toString();
	}
}
