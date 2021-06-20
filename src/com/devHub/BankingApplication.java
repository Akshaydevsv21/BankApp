package com.devHub;

import java.util.Scanner;

class BankController{
	private int customerId;
	private String customerName;
	//private long accountNo;
	//private String account_type;
	private float balance=0;
	private float amount;
	
	public BankController() {
		
	}
	
	

	public void deposit(float amount) {
		this.amount=amount;
		balance+=amount;		
		
	}



	public void withdraw(float amount) {
		this.amount=amount;
		if(balance<=0) {
			System.out.println("Insufficient Balance to Withdraw");
		}
		else if(amount>balance) {
			System.out.println("Insufficient Balance to Withdraw");
		}
		else {
			balance-=amount;
		}
		
	}



	public void checkBalance() {
		System.out.println("Balance:"+balance);
		
	}

}

public class BankingApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankController bk=new BankController();
		System.out.println("***************Welcome to DevBank********************");
		System.out.println();
		System.out.println("Enter your Customer ID:");
		int customerId=sc.nextInt();
		System.out.println("Enter Customer Name:");
		String custName=sc.next();
		System.out.println();
		System.out.println("Hi "+custName);
		int ch=0;
		do {			
			System.out.println("---------------Menu-------------------------");
			System.out.println("1.Deposit"+"\n"+"2.Withdraw"+"\n"+"3.Check Balance"+"\n"+"4.Exit");
			System.out.println("Please Enter your choice");
			ch=sc.nextInt();
			float amount=0;
			System.out.println();
			switch(ch) {
				case 1:System.out.println("Please Enter the Amount to be Deposited:");
					   amount=sc.nextFloat();
					   bk.deposit(amount);
					   break;
				case 2:System.out.println("Please Enter the amount to be Withdrawn:");
					   amount=sc.nextFloat();
					   bk.withdraw(amount);
					   break;
				case 3:bk.checkBalance();
					   break;
				case 4:System.out.println("Exiting from Application...."+"\n"+"Thanks for using our Service");
					   break;
				default:System.out.println("Invalid Option..");
				   		
			}
		}while(ch!=4);
		sc.close();

	}

}
