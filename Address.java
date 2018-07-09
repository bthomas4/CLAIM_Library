package library;

public class Address {
	
//Properties-----------------------------------------------------------------------------------------
	private String city;
	private String zip;
	private String street;
	private String state;

	
//Constructors---------------------------------------------------------------------------------------
	Address(String street, String city, String state, String zip) {
	this.street = street;
	this.city = city;
	this.state = state;
	this.zip = zip; }

	
//Methods--------------------------------------------------------------------------------------------
	
	
//To String------------------------------------------------------------------------------------------
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + ", street=" + street + ", state=" + state + "]"; }

	
//Getters and Setters--------------------------------------------------------------------------------
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}	
	
}
