import java.util.Scanner;
public class SportCenter {
	int i,j;
	double f;
	String s1,s2;
	
	// Attributes
	public String name_of_the_sport_center;
	public Member[] members = new Member[10];
	public int count=0;
	
	// Constructor method
	public SportCenter(String name_of_the_sport_center) {
		this.name_of_the_sport_center = name_of_the_sport_center;
	}
	
	// addMember method
	public void addMember(Member m) {
		//Scanner input = new Scanner(System.in);
		this.members[count] = m;
		count = count + 1;
	}
	
	// search method
	
	public void search(String s1,String s2) {
		/*Scanner searchName = new Scanner(System.in);
		System.out.println("Enter name");
		s1 = searchName.next();
		System.out.println("Enter surname");
		s2 = searchName.next();*/
		for (j=0; j<count; j++){
			if (members[j].getName().equals(s1) && members[j].getSurname().equals(s2))
				members[j].weightStatus();
		}
		//searchName.close();
	}
	// print all members method
	public void printAllMembers() {
		for (j=0; j<count; j++) {
			members[j].display();
		}
	}
}