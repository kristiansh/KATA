import java.util.Date;

public class Withdrawal extends Operation {

	//initializing withdrawal operation
	@Override
	public void execute(Account account, float amount) throws Exception {
		//checking if there's enough money
		if (account.getMoney() - amount < 0) {
			throw new Exception("Not enough money!");
		} else {
			account.setMoney(account.getMoney() - amount);
			this.operationName = "Withdrawal";
			this.balance = account.getMoney();
			this.amount = amount;
			this.operationDate = new Date(System.currentTimeMillis());
			account.addOperation(this);
		}
	}

}
