package q2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;
	
	public Account() {
		System.out.println("Account Default Constructor");
	}
	
	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}
	
	public Account(Account account) {
		this.owner=account.owner;
		this.balance=account.balance;
		this.number=account.number;
	}
	
	public void input() {
		System.out.println("This is Account input");		
	}
	
	public void print() {
		System.out.println("This is Account print");		
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder(owner.toString());
		s.append("Account [balance = ");
		s.append(balance+" ,");
		s.append("number = ");
		s.append(number+"] ");
		
		return s.toString();
	}
	
	public void deposit() {
		System.out.println("Amount deposited");
	}
	
	public void withdraw() {
		System.out.println("Amount withdrawed");
	}
	
	public float getBalance() {
		return balance;
	}
}
