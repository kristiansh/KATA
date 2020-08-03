package service;
import java.math.BigDecimal;
import java.util.Date;

import model.Account;
import model.InvalidAmountException;

public class Deposit extends Operation {

	//initializing deposit operation
	@Override
	public void execute(Account account, BigDecimal amount) throws InvalidAmountException {
		account.setMoney(account.getMoney().add(amount));
		this.operationName = "Deposit";
		this.balance = account.getMoney();
		this.amount = amount;
		this.operationDate = new Date(System.currentTimeMillis());
		account.addOperation(this);
		
	}

}
