package account;

import java.util.Scanner;

public class AccountHelper {

	private Scanner scanner = new Scanner(System.in);
	
	User user;
	Account account;
	
	public void login() {
		System.out.println("===== I N S U R A N C E  M A N A G E M E N T  S Y S T E M =====");
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Password: ");
		String password = scanner.nextLine();
	
	}
	
}
