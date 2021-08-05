package q2;

public class SavingAccount extends Account{
	private float interestRate;

	public SavingAccount() {
		System.out.println("SavingAccount Default Constructor");
	}

	public SavingAccount(SavingAccount savingAccount) {
		super(savingAccount);
		this.interestRate=savingAccount.interestRate;
	}
	
	public void input() {
		System.out.println("This is SavingAccount input");		
	}
	
	public void print() {
		System.out.println("This is SavingAccount print");		
	}
	
	public float getInterest() {
		return super.getBalance()*interestRate ;
	}

	@Override
	public String toString() {
		StringBuilder s=new StringBuilder(super.toString());
		s.append("SavingAccount [interestRate = ");
		s.append(interestRate+"] ");
		
		return s.toString();
	}
	
}
