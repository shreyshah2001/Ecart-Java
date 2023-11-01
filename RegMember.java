package defpack;

public class RegMember extends Member implements PayInterface {
	public RegMember(String fname, String lname, String email,String bname, String street, int pincode, String city, int phone )
	{
		super(fname,lname,email,bname,street,pincode,city,phone);
		this.delivery_charge = 200;
		this.discount = 0;
	}
	public void paybill()
	{
		super.paybill();
		System.out.println("Delivery Charge = " + delivery_charge);
		System.out.println("Grand_Total = "+(this.total+delivery_charge));
	}
}
