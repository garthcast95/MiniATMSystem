
public class User {
	
	private Account acc; // Account class composition
	private String name;
	
	public User(String name,Account a)   // constructor
	{
		this.name=name;
		this.acc=a;
	}
	//------------------------------ getter setters ------------------
	public Account get_Account()
	{
		return acc;
	}
	public String get_name()
	{
		return name;
	}
	public void set_Account(Account a)
	{
		this.acc=a;
	}
	public void set_name(String n)
	{
		this.name=n;
	}
}
