import java.util.List;

import com.oops.abstraction.AbstractAccount;
import com.oops.abstraction.interfaceExample.BankService;
import com.oops.abstraction.interfaceExample.BankServiceImpl;
import com.util.StringConstant;

public class App {

	public static void main(String... str) {
/*
		Account johnAccount = new Account();

		johnAccount.deposit(100);
		System.out.println("Check Balance: " + johnAccount.checkBalance());

		// What ??
		// johnAccount.amount = 50;

		johnAccount.withDraw(10);
		System.out.println("Check Balance: " + johnAccount.checkBalance());*/
		
		
		
		
		/*AbstractAccount johnAccount = new SavingAccount("John", 1000, 1232322);
		
		System.out.println("Check balance: "+johnAccount.checkBalance());
		double amount = johnAccount.calculateAnnualInterest();
		johnAccount.deposit(amount);
		System.out.println("Check balance: "+johnAccount.checkBalance());*/
		
		BankService bankService = new BankServiceImpl();
		bankService.createAccount(StringConstant.SAVING_ACCOUNT, "John", 1000, 12345);
		
		bankService.withDrawAmount(12345, 40);
		
		System.out.println("Balance: "+bankService.checkBalance(12345));
		
		
	}
}
