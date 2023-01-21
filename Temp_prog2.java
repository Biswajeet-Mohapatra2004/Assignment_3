import java.util.Scanner;
public class Temp_prog2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select current day from 0 to 6: ");
		int day=sc.nextInt();
        if(day>=0 && day<=6) {
        	switch(day) {
              case 0:
  			      System.out.println(" today is sunday");
  			      break;
  		      case 1:
  			      System.out.println(" today is monday");
  			      break;
  		      case 2:
  			      System.out.println("today is tuesday");
  			      break;
  		      case 3:
  			     System.out.println("today is wednesday");
  			     break;
  		      case 4:
  			      System.out.println(" today is thursday");
  		 	      break;
  		      case 5:
  			      System.out.println("today is friday");
  			      break;
  		      case 6:
  			     System.out.println(" today is saturday");
  			     break;	  
        	
        	}
        	System.out.println("Enter a number whose day you want to find after today: ");
    		int no_days=sc.nextInt();
    		int nextday=(day+no_days)%7;
    		switch(nextday) {
    		case 0:
    			  System.out.println(no_days+" days after today is sunday");
    			  break;
    		case 1:
    			  System.out.println(no_days+" days after today is monday");
    			  break;
    		case 2:
    			  System.out.println(no_days+" days after today is tuesday");
    			  break;
    		case 3:
    			  System.out.println(no_days+" days after today is wednesday");
    			  break;
    		case 4:
    			  System.out.println(no_days+" days after today is thursday");
    			  break;
    		case 5:
    			  System.out.println(no_days+" days after today is friday");
    			  break;
    		case 6:
    			  System.out.println(no_days+" days after today is saturday");
    			  break;	  
    		}
        }
        else {
        	System.out.println("Enter a valid number from 0 to 6:");
        }
    		
	}

}
