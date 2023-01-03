package account;

import java.util.Scanner;

public class LoginInfo {

	private AccountManager aManager;
	Scanner scanner = new Scanner(System.in);

	public void run() {
		while (true) {
			System.out.println("\n========================\nINSURANCE MANAGEMENT SYSTEM\n");
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Password: ");
			String password = scanner.nextLine();
			Account loginAccount = aManager.login(email, password);
			if (loginAccount != null) {
				loginAccount.showUserInfo();
				login(loginAccount);
			} else
				System.out.println("Invalid user");
		}
	}

	private void login(Account account) {
		while (true) {
			System.out.println("\n======================Menu\n");
			System.out.println("1- Show user info\n" + "2- Add insurance\n" + "3- Add address\n" + "4- Delete address\n"
					+ "0- Log out");
			System.out.print("Your choice: ");
			int select = scanner.nextInt();
			switch (select) {
				case 0:
					System.exit(0);
				case 1:
					account.showUserInfo();
					break;
				case 2:
					account.addPolicy();
					break;
				case 3:
					account.addAddress();
					break;
				case 4:
					account.deleteAddress();
					break;
			}
		}
	}
}
