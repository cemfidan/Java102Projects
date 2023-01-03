package account;

import java.util.ArrayList;
import java.util.Scanner;

import address.Address;
import insurance.Insurance;

public abstract class Account implements Comparable<Account> {

	private User user;
	private ArrayList<IndividualAcc> individualAccs;
	private ArrayList<EnterpriseAcc> enterpriseAccs;

	private AuthenticationStatus aStatus = AuthenticationStatus.FAIL;
	protected Scanner scanner = new Scanner(System.in);

	public abstract void addPolicy();

	public Account(User user) {
		this.user = user;
	}

	public final void showUserInfo() {
		System.out.println("\nCustomer Information");
		System.out.println("Customer's Name-Surname: " + user.getName() + " " + user.getSurname());
		System.out.println("Customer's job: " + user.getJob());
		System.out.println("Customer's age: " + user.getAge());
		System.out.println("Customer's address: ");
		for (Address address : user.getInsuranceList()) {
			address.showInfo();
		}
		for (Insurance insurance : user.getInsuranceList()) {
			System.out.println("Insurance Type: " + insurance.getName() + "\nPrice: " + insurance.getPrice());
		}
	}

	public void login(String email, String password, Account account) throws InvalidAuthenticationException {
		if (account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)) {
			aStatus = AuthenticationStatus.SUCCESS;
		} else
			throw new InvalidAuthenticationException("Giriş işlemi başarısız.");
	}

	public void addAddress() {
		AddressManager.addAddress(this.user);
	}

	public void deleteAddress() {
		printAddresses();
		System.out.print("The id number of the address you want to delete: ");
		int id = scanner.nextInt();
		AddressManager.deleteAddress(user, id);
	}

	public void printAddresses() {
		for (Address address : user.getAddressList()) {
			address.showAddressInfo();
		}
	}

	public void printInsurances() {
		for (Insurance insurance : user.getInsuranceList()) {
			System.out.println("Insurance Type: " + insurance.getName() + " | Price: " + insurance.getPrice()
					+ " | Date: " + insurance.getDate());
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ArrayList<IndividualAcc> getIndividualAccs() {
		return individualAccs;
	}

	public void setIndividualAccs(ArrayList<IndividualAcc> individualAccs) {
		this.individualAccs = individualAccs;
	}

	public ArrayList<EnterpriseAcc> getEnterpriseAccs() {
		return enterpriseAccs;
	}

	public void setEnterpriseAccs(ArrayList<EnterpriseAcc> enterpriseAccs) {
		this.enterpriseAccs = enterpriseAccs;
	}
}
