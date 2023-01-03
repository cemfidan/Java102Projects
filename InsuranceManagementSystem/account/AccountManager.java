package account;

import java.util.Scanner;
import java.util.TreeSet;

import address.Address;
import address.HomeAddress;

public class AccountManager {
	
	TreeSet<Account> users = new TreeSet<>();

    public void addUsers() throws ClassCastException {
        Address address = new HomeAddress("İstanbul", "Üsküdar", "Leylak Sokak", "Ata 2 sitesi leylak sokak Üsküdar İstanbul");
        User user1 = new User("Kaan", "Şenel", "tufankaansenel@gmail.com", "123", "işsiz", 23, address, "Individual");
        Account account = new IndividualAcc(user1);
        users.add(account);
    }

    public Account login(String email, String password) {
        addUsers();
        try {
            for (Account acc : users) {
                if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                    acc.login(email, password, acc);
                    return acc;
                }
            }
            throw new InvalidAuthenticationException("Şifre veya email yanlış girildi!");

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
