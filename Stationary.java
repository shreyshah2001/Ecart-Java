package defpack;

public class Stationary extends SectionParent implements SectionInterface {
		public Stationary()
		{
			this.items = new String[]{"Classmate Notebook","Apsara Pencil- Pack of 10","Trimax Blue Gell Pen","Canvas Board"};
			this.price = new int[] {100,80,50,1300};
			this.prodtype = "Stationary";
		}
		public void displayMenu(Member m1)
		{
			super.displayMenu(m1);
		}
}
