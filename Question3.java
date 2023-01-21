import java.util.Scanner;
public class Question3 {

	void number(int num1,int num2, int num3) 
	{
		if(num1>num2 && num1>num3) {
			System.out.print("DECREASING");
		}
		else if(num1<num2 && num1<num3) {
			System.out.print("INCREASING");
		}
		else {
			System.out.print("NEITHER INCREASING NOR DECREASING");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Question3 ref = new Question3();
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int num3 = sc.nextInt();
 
		ref.number(num1, num2, num3);
		
	}

}
