import java.util.Scanner;
public class Question7 {

	void calculate_bill(int units_adv) 
	{
		Scanner reference = new Scanner(System.in);
		double bill=0;
		if(units_adv<50) {
			bill=units_adv*3.0;
			System.out.println("NO. of units consumed: "+units_adv);
				
		}
		else if(units_adv>=50 && units_adv<200) {
			bill=(50*3.0)+((units_adv-50)*4.80);
			System.out.println("NO. of units consumed: "+units_adv);
			
		}
		else if(units_adv>=200 && units_adv<400) {
			bill=(50*3.0)+(150*4.80)+((units_adv-200)*5.80);
			System.out.println("NO. of units consumed: "+units_adv);
			
		}
		else if(units_adv>=400) {
			bill=(50*3.0)+(150*4.80)+(200*5.80)+((units_adv-400)*6.20);
			System.out.println("NO. of units consumed: "+units_adv);
			
		}
		else {
			System.out.print("Invalid input.");
		}
		System.out.println("Do you want to pay online[Y/N] : ");
		String user_reply=reference.next();
		switch(user_reply) {
		case "Y":
			System.out.println("The bill is = "+bill+" Rupees");
			double discount=0.03*bill;
			System.out.println("The discount is: "+discount);
			double payable=bill-discount;
			System.out.println("total payable = "+payable);
			break;
			
		case "N":
			System.out.print("The bill is = "+bill+" Rupees and");
			break;			
		}

	}
	public static void main(String[] args) 
	{
		
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter the number of units: ");
	   int units_adv=sc.nextInt();
	   
	   Question7 ref = new Question7();
	   ref.calculate_bill(units_adv);
	   
	   

	}

}