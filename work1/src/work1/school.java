package work1;

import java.util.Scanner;

public class school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		System.out.println("Tell me your user name:");
		String userName = reader.nextLine();

		System.out.println("Tell me your type of user:");
		String userType = reader.nextLine();

		System.out.println("Tell me the amount of your buy:");
		int userBuy = reader.nextInt();
		
		System.out.println("Do you like it product? true or false:");
		boolean userOpinion = reader.nextBoolean();
			
		
		System.out.println("\nUser:");
		System.out.println("-------------------------\n");
		System.out.println("User Name: " + userName );
		System.out.println("User Type: " + userType );
		System.out.println("User Buy: " + userBuy );
		System.out.println("User Opinion: " + userOpinion );
	
		
	}

}
