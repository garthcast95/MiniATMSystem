import java.util.*;


public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);// to take user input
		ArrayList<User> Users=new ArrayList<User>();   // a list of users
		while(true)
		{
			int user;
			// ---------------------------------------- selection between users
			System.out.println( "---Select User----");
			System.out.println  ("1.Admin user" );
			System.out.println  ("2.Customer user");
			user=sc.nextInt(); // input from the  users.
			if (user == 1)  // admin user
			{
				boolean loop1=true;
				boolean loop2 = true;
				while(loop1) //------------------------ loop to verified the admin login
				{
					String name;
					int pass;
					System.out.println("---Admin Login---");
					System.out.println("Enter Name:");
					name=sc.next();
					System.out.println("Enter Password:")  ;
					pass=sc.nextInt();
					if(name.equals("admin") && pass==12345) //------- verifing the admin access
					{
						loop1=false;
					}
					else   //------------- if information won't match
					{
						System.out.println("Information mismatch!");
						while(true)
						{

							System.out.println("1.to Retry \n0.To exit!");
							int op;
							op=sc.nextInt();
							if(op==0)
							{
								loop1=false;
								loop2=false;
								break;
							}
							else if(op==1)
							{
								break;
							}
							else
							{
								System.out.println("You hava entered wrong option!");
							}
						}
					}
				}
		//--------------------------------- loop for the admin account operations.
				while (loop2)
				{
					System.out.println  ("---Admin operations---");    // Admin Menu
					System.out.println  ("1.Add a user");
					System.out.println  ("2.Delete a user")  ;
					System.out.println  ("3.List all users")  ;
					System.out.println  ("4.Apply interest to all savings accounts");
					System.out.println  ("5.exit" ) ;
					int option;
					option = sc.nextInt();
					if (option == 1)     // option 1 for add user in  the list of the users.
					{
						//---------------------------------------getting information about the users---------------
						System.out.println  ("Enter name of the User" ) ;
						String name;
						name=sc.next();
						System.out.println  ("Enter type of account")  ;
						int tp, pn;
						tp=sc.nextInt();
						System.out.println  ("Enter PIN for the user" ) ;
						pn=sc.nextInt();
						Account temp_ac=new Account(pn,tp,0.0);    // creating an account for this new user
						User us=new User(name,temp_ac);     // now create a new with new account
						Users.add(us);   // adding this user to the list
					}
					if (option == 2)   // deleting an user from the list
					{
						int ac;
						System.out.println ( "Enter Accnount number that you want to delete: " ) ;
						ac=sc.nextInt();
						int it=0;
						boolean check = true;
						for (; it<Users.size(); ++it)   // iterate over the list of the user
						{
							if (Users.get(it).get_Account().get_Account_number()==ac) // if account number matches with the any user in the list
							{
								if(Users.get(it).get_Account().get_balance()<=0)    // checking that account balance less than or equal to 0
								{
								    Users.remove(it);  // removing the user from the list
									System.out.println  ("Account has been deleted successfully!" ) ;
									check = false;
									break;    // now break the loop our work has done
								}
								else // if account balance is greater the 0
								{	// so can't delete the account.

									System.out.println  ("Account can not be deleted because it contains some balance" );
									check = false;
									break;
								}
							}
						}
						if (check) // if account did not match withe the list of the account of the users
						{
							System.out.println("Account number did not match!")  ;
						}
					}
					else if (option == 3)  // this option will show the list of the accounts  of the users.
					{
						int it=0;
						System.out.println("account_number	user_name	acc_type	Balance")  ;
						for (; it<Users.size(); ++it)
						{
							Account ac1=Users.get(it).get_Account();
							System.out.print(ac1.get_Account_number()+ "	"+ Users.get(it).get_name() +"	");
							if (ac1.get_type() == 1)
							{
								System.out.print( "Saving	");
							}
							else if (Users.get(it).get_Account().get_type() == 2)
							{
								System.out.println  ("Checking  ");
							}
							System.out.println(ac1.get_balance());


						}
					}
					else if (option == 4) // this option is use to calculate the interest for the saving accounts.
					{
						int it=0;
						for (; it<Users.size(); ++it)
						{
							if (Users.get(it).get_Account().get_type() == 1)
							{
								double balance = Users.get(it).get_Account().get_balance();
								balance = balance * (1 + 0.2);       // adding interest in the current balance of the each saving account
								Users.get(it).get_Account().set_balance(balance);
							}
						}
					}
					else if (option == 5) // option is use to exit from the Admin menu
					{
						loop2 = false;
					}
				}

			}
			else if (user == 2) // this is the Customer user menu
			{
				boolean loop3 = true;
				while (loop3) // loop over the customer operation according to user input
				{
					System.out.println ( "---Customer Operations---")  ;
					System.out.println  ("1.Get checking balance"  );
					System.out.println  ("2.Deposit into checking" ) ;
					System.out.println  ("3.Withdraw from checking")  ;
					System.out.println  ("4.Get savings balance"  );
					System.out.println  ("5.Deposit into savings" ) ;
					System.out.println  ("6.Withdraw from savings")  ;
					System.out.println  ("7.exit")  ;
					int option = 0;
					option =sc.nextInt() ;
					if (option == 1)   // use to check the balance
					{
						int acc;
						System.out.println  ("Enter account number:");
						acc=sc.nextInt();
						boolean check = true;
						int it=0;
						for (; it<Users.size(); ++it) // loop over all the user and try to find the inputed account number
						{
							if (Users.get(it).get_Account().get_Account_number() == acc)
							{
								System.out.println ("Your current balance is:"+Users.get(it).get_Account().get_balance());
								check = false;
								break;
							}
						}
						if (check) // if account does not match
						{
							System.out.println  ("Account number did not match!" ) ;
						}
					}
					else if (option == 2)  // option used to deposit amount in the account
					{
						int acc;
						System.out.println  ("Enter account number:");
						acc=sc.nextInt();
						boolean check = true;
						int it=0;
						for (; it<Users.size(); ++it) // loop over all the user and try to find the inputed account number
						{
							if (Users.get(it).get_Account().get_Account_number() == acc)
							{
								float bal;
								System.out.println  ("Enter the balance you want to deposit:");
								bal=sc.nextInt();
								Users.get(it).get_Account().deposit(bal); // deposite function
								System.out.println("Ammount has been deposited successfuly" ) ;
								check = false;
								break;
							}
						}
						if (check) // if account does not match
						{
							System.out.println ( "Account number did not match!")  ;
						}
					}
					else if (option == 3)    // this will withdraw the balance from the user account
					{
						int acc;
						System.out.println ( "Enter account number:");
						acc = sc.nextInt()  ;
						boolean check = true;
						int it=0;
						for (; it<Users.size(); ++it) // iterate over the list of the user to check the account number.
						{
							if (Users.get(it).get_Account().get_Account_number() == acc)
							{
								float bal;
								System.out.println ( "Enter the balance you want to withdraw:");
								bal = sc.nextInt();
								Users.get(it).get_Account().withdraw(bal); // calling withrawal function
								check = false;
								break;
							}
						}
						if (check) // if account does not match
						{
							System.out.println ( "Account number did not match!" ) ;
						}
					}
					else if (option == 4)  // option to check the balance of the account
					{
						int acc;
						System.out.println  ("Enter account number:");
						acc=sc.nextInt() ;
						boolean check = true;
						int it=0;
						for (; it<Users.size(); ++it)  // iterate over the list of the user to check the account number.
						{
							if (Users.get(it).get_Account().get_Account_number() == acc)
							{
								System.out.println  ("your current balance is:"+ Users.get(it).get_Account().get_balance());
								check = false;
								break;
							}
						}
						if (check) // if account does not match
						{
							System.out.println ( "Account number did not match!" ) ;
						}
					}
					else if (option == 5)  // option to deposit the amount
					{
						int acc;
						System.out.println ( "Enter account number:");
						acc=sc.nextInt()  ;
						boolean check = true;
						int it=0;
						for (; it<Users.size(); ++it)// iterate over the list of the user to check the account number.
						{
							if (Users.get(it).get_Account().get_Account_number() == acc)
							{
								float bal;
								System.out.println ( "Enter the balance you want to deposit:");
								bal=sc.nextInt()  ;
								Users.get(it).get_Account().deposit(bal);
								System.out.println  (" ammount has been deposited successfuly" ) ;
								check = false;
								break;
							}
						}
						if (check) // if account does not match
						{
							System.out.println  ("Account number did not match!" ) ;
						}
					}
					else if (option == 6)     // option to withdraw the amount
					{
						int acc;
						System.out.println  ("Enter account number:");
						acc=sc.nextInt();
						boolean check = true;
						int it=0;
						for (; it<Users.size(); ++it) // iterate over the list of the user to check the account number.
						{
							if (Users.get(it).get_Account().get_Account_number() == acc)
							{
								float bal;
								System.out.println( "Enter the balance you want to withdraw:");
								bal=sc.nextInt();
								Users.get(it).get_Account().withdraw(bal);  // balance withrawal function call
								check = false;
								break;
							}
						}
						if (check) // if account does not match
						{
							System.out.println("Account number did not match!");
						}
					}
					else if (option == 7)  // exit option from customer user mode
					{
						loop3 = false;
					}
				}
			}
			else
			{
				System.out.println("You have entered the wrong option");   // if choose wrong user type
				break;
			}
		}
	}
}
