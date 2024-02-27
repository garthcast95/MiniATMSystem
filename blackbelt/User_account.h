#pragma once
#include<iostream>
#include<string>
using namespace std;
class User_account
{

private:
	int account_number;
	string name;
	int PIN;
	int type;
	float balance;
public:
	User_account(int a,string n, int p,int t)
	{	
		account_number = a;
		name = n;
		PIN = p;
		type = t;
		balance = 0;
	}
	int get_account_Number()
	{
		return account_number;
	}
	string get_name()
	{
		return name;
	}
	int get_PIN()
	{
		return PIN;
	}
	int get_type()
	{
		return type;
	}
	float get_balance()
	{
		return balance;
	}
	void set_account_number(int a)
	{
		account_number = a;
	}
	void set_name(string n)
	{
		name = n;
	}
	void set_PIN( int p)
	{
		PIN = p;
	}
	void set_type(int t)
	{
		type = t;
	}
	void deposit(float bal)
	{
		balance += bal;
	}
	void set_balance(float bal)
	{
		balance = bal;
	}
	void withdraw(float bal)
	{
		if (bal <= balance)
		{
			balance -= bal;
			cout << "Your balance has been Successfully withdrawn!" << endl;
		}
		else
		{
			cout << "Account balance is less!" << endl;
		}
	}


};