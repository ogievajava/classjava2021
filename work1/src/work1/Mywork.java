package work1;

import java.util.Scanner;

public class Mywork {

	public static void main(String[] args) {

			System.out.println("How are you?");
			System.out.println("Answer when you can ");
	
	
		Scanner name = new Scanner (System.in);
		
		String namecon = name.nextLine();
		
		
		if (namecon.equals("James"))
		{
			System.out.println(namecon + "Answer when you can "); 
		 }
		
	}
	
}