package defpack;
import java.util.*;
public class Member implements PayInterface {

		Name name1;
		int id;
		Address address1;
		int phone_no;
		String email_id;
		double discount;
		int delivery_charge;
		Cart c1;
		double total;
		
		public Member(String fname, String lname, String email,String bname, String street, int pincode, String city, int phone )
		{
			name1 = new Name(fname,lname);
			this.email_id = email;
			this.phone_no = phone;
			address1 = new Address(bname, street, pincode, city);
			c1 = new Cart();
			total = 0;
		}
		public Cart getCart()
		{
			return this.c1;
		}
		
		public void paybill()
		{
			System.out.println("\t Amaze One \t");
			System.out.println("--------------------------------------------");
			System.out.println(new Date());
			display();
			c1.viewCart();
			total = c1.getTotal();
		}
		
		
		public void display()
		{
			name1.display();
//			System.out.println(id);
//			System.out.println(address)
			System.out.println(email_id);
			System.out.println(phone_no);
			address1.display();
		}	

		
		
}


