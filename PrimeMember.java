package defpack;

public class PrimeMember extends Member implements PayInterface {
	public PrimeMember(String fname, String lname, String email,String bname, String street, int pincode, String city, int phone )
	{
		super(fname,lname,email,bname,street,pincode,city,phone);
		this.delivery_charge = 0;
		this.discount = 5;
	}
	public void paybill()
	{
		super.paybill();
		double disc = total * (discount/100);
		System.out.println("Discount @ 5% = "+ disc);
		System.out.println("Grand Total = " + (total - disc));
	}
}
