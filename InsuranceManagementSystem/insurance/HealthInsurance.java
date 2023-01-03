package insurance;

import java.util.Date;

public class HealthInsurance extends Insurance {

	public HealthInsurance(String type) {
		super("Health Insurance", new Date());
		calculate(type);
	}
	
	@Override
	public void calculate(String type) {
		double price = 1025.00;
		if(type.toLowerCase().equals("individual")) {
			setPrice(price);
		} else {
			setPrice(price * 0.85);
		}
	}

}
