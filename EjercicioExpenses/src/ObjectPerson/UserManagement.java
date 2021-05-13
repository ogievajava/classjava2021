package ObjectPerson;

import java.util.ArrayList;

	public class UserManagement {
	
		public static void printAllUsers(ArrayList<User> users) {
			System.out.println("Users:");
			for (User UserToPrint : users) {
				System.out.println(UserToPrint);
			}
			System.out.println("\n");
		}

}
