package defpack;
import java.util.*;
public class Cart {
	String item_name[];
	int price[];
	int index;
	double total;
	public Cart() {
		this.item_name = new String[100];
		this.price = new int[100];
		this.index = 0;
		this.total = 0;
	}
	
	public void viewCart()
	{
		this.total = 0;
		for(int i =0;i<this.index;i++)
		{
			System.out.println((i+1)+"\t"+item_name[i]+"\t"+price[i]);
			total = total + price[i];
		}
		System.out.println("Total = " + total);
	}
	public void addItem(String name, int price)
	{
		this.item_name[index] = name;
		this.price[index] = price;
		index ++;
	}
	public double getTotal() {
		return total;
	}
}
