public class Member {
	// Attributes
	private int memberID;		// member id
	private String name;		// member name
	private String surname;		// member surname
	private double height;		// member height
	private double weight;			// member weight
	
	// Constructor method
	public Member(int memberID, String name, String surname, double height, double weight){
		this.memberID=memberID;
		this.name=name;
		this.surname=surname;
		this.height=height;
		this.weight=weight;
	}
	
	// Get / Set method
	public int getMemberID() { return memberID; }
	public void setMemberID(int MemberID) { this.memberID = MemberID; }
	public String getName() { return name; }
	public void setName(String Name) { this.name = Name; }
	public String getSurname() { return surname; }
	public void setSurname(String Surname) { this.surname = Surname; }
	public double getHeight() { return height; }
	public void setHeight(double Height) { this.height = Height; }
	public double getWeight() { return weight; }
	public void setWeight(double Weight) { this.weight = Weight; }
	
	// Display method
	public void display() {
		System.out.println("Id:" + this.getMemberID() + " Name:" + this.getName() + " Surname:" + this.getSurname() + " Weight:" + this.getWeight() + " Height:" + this.getHeight());
	}
	
	// BMI method
	public double getBMI() {
		double BMI = weight / (height * height);
		return BMI;
	}
	
	// Weight status method
	public void weightStatus() {
		if (getBMI() < 18.5) {
			System.out.println("Underweight");
		}
		else if (getBMI() <= 24.9) {
			System.out.println("Normal");
		}
		else if (getBMI() <= 29.9) {
			System.out.println("Overweight");
		}
		else if (getBMI() <= 34.9) {
			System.out.println("Obese");
		}
		else {
			System.out.println("Extremely obese");
		}
	}	
}