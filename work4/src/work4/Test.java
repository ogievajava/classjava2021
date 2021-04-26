package work4;


import java.util.Scanner;

public class Test {

		public static void main(String[] args) {

			
			Scanner reader = new Scanner (System.in);
			System.out.println("Write some string ...");
			String word = reader.nextLine();
			
			Operations.print(word);
			System.out.println("\n");
			
			Operations.linebreak();
			Operations.printString(word);
			System.out.println("\n");
			
			Operations.printStringH(word);
			System.out.println("\n");
			
			Operations.printStringV(word);
			System.out.println("\n");
			
			Operations.printStringGion(word);
			System.out.println("\n");
			
			Operations.printStringBend(word);
			System.out.println("\n");
			
			System.out.println("Bye bye my friend...");
			
			
			
		}

	}

