Feb 29, 2020
----NoteToSelf: Pin. Always error on retrieving either account number and pin. Ask TA Next week
----Write in excel sheet
----Ask on how to write make file on JAR or create classes itself
OVERALL OBJECTIVE:
Goal: Create a Banking System

Main ()
Goal: Let system know who is the current user
Output: Give a Menu based on user input
Input: Ask user of Number
STEPS:
1. Ask user for a number of what type of user they are 
2. Verify if the user input is valid.
3. If the user chose admin
	1. Ask for the name & pin from the user.
		1. If the user credentials are incorrect,
			1. Ask to retry
			2.Exit and return to menu
		2. If the user input is correct,
			1. Head to admin menu
4. If the user Chose Customer
	1. Open Menu of customer

ADMIN Menu
Goal: List down all available functions of an ADMIN
Output: Menu function as intended by admin
Input: Ask a number from a user
STEPS:
1. Display a list if options for the ADMIN user
2. Ask user of the input from menu
3. Display function for:
	1. If 1: ADD A USER
	2. If 2: DELETE A USER
	3. If 3: LIST ALL THE USERS
	4. if 4: CALCULATE THE SAVINGS ACCOUNT INTEREST GENERATED
	5. if 5: EXIT
	
EXIT Both admin and Customer:
Goal: Return to Type of User Menu
Output: Main Menu
Steps:
1. Return to type of user	

Add a User
GOAL: Add a user to the banking system 
Output: Newly added user to the list
Input: Ask for NAME, TYPE OF ACCOUNT, and PIN
Steps: 
1. Ask for the name of the user 
2. Ask for the account type of the user 
3. Ask for a pin for the user 
4. Add user to the list.
5. Return to the main menu

Delete a User
GOAL: Remove a user from the list
Output: Deleted user from the list
Input: Ask user of whos account he wants to delete
Steps: 
1. Ask user of account number he wants to delete 
2. Check list of accounts to verify if account number is true
3. If no account has been found
		1. Tell user no account matched user input
		2. Return to user input of account number
4. If the user matches an account number provided
		1. Check balance if there is money in the account
			1. If there is money in the account, warn user not to delete the account because of the balance
			2. If money is no money in the account, delete the account
			
Show all Accounts
GOAL: Show all accounts of the account numbers, users, account type, and balance 
OUTPUT: A list of all the accounts
Steps:
1. TRY TO REMEMBER ALGORITHM OF HEAP OF STUDENTS
2. For each user on the list go through it
3. Get the account name
4. Get the account type
	1. If the account type is 1 Say Savings
	2. If the account type is 2 Say Checking
5. 	Get the balance of each user
6. Move to the next person on the list

INTEREST
GOAL: Display the interest accrued by a Savings account
Output: A list of all accounts with interest on their savings account 
STEPS:
1. Scan list of all savings account. Check if account type is 1
2. Get the balance of the user
3. Add interest to the user to the current balance
4. Set this as interest to the current account

CUSTOMER Menu
Goal: List down all available functions of a CUSTOMER
Output: Menu function as intended by customer
Input: Ask a number from a user
STEPS:
1. Display a list if options for the ADMIN user
2. Ask user of the input from menu
3. Display function for:
	1. If 1: GETTING THE CHECKING ACCOUNT BALANCE
	2. If 2: DEPOSIT TO THE CHECKING ACCOUNT
	3. If 3: WITHDRAW FROM THE CHECKING ACCOUNT
	4. if 4: GETTING THE SAVINGS ACCOUNT BALANCE
	5. if 5: DEPOSIT TO THE SAVINGS ACCOUNT
	6. if 6: WITHDRAW FROM THE SAVINGS ACCOUNT
	7. if 7: EXIT
4. If input is wrong, warn user	

SHOW MY ACCOUNT WETHER CHECKING OR SAVINGS
GOAL: DISPLAY BALANCE OF AN ACCOUNT
Output: SHOW THE ACCOUNT BALANCE
INPUT: Ask for User Account Number and Pin
----NoteToSelf: PIN ERROR ON USERS. Getter doesn't scan. Only account number??
STEPS:
1. Ask for the account number from the user
2. Scan list if the account number matches the list
3. If the user account number is correct, display the current balance
4. If the user account number is wrong, say there is no account

DEPOSIT TO ACCOUNT
GOAL: Increase the account balance of an account
Output: New Balance of an account
Input: Float number on how much they want to add
STEPS:
1. Ask for the account number from the user
2. Scan list if the account number matches the list
3. If the user account number is correct,
	1. Ask for input on how much they want to deposit
	2. Add the amount to the account
	3. Successfully deposited the amount
4. If the user account number is wrong, say there is no account

WITHDRAW FROM ACCOUNT
GOAL: Decrease the account balance of an account
Output: New Balance of an account
Input: Float number on how much they want to withdraw
STEPS:
1. Ask for the account number from the user
2. Scan list if the account number matches the list
3. If the user account number is correct,
	1. Ask for input on how much they want to withdraw
	2. Deduct the amount to the account
	3. Successfully withdraw the amount
4. If the user account number is wrong, say there is no account
