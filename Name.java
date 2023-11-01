package defpack;

public class Name {
	String fname;
	String lname;
	public Name(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	public void display()
	{
		System.out.println(fname + "\t" + lname);
	}
}

