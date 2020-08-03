package service;
import java.math.BigDecimal;
import java.util.Date;

import model.Account;
import model.InvalidAmountException;

public abstract class Operation {
	//the name of the operation
	String operationName;
	//the date of the execution of the operation
	Date operationDate;
	//the amount involved
	BigDecimal amount;
	//the balance at the end
	BigDecimal balance;
	
	//to be implemented by the various related operations
	public abstract void execute(Account account, BigDecimal amount)  throws InvalidAmountException;
	
	//printing operations
	@Override
	public String toString() {
		return operationName + " at " + operationDate + " amount: " 
	+ amount + " balance: " + balance;
	}
}
