package defpack;

public class Address {
	String bname;
	String street;
	int pincode;
	String city;
	
	public Address(String bname, String street, int pincode, String city)
	{
		this.bname = bname;
		this.street = street;
		this.pincode = pincode;
		this.city = city;
	}
	public void display()
	{
		System.out.println(bname + "\t" + street);
		System.out.println(city +"-" +pincode);
	}
}
