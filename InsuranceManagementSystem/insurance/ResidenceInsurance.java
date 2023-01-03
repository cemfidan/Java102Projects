package insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance {

	public ResidenceInsurance(String type) {
		super("Residence Insurance", new Date());
		calculate(type);
	}
	
	@Override
	public void calculate(String type) {
		double price = 1075.00;
		if(type.toLowerCase().equals("individual")) {
			setPrice(price);
		} else {
			setPrice(price * 0.85);
		}
	}

}
