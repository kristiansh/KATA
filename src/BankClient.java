
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
	public void withdraw(float amount) throws Exception {
		Withdrawal withdrawal = new Withdrawal();
		withdrawal.execute(account, amount);
	}

	//depositing money to account
	public void deposit(float amount) throws Exception {
		Deposit deposit = new Deposit();
		deposit.execute(account, amount);
	}

	//printing operations' history
	public void print() throws Exception {
		StatementPrinting statementPrinting = new StatementPrinting();
		statementPrinting.execute(account, 0);
	}
	
	
	
}
