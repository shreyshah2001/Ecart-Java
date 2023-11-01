package defpack;

public class Clothes extends SectionParent implements SectionInterface {
		public Clothes()
		{
			this.items = new String[]{"US Polo Red Shirt","Black Jeans","Blue Jeans","Gucci Belt"};
			this.price = new int[] {1000,800,950,1300};
			this.prodtype = "Clothes";
		}
		public void displayMenu(Member m1)
		{
			super.displayMenu(m1);
		}
}
