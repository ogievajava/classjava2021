package work1;

import java.util.Scanner;

public class Mywork {

	public static void main(String[] args) {

			int discount = 0;
			int totalDiscount = 0;
			int amountTopay = 0;
			// scope #6
			Scanner reader = new Scanner(System.in);
			System.out.println("Tell me your client name:");
			String clientName = reader.nextLine();

			System.out.println("Tell me your type of client:");
			String clientType = reader.nextLine();

			System.out.println("Tell me the amount of your buy:");
			int clientBuy = reader.nextInt();
			
			if (clientType.equals("vip")) {
			discount = 25;
			totalDiscount = clientBuy * 25/100;
			amountTopay = clientBuy - totalDiscount;
			
			}else if (clientType.equals("Regular")) {
			discount = 15;
			
			}else if (clientType.equals("New")) {
			discount = 0;
				
			}else {
				System.out.println("Hello " + clientName + ", YOU ARE NOT A REGISTERED MEMBER");
			}
			
			
			System.out.println("\nclient:");
			System.out.println("-------------------------\n");
			System.out.println("client Name: " + clientName);
			System.out.println("client Type: " + clientType);
			System.out.println("client Buy: " + clientBuy);
			System.out.println("Your discout is: " + discount);
			System.out.println("Your total discout is: " + totalDiscount);
			System.out.println("You have to pay : " + amountTopay + "\n");
			
				
			// I am closing the while so also the while scope
		}

	

	public static void methodToTestScope() {
		// scope number #5
		// here i don't see variables from other scopes
		// clientName <<<< i don't see this variable from scope #2
		// reader <<<< i don't see this variable from scope #2

	}
}