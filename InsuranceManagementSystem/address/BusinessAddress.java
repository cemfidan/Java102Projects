package address;

public class BusinessAddress implements Address {

	private final int id = 2;
	private String district;
	private String city;
	private String country;

	public BusinessAddress(String district, String city, String country) {
		this.district = district;
		this.city = city;
		this.country = country;
	}

	@Override
	public void showInfo() {
		System.out.println("\n============================\nBusiness Address");
		System.out.println("ID: " + getId() + " | District: " + getDistrict() + " | City: " + getCity() + " | Country: "
				+ getCountry());
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}
}
