package address;

import java.util.Scanner;

import account.User;

public class AddressManager {

	User user;
	Address address;
	Scanner scanner = new Scanner(System.in);
	
	public void add(User user) {
		System.out.println("\n==========================\nAdding Address");
		System.out.println("Home Address ID = 1\n"
				+ "Business Address ID = 2");
		System.out.print("Your choice: ");
		int select = scanner.nextInt();
		
		System.out.print("District: ");
        String district = scanner.next();
        System.out.print("City: ");
        String city = scanner.next();
        scanner.nextLine();
        System.out.print("Country: ");
        String country = scanner.nextLine();
        
        switch(select) {
	        case 1:
	        	address = new HomeAddress(district, city, country);
	        	user.setHomeAddressList(address);
	        	System.out.println("Address added");
	        	break;
	        case 2:
	        	address = new BusinessAddress(district, city, country);
	        	user.setBuinessAddressList(address);
	        	System.out.println("Address added");
	        	break;
	        default:
	        	address = new HomeAddress(district, city, country);
	        	user.setHomeAddressList(address);
	        	System.out.println("Default value: Home Address added");
	        	break;
        }
	}
	
	public static void delete(User user, int id) {
		if(id == 1) {
			user.getHomeAddressList().remove(id - 1);
			System.out.println("Address deleted");
		} else if (id == 2) {
			user.getBuinessAddressList().remove(id - 1);
			System.out.println("Address deleted");
		} else {
			System.out.println("Invalid entry");
		}
	}
	
}
