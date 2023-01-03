package insurance;

import java.util.Date;

public class TravelInsurance extends Insurance {

	public TravelInsurance(String type) {
		super("Travel Insurance", new Date());
		calculate(type);
	}
	
	@Override
	public void calculate(String type) {
		double price = 585.00;
		if(type.toLowerCase().equals("individual")) {
			setPrice(price);
		} else {
			setPrice(price * 0.85);
		}
	}

}
