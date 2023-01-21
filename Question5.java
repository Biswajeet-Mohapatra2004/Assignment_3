import java.util.Scanner;
public class Question5 {

	void leap_year(int year) 
	{
		if(year%4==0 || year%100 ==0 || year%400==0) {
			System.out.print(year+" is a leap year");
		}
		else {
			System.out.print(year+" is not a leap year");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Question5 ref = new Question5();
		
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		ref.leap_year(year);

	}

}
