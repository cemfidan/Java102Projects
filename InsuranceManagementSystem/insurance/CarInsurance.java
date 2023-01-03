package insurance;

import java.util.Date;

public class CarInsurance extends Insurance {

	public CarInsurance(String type) {
		super("Car Insurance", new Date());
		calculate(type);
	}

	@Override
	public void calculate(String type) {
		double price = 865.00;
		if(type.toLowerCase().equals("individual")) {
			setPrice(price);
		} else {
			setPrice(price * 0.85);
		}
	}
}
