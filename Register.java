package defpack;

import java.util.Scanner;

public class Register {
	public Member login() throws InvalidException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Amaze One");
		System.out.println("-----------------------");
		System.out.println("Enter First Name");
		String fname = sc.next();
		System.out.println("Enter Last Name");
		String lname = sc.next();
		System.out.println("Enter email id");
		String email = sc.next();
		System.out.println("Enter phone number");
		int phone = -1;
		try
		{
			phone = sc.nextInt();
		}
		catch(Exception e)
		{
			throw new InvalidException("Enter valid mobile number");
		}
		System.out.println("Enter bname");
		String bname = sc.next();
		System.out.println("Enter street");
		String street =sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		System.out.println("Enter pincode");
		int pincode = -1;
		try
		{
			pincode = sc.nextInt();
		}
		catch(Exception e)
		{
			throw new InvalidException("Enter valid pincode");
		}
		System.out.println("Opt in for Prime Membership (Y/N)?");
		String choice = sc.next().toLowerCase();
		if(choice.equals("y"))
			return new PrimeMember(fname,lname,email,bname,street,pincode,city,phone);
		else
			return new RegMember(fname,lname,email,bname,street,pincode,city,phone);
	
	}
}
