import java.util.Scanner;
public class Home_assignment_5 {
	Scanner refn = new Scanner(System.in);
	void male(int age, String name, String surname) {
		if(age>=20) {
			System.out.println("Then I shall call you Mr. "+name+".");
		}
		else {
			System.out.print("Then I shall call you "+name+" "+surname+".");
		}
		
	}
	void female(int age,String name,String surname) {
		if(age>=20) {
			System.out.print("Are you married "+name+" [Y or N]: ");
			String marital_status=refn.next();
			if(marital_status=="Y") {
				System.out.println("Then i shall call you Mrs "+name+" "+surname+".");
			}
			else {
				System.out.println("Then i shall call you Ms "+name+".");			}
		}
		else {
			System.out.println("Then i shall call you "+name+" "+surname+".");
		}
	}

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		Home_assignment_5 reference = new Home_assignment_5();
		System.out.println("Enter your Gender: ");
		System.out.println("M-male\nF-female");
		char user_gender=ref.next().charAt(0);
		if(user_gender=='M'|| user_gender=='m') {
			System.out.println("Enter your age: ");
			int age=ref.nextInt();
			System.out.print("Enter your first name: ");
			String name=ref.next();
			System.out.print("Enter your last name: ");
			String surname=ref.next();
			reference.male(age,name,surname);
			
		}
		else {
			System.out.println("Enter your age: ");
			int fage=ref.nextInt();
			System.out.print("Enter your first name: ");
			String fname=ref.next();
			System.out.print("Enter your last name: ");
			String fsurname=ref.next();
			reference.female(fage,fname,fsurname);
		}	
	}

}
