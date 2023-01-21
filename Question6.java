import java.util.Scanner;
public class Question6 {

	void calculate_bill(int units_adv) 
	{
		if(units_adv<50) {
			double bill=units_adv*3.0;
			System.out.print("The bill is = "+bill+" Rupees");
		}
		else if(units_adv>=50 && units_adv<200) {
			double bill=(50*3.0)+((units_adv-50)*4.80);
			System.out.print("The bill is = "+bill+" Rupees");
		}
		else if(units_adv>=200 && units_adv<400) {
			double bill=(50*3.0)+(150*4.80)+((units_adv-200)*5.80);
			System.out.print("The bill is = "+bill+" Rupees");
		}
		else if(units_adv>=400) {
			double bill=(50*3.0)+(150*4.80)+(200*5.80)+((units_adv-400)*6.20);
			System.out.print("The bill is = "+bill+" Rupees");
		}
		else {
			System.out.print("Invalid input.");
		}

	}
	public static void main(String[] args) 
	{
		
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter the number of units");
	   int units_adv=sc.nextInt();
	   
	   Question6 ref = new Question6();
	   ref.calculate_bill(units_adv);
	   

	}

}