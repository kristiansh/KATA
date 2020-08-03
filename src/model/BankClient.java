package model;

import java.math.BigDecimal;

import service.Deposit;
import service.StatementPrinting;
import service.Withdrawal;

public class BankClient {
	private Account account;

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//withdrawing money from account
	public void withdraw(BigDecimal amount) throws InvalidAmountException {
		Withdrawal withdrawal = new Withdrawal();
		withdrawal.execute(account, amount);
	}

	//depositing money to account
	public void deposit(BigDecimal amount) throws InvalidAmountException {
		Deposit deposit = new Deposit();
		deposit.execute(account, amount);
	}

	//printing operations' history
	public void print() throws InvalidAmountException {
		StatementPrinting statementPrinting = new StatementPrinting();
		statementPrinting.execute(account, new BigDecimal(0));
	}
	
	
	
}
