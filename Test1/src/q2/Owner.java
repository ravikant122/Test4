package q2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {
		System.out.println("Owner Default Constructor");
	}
	
	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.nic = nic;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Owner(Owner owner) {
		this.name=owner.name;
		this.dateOfBirth=owner.dateOfBirth;
		this.nic=owner.nic;		
	}
	
	public void input() {
		System.out.println("This is Owner input");		
	}
	
	public void print() {
		System.out.println("This is Owner print");		
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder("");
		s.append("Owner [name = ");
		s.append(name+" ,");
		s.append("Date of birth = ");
		s.append(dateOfBirth.toString()+" ,");
		s.append("nic = ");
		s.append(nic+"] ");
		
		return s.toString();
	}
	
}
