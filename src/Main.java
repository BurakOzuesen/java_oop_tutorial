import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	int command = 0;
	String s1,s2;
	double i;
	int	count=0;
	double f;
	SportCenter Gym = new SportCenter("BurakGYM");

	Scanner scan = new Scanner(System.in);
		// display menu
		while (command != 4){
			System.out.println("1-Add a new member");
			System.out.println("2-Display all members");
			System.out.println("3-Search");
			System.out.println("4-Exit");
			System.out.println("Enter your choose");			
			command = Integer.valueOf(scan.next());			
			switch ( command ) {
			case 1:
				if (count >= 10){
					System.out.println("Capacity is full!");
					System.out.println();
					break;
				}
				Member client = new Member(count,"name","surname",(double)0,(double)0);
				client.setMemberID(count);
				System.out.println("Enter name");
				s1 = scan.next();
				client.setName(s1);
				System.out.println("Enter surname");
				s2 = scan.next();
				client.setSurname(s2);
				System.out.println("Enter weight");
				i = scan.nextDouble();
				client.setWeight(i);				
				System.out.println("Enter height");
				f = scan.nextDouble();
				client.setHeight(f);
				count = count + 1;
				Gym.addMember(client);
				System.out.println();
				break;
			case 2:
				Gym.printAllMembers();
				System.out.println();
				break;
			case 3:
				System.out.println("Enter name");
				s1 = scan.next();
				System.out.println("Enter surname");
				s2 = scan.next();
				Gym.search(s1,s2);
				System.out.println();
				break;
			case 4:
				break;
			}	
		}
		scan.close();
	}}