package defpack;
import java.util.*;
public class Sections implements SectionInterface {
	String s_arr[];
	public Sections()
	{
		s_arr = new String[]{"Clothes","Technology","Stationary"};
	}
	public void displayMenu(Member m1)
	{
		while(true) {
		for(int i =0;i<s_arr.length;i++)
		{
			System.out.println((i+1)+"\t"+s_arr[i]);
		}
		System.out.println("Enter 0 to viewcart");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int flag = 0;
		SectionParent s;
		switch(c)
		{
		case 0:flag = 1;
		break;
		case 1: s = new Clothes();
		s.displayMenu(m1);
		break;
		case 2:s = new Technology();
		s.displayMenu(m1);
		break;
		case 3: s = new Stationary();
		s.displayMenu(m1);
		break;
		default:System.out.println("Enter Valid choice");
		break;
		}
		if(flag==1)
			break;
		}
	}
}
