package insurance;

import java.util.Date;
import account.User;

public abstract class Insurance {

	private User user;
	private String name;
	private double price;
	private Date date;
	
	public Insurance() {}

	public Insurance(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public abstract void calculate(String type);

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
