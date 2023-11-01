package defpack;
import java.util.*;
public class SectionParent {
	String items[];
	int price[];
	String prodtype;
	public void displayMenu(Member m1) {
		System.out.println("Type - " + prodtype);
		for(int i =0;i<this.items.length;i++)
		{
			System.out.println((i+1)+"\t"+this.items[i] + "\t Rs."+this.price[i]);
		}
		System.out.println("Enter 0 to go back");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c!=0)
		{
			m1.getCart().addItem(items[c-1],price[c-1]);
		}
	}
}
