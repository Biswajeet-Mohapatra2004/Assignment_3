import java.util.Scanner;
public class Temp_prog1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.println("enter num1  :");
		num1=sc.nextInt();
		System.out.println("enter num2  :");
		num2=sc.nextInt();
		System.out.println("enter num3  :");
		num3=sc.nextInt();
		System.out.println("enter num4  :");
		num4=sc.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				if(num1>num4){
					System.out.println("num1 is greater");
				}
				else{
					System.out.println("num4 is greater");
				}
			}
			else {
				if(num2>num3) {
					if(num2>num4) {
						System.out.println("num2 is greater");
					}
					else {
						System.out.println("num4 is greater");
					}	
				}
				else {
					System.out.println("num3 is greater");
				}
			}
		}
		else {
			if(num2>num3) {
				if(num2>num4) {
					System.out.println("num2 is greater");
				}
				else {
					System.out.println("num4 is greater");
				}	
			}
			else {
				if(num3>num4) {
					System.out.println("num3 is greater");
				}
				else {
					System.out.println("num4 is greater");
				}
			}
		}
	}
}
