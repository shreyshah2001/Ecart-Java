package defpack;
import java.util.*;
public class ECart 
{

	
	public static void checkout(Member m1)
	{
		Scanner sc = new Scanner(System.in);
		m1.getCart().viewCart();
		System.out.println("Press enter to generate invoice");
		String c = sc.nextLine();
		m1.paybill();
	}
	
	public static void main(String[] args)
	{
		Register r = new Register();
		Member m1 = null;
		try {
		m1 =r.login();}
		catch(InvalidException e)
		{
			System.out.println("Please enter valid inputs");
			System.exit(0);
		}
		Sections s = new Sections();
		s.displayMenu(m1);
		checkout(m1);
	}
}
