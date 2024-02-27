
public class Account {

	private static int Acc_number=9009;  // static data member increase by 1 every time when a new object is created
	private double balance; 
	private int pin;
	int type; // 1.saving, 2.checking
	public Account(int pin,int type, double b) // constructor
	{
		Acc_number++;  // auto increase in the account number
		this.pin=pin;
		this.type=type;
		balance=b;	
	}
	public Account(Account ac ) // copy constructor
	{
		this.Acc_number=ac.Acc_number;
		this.balance=ac.balance;
		this.pin=ac.pin;
		this.type=ac.type;
	}
	//------------------------------ below are the getter and setters---------
	public int get_Account_number()
	{	
		return Acc_number;
	}
	public double get_balance()
	{
		return balance;
	}
	public int get_Pin()
	{
		return pin;
	}
	public int get_type()  
	{	
		return type;
	}
	public void set_Account_numnber(int ac)
	{
		Acc_number=ac;
	}
	public void set_PIN(int p)
	{
		pin=p;
	}
	public void set_balance(double b)
	{
		balance=b;
	}
	public void set_type(int t)
	{
		type=t;
	}
	//------------------------------- functionality of deposit and withdraw amount
	public void deposit(float bal)
	{
		balance += bal;
	}
	public void withdraw(float bal)
	{
		if (bal <= balance)
		{
			balance -= bal;
			System.out.println("Your balance has been Successfully withdrawn!"); 
		}
		else
		{
			System.out.println("Account balance is less!"); 
		}
	}
};
