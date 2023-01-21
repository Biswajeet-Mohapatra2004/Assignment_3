import java.util.Scanner;
//Write a program to input the age of a person and check if the age of the person is 
// greater than or equal to 18 then print the message:
//“You are eligible to cast your vote”
public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the person: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.print("You are eligible to cast your vote.");
		}

	}

}
