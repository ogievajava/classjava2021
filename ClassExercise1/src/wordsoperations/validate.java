package wordsoperations;

import java.util.Scanner;

public class validate {
	
	public static boolean valLoginAccount(Scanner reader, String user, String password ) {
		
		System.out.println(user);
		System.out.println(password);
		

		int count = 1;
		String userConsole = reader.nextLine();
		String userPasswordConsole = reader.nextLine();;
		
		do {
			count++;
			
		} while (count < 4); {
			 if (userConsole == user && userPasswordConsole == password) {
				 
			 }
			
		}
		return false;
	}

}
