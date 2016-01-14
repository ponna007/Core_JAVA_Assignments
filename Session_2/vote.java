import java.util.*;
public class vote {
	
	public static void main(String args[])
	{
		System.out.println("Enter the age");
		Scanner scan = new Scanner(System.in);
		int age=scan.nextInt();
		if(age>18)
		{
			System.out.println("You are eligible to vote");
		}
		else if(age<18)
		{
			System.out.println("You are not eligible to vote");
		}
		
		
	}
}


