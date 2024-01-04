// Main Class Of The Bank

package Bank_Project;

import java.util.Scanner;

public class Main_Bank {

	public static void main(String[] args) {
		Bank_Account obj = new Bank_Account();
		obj.account_creation();
		obj.show_menu();
		Scanner sc = new Scanner(System.in);
		int option;
		
		
		do {
			System.out.println("\n");
			System.out.println("---------------------------");
			System.out.println("Please Enter Your Option :");
			System.out.println("---------------------------");
			System.out.println("\n");
			option = sc.nextInt();
		
		switch(option)
		{
		
		case 1 : obj.Deposite(option);
		break;
		
		case 2 : obj.Withdraw(option);
		break;
		
		case 3 : obj.Transfer_Money(option);
		break;
		
		case 4 : obj.total_balance();
		break;
		
		case 5 :
				System.out.println("--------------------------------------");
				System.out.println("!..Thank You For Using Our Services..!");
			
				
		break;
		
		default:
		
			System.err.println("Please Select Valid Option..!");
		}
		}
		while(option != 5);
		System.out.println("            !...Bye...!");
		System.out.println("--------------------------------------");
		}
	}
		
		
		
		
		

