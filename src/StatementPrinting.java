
public class StatementPrinting extends Operation {

	//printing operations done on the bank account
	@Override
	public void execute(Account account, float amount)  throws Exception {
		account.getOperations().forEach(action -> System.out.println(action));
	}

}
