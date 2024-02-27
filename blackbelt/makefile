all: main

main: bank.o useraccount.o
	g++ bank.o useraccount.o

bank.o: Bank_ATM.cpp
	g++ -c Bank_ATM.cpp

useraccount.o: User_account.h

clean: rm -f *o bank


