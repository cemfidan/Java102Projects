package address;

public class HomeAddress implements Address{

	private final int id = 1;
	private String district;
	private String city;
	private String country;
	
	public HomeAddress(String district, String city, String country) {
		super();
		this.district = district;
		this.city = city;
		this.country = country;
	}

	@Override
	public void showInfo() {
		System.out.println("\n============================\nHome Address");
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
