import java.util.Scanner;
public class Question2 {

	void medication(double water)
	{
	
		if(water>=5000) {
			System.out.print("Alice is following docters advice.");
		}
		else {
			System.out.print("Alice is not following doctors advice.");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// creating a class object to call the void methods
		Question2 ref = new Question2();
		
		System.out.print("Enter the ammount of water drank by Alice in ML: ");
		double water_ammount=sc.nextDouble();
		
		ref.medication(water_ammount);

	}

}
