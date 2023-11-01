package defpack;

public class Technology extends SectionParent implements SectionInterface {
		public Technology()
		{
			this.items = new String[]{"Dell 15.6 i3-112u","Asus 14 i5-1221G"};
			this.price = new int[] {60000,84000};
			this.prodtype = "Technology";
		}
		public void displayMenu(Member m1)
		{
			super.displayMenu(m1);
		}
}
