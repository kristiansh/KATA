package service;
import java.math.BigDecimal;

import model.Account;
import model.InvalidAmountException;

public class StatementPrinting extends Operation {

	//printing operations done on the bank account
	@Override
	public void execute(Account account, BigDecimal amount)  throws InvalidAmountException {
		account.getOperations().forEach(action -> System.out.println(action));
	}

}
