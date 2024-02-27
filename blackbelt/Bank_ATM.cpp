// Bank_ATM.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <vector>
#include"User_account.h"
using namespace std;

int main()
{
	vector<User_account> myaccount;
	while(true)
	{
		int user;
		cout << "---Select User----" << endl;
		cout << "1.Admin user" << endl;
		cout << "2.Customer user" << endl;
		cin >> user;
		if (user == 1)  // admin user
		{
			int loop2 = 1;
			while (loop2)
			{
				cout << "---Admin operations---" << endl;   // Admin Menu
				cout << "1.Add a user" << endl;
				cout << "2.Delete a user" << endl;
				cout << "3.List all users" << endl;
				cout << "4.Apply interest to all savings accounts" << endl;
				cout << "5.exit" << endl;
				int option;
				cin >> option;
				if (option == 1)
				{
					cout << "Enter account number" << endl;
					int acc;
					cin >> acc;
					cout << "Enter name of the User" << endl;
					string name;
					cin >> name;
					cout << "Enter type of account" << endl;
					int tp, pn;
					cin >> tp;
					cout << "Enter PIN for the user" << endl;
					cin >> pn;
					User_account ua(acc, "abc", pn, tp);
					myaccount.push_back(ua);
				}
				if (option == 2)
				{
					int ac;
					cout << "Enter Accnount number that you want to delete: " << endl;
					cin >> ac;
					auto it = myaccount.begin();
					bool check = true;
					for (; it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == ac)
						{
							myaccount.erase(it);
							cout << "Account has been deleted successfully!" << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 3)
				{
					auto it = myaccount.begin();
					cout << "account_number   user_name    acc_type   Balance" << endl;
					for (; it != myaccount.end(); ++it)
					{
						cout << it->get_account_Number() << "  " << it->get_name() << "  ";
						if (it->get_type() == 1)
						{
							cout << "Saving  ";
						}
						else if (it->get_type() == 2)
						{
							cout << "Checking  ";
						}

					}
				}
				else if (option == 4)
				{
					auto it = myaccount.begin();

					for (; it != myaccount.end(); ++it)
					{
						if (it->get_type() == 1)
						{
							float balance = it->get_balance();
							balance = balance * (1 + 0.2);
							it->set_balance(balance);
						}
					}
				}
				else if (option == 5)
				{
					loop2 = 0;
				}
			}

		}
		else if (user == 2)
		{
			int loop3 = 1;
			while (loop3)
			{
				cout << "---Customer Operations---" << endl;
				cout << "1.Get checking balance" << endl;
				cout << "2.Deposit into checking" << endl;
				cout << "3.Withdraw from checking" << endl;
				cout << "4.Get savings balance" << endl;
				cout << "5.Deposit into savings" << endl;
				cout << "6.Withdraw from savings" << endl;
				cout << "7.exit" << endl;
				int option = 0;
				cin >> option;
				if (option == 1)
				{
					int acc;
					cout << "Enter account number:";
					cin >> acc;
					bool check = true;
					for (auto it = myaccount.begin(); it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == acc)
						{
							cout << "your current balance is:" << it->get_balance() << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 2)
				{
					int acc;
					cout << "Enter account number:";
					cin >> acc;
					bool check = true;
					for (auto it = myaccount.begin(); it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == acc)
						{
							float bal;
							cout << "Enter the balance you want to deposit:";
							cin >> bal;
							it->deposit(bal);
							cout << " amount has been deposited successfully" << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 3)
				{
					int acc;
					cout << "Enter account number:";
					cin >> acc;
					bool check = true;
					for (auto it = myaccount.begin(); it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == acc)
						{
							float bal;
							cout << "Enter the balance you want to withdraw:";
							cin >> bal;
							it->withdraw(bal);
							cout << " amount has been deposited successfully" << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 4)
				{
					int acc;
					cout << "Enter account number:";
					cin >> acc;
					bool check = true;
					for (auto it = myaccount.begin(); it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == acc)
						{
							cout << "your current balance is:" << it->get_balance() << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 5)
				{
					int acc;
					cout << "Enter account number:";
					cin >> acc;
					bool check = true;
					for (auto it = myaccount.begin(); it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == acc)
						{
							float bal;
							cout << "Enter the balance you want to deposit:";
							cin >> bal;
							it->deposit(bal);
							cout << " ammount has been deposited successfuly" << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 6)
				{
					int acc;
					cout << "Enter account number:";
					cin >> acc;
					bool check = true;
					for (auto it = myaccount.begin(); it != myaccount.end(); ++it)
					{
						if (it->get_account_Number() == acc)
						{
							float bal;
							cout << "Enter the balance you want to withdraw:";
							cin >> bal;
							it->withdraw(bal);
							cout << "amount has been deposited successfully" << endl;
							check = false;
							break;
						}
					}
					if (check)
					{
						cout << "Account number did not match!" << endl;
					}
				}
				else if (option == 7)
				{
					loop3 = 0;
				}
			}
		}
		else
		{
			cout << "You have entered the wrong option" << endl;
			break;
		}
	}
return 0;
}
