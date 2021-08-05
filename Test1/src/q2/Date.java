package q2;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		System.out.println("Date Default Constructor");		
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}
	
	public void input() {
		System.out.println("This is Date input");
	}
	
	public void print() {
		System.out.println("This is Date print");		
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder("");
		s.append("Date [day = ");
		s.append(day+" ,");
		s.append("month = ");
		s.append(month+" ,");
		s.append("year = ");
		s.append(year+"] ");
		
		return s.toString();
	}
}
