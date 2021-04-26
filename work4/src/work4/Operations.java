package work4;


public class Operations {

	public static void print(String wordtoPrint) {

		System.out.print(wordtoPrint);
	}

	
	public static void print(char chartoPrint) {

		System.out.print(chartoPrint);
	}

	
	public static void linebreak() {
		System.out.print("\n");
	}

	
	public static void printString(String wordtoPrint) {

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		
		while (i < sizeWordtoPrint) {
			int j = 0;
			while (j < i) {
				print(" ");print(" ");
				j++;
			}
				print(" ");print(" ");print(" ");
				print(wordtoPrint.charAt(i));
				linebreak();
			
			i++; // i = i +1;
		}
	}
	
		public static void printStringH(String wordtoPrint) {

			int i = 0;
		
			int sizeOfWordsIntroduce = wordtoPrint.length();
			while (i < sizeOfWordsIntroduce) {
				print((i + 1) + "  " );
				
				print(wordtoPrint.charAt(i));
			

				i++; // i = i +1;

			}
		}
		
		public static void printStringV(String wordtoPrint) {

			int i = 0;
			linebreak();
			int sizeOfWordsIntroduce = wordtoPrint.length();
			while (i < sizeOfWordsIntroduce) {
				
				print("  " );
				print(wordtoPrint.charAt(i));
				i++; // i = i +1;
				linebreak();

			}
	}
		
		public static void printStringBend(String wordtoPrint) {

			int i = 0;
			linebreak();
			int sizeWordtoPrint = wordtoPrint.length();

			while (i < sizeWordtoPrint) {
				
				int j = 0;
				while (j < i) {
					print("*");
					j++;
				}
				
				print(wordtoPrint.charAt(i));
				linebreak();
				
				i++; // i = i +1;
			}
		}
		
		public static void printStringGion(String wordtoPrint) {

			int i = 0;
			linebreak();
			int sizeOfWordsIntroduce = wordtoPrint.length();
			while (i < sizeOfWordsIntroduce) {
				
				print(" ");
				print(wordtoPrint.charAt(i));
				
				i++; // i = i +1;
				linebreak();
			}
	}
		
		public static void printStringRoundturn(String wordtoPrint) {

			int i = 0;
			linebreak();
			int sizeWordtoPrint = wordtoPrint.length();
			
			while (i < sizeWordtoPrint) {
				int j = 0;
				while (j < i) {
					print(" ");print(" ");
					j++;
				}
				print(wordtoPrint.charAt(i));
				linebreak();
				
				i++; // i = i +1;
			}

			linebreak();
			}
		}
	
	
		

