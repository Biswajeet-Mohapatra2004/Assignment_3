import java.util.Scanner;
public class Question4 {

	void game(int user_num) 
	{
		int max_range=9;
		int min_range=1;
		int comp_num= (int)(Math.random()*(max_range-min_range+1)+min_range);
		if(user_num==comp_num) {
			System.out.println("Computer guess: "+comp_num);
			System.out.print("you got it right!! ");
		}
		else if((user_num-1)==comp_num || (user_num+1)==comp_num) {
			System.out.println("Computer guess: "+comp_num);
			System.out.print("You almost got it right!!");
		}
		else {
			System.out.println("Computer guess: "+comp_num);
			System.out.print("you got it wrong!! ");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Question4 ref = new Question4();
		
		System.out.print("Enter a number between 1 to 9: ");
		int user_num=sc.nextInt();
		
		ref.game(user_num);

		
	}

}
