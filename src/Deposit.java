import java.util.Date;

public class Deposit extends Operation {

	//initializing deposit operation
	@Override
	public void execute(Account account, float amount) throws Exception {
		account.setMoney(account.getMoney() + amount);
		this.operationName = "Deposit";
		this.balance = account.getMoney();
		this.amount = amount;
		this.operationDate = new Date(System.currentTimeMillis());
		account.addOperation(this);
		
	}

}
