package Bank_Project;

import java.util.Scanner;

public class Bank_Account {
	Scanner sc = new Scanner(System.in);

	void account_creation() /*This Function Is For Creating Users Acount*/
	{	
		String Name;
		String Mobile_Number;
		System.out.println("  -------------!..State Bank Of India..!-------------");
		System.out.println("\n");
		System.out.println("   $..Welcome To The Process Of Account Creation..$ ");
		System.out.println("\n");
		System.out.println("_...Enter The Following Details For Creating Account..._");
		System.out.println("\n");
		System.out.println("Please Enter Your Name : ");
		Name = sc.next();
		System.out.println("Please Enter Your Mobile Number : ");
		Mobile_Number = sc.next();
		System.out.println("\n");
		System.out.println("      !--------Welcome "+ Name +"--------!");
		System.out.println("\n");
		System.out.println("!....Your Account Is Created Successfully....!");
		System.out.println("  !..Your Account Number Is : ********336..!");
	}
	
	int balance;
	void Deposite(int amount)
	{	
		
		System.out.println("Enter Amount For Deposite : ");
		
		amount = sc.nextInt();
		if(amount !=0)
		{
		balance = balance + amount;
		//System.out.println("Now Your Total Balance Is : "+balance);
		System.out.println("Money Is Deposited To Your Account....!");
		}
		else
		{
			System.err.println("Please Enter Valid Amount...!");
		}
	}
	
	void Withdraw(int amount)
	{	
		System.out.println("Enter Amount For Withdraw : ");
		amount = sc.nextInt();
		if(amount != 0)
		{
		balance = balance - amount;
		System.out.println("Money Is Withdrawed From Your Account...!");
		System.out.println("Now Your Total Balance Is : "+balance+"Rs.");
		}
		else
		{
			System.err.println("Please Enter Valid Amount...!");
		}
	}
	
	void Transfer_Money(int amount)
	{	
		int acc_num;
		int ifsc;
		System.out.println("-------------------------------------------------");
		System.out.println("Money Transfer Process Is Started..!");
		System.out.println("Enter Account Number : ");
		acc_num = sc.nextInt();
		System.out.println("Enter IFSC Code : ");
		ifsc = sc.nextInt();
		System.out.println("Enter Amount For Transfer : ");
		amount = sc.nextInt();
		System.out.println("Amount Is Transfered.....!");
		
		if(amount!=0)
		{
			balance = balance-amount;
			System.out.println("After Transfering Money Your Total Amount : "+balance+"Rs.");
			System.out.println("-------------------------------------------------");
		}
		else
		{
			System.err.println("Please Enter Valid Amount...!");
		}
		
	}
	
	void total_balance()
	{
		System.out.println("*** Total Balance Is : "+balance+"Rs. ***");
	}
	
	void show_menu()
	{	
		System.out.println("\n");
		System.out.println("!...Welcome To State Bank Of India...!");
		System.out.println("\n");
		System.out.println("!...Here Is Our Options...!");
		System.out.println("----------------------------");
		System.out.println("1)Deposite Amount");
		System.out.println("2)WithDraw Amount");
		System.out.println("3)Transfer Amount");
		System.out.println("4)My Total Balance");
		System.out.println("5)EXIT");
		System.out.println("----------------------------");
		
	}

}

