package account;

import java.util.ArrayList;
import java.util.Date;

import address.Address;
import address.BusinessAddress;
import address.HomeAddress;
import insurance.Insurance;

public class User {

	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String job;
	private String membership;
	private int age;
	private Address address;
	private Date date;
	private Insurance insurance;
	private ArrayList<Address> addressList = new ArrayList<>();
	private ArrayList<Insurance> insuranceList = new ArrayList<>();

	public User() {
	}

	public User(String name, String surname, String email, String password, String job, String membership, int age,
			Address address) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.job = job;
		this.membership = membership;
		this.age = age;
		this.address = address;
		this.addressList.add(address);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public ArrayList<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}

	public ArrayList<Insurance> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(ArrayList<Insurance> insuranceList) {
		this.insuranceList = insuranceList;
	}
}
