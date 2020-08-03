package service;
import java.math.BigDecimal;
import java.util.Date;

import model.Account;
import model.InvalidAmountException;

public class Withdrawal extends Operation {

	//initializing withdrawal operation
	@Override
	public void execute(Account account, BigDecimal amount) throws InvalidAmountException {
		//checking if there's enough money
		if (account.getMoney().subtract(amount).compareTo(new BigDecimal(0)) < 0) {
			throw new InvalidAmountException("Not enough money!");
		} else {
			account.setMoney(account.getMoney().subtract(amount));
			this.operationName = "Withdrawal";
			this.balance = account.getMoney();
			this.amount = amount;
			this.operationDate = new Date(System.currentTimeMillis());
			account.addOperation(this);
		}
	}

}
